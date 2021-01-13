package Day9;
// TODAY IS DECEMBER 19th 2020
// !!!!!!!!   SVETI NIKOLA   !!!!!!!!!!

import Utility.DB_Utility;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Country;
import testbase.HR_ORDS_TestBase;
import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class ORDS_API_DB_PracticeTest extends HR_ORDS_TestBase {

    @DisplayName("GET/ countries/{country_id} Compare Result with DB")
    @Test
    public void testResponseMatchDatabaseData(){

        String myCountryID = "AR";
        //send request to /countries/{country_id} for AR
        //save result as Country POJO
        Country arPOJO =  given()
                                 .pathParam("country_id",myCountryID )
                                 .log().ifValidationFails(). // we put log() always so we can see in response what went wrong eventually
                          when()
                                 .get("/countries/{country_id}").prettyPeek()
                                 .as(Country.class);

        //here is shorter way of above code
        //Country arPOJO1 = get("/countries/{country_id}", myCountryID).as(Country.class);  // the same as above

        System.out.println("arPOJO = " + arPOJO);


        //now with database

        String query = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID = '" +myCountryID+ "'  ";
        System.out.println("query = " + query);
        DB_Utility.runQuery(query);
        Map<String,String> dbResultMap = DB_Utility.getRowMap(1);

        //now start validation the actual response to expected result from database
        assertThat(arPOJO.getCountry_id(),  is(dbResultMap.get("COUNTRY_ID")));
        assertThat(arPOJO.getCountry_name(), is(dbResultMap.get("COUNTRY_NAME")));
        //save region_id from the map as number
        int expectedRegionId =Integer.parseInt( dbResultMap.get("REGION_ID"));
        assertThat(arPOJO.getRegion_id(), equalTo(expectedRegionId));

    }


    @DisplayName("GET/ countries/Capture All CountryID and Compare Result with DB")
    @Test
    public void testResponseAllCountryIDsMatchDatabaseData() {

        List<String> allCountriesIds = get("/countries").jsonPath().getList("items.country_id");
        allCountriesIds.forEach(System.out::println);

        DB_Utility.runQuery("SELECT * FROM COUNTRIES");
        List<String> expectedListFromDB = DB_Utility.getColumnDataAsList("COUNTRY_ID");
        expectedListFromDB.forEach(System.out::println);

        //assert both list has same information
        assertThat(allCountriesIds, equalTo(expectedListFromDB));

    }

}
