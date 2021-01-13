package Day8;

import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.*;
import pojo.BookCategory;
import pojo.Country;
import pojo.Region;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import testbase.HR_ORDS_TestBase;

import static io.restassured.RestAssured.*;

public class HR_ORDS_Test extends HR_ORDS_TestBase {  // now we stop using @BeforeAll and @AfterAll method, we extend that class

    // http://34.203.40.168:1000/ords/hr/countries/AR


    @DisplayName("Test GET / countries/{country_id} to POJO")
    @Test
    public void testCountryResponseToPOJO(){

       // Response response = get("/ countries/{country_id}", "AR").prettyPeek();
          Response response = given()
                                    .pathParam("country_id","AR").
                              when()
                                    .get("/countries/{country_id}").prettyPeek();

        Country ar = response.as(Country.class);
        System.out.println("ar = " + ar);

        Country ar1 = response.jsonPath().getObject("",Country.class);
        System.out.println("ar1 = " + ar1); // same result as above "ar"
    }

    @DisplayName("Test GET /countries to List of POJO")
    @Test
    public void testAllCountriesResponseToListOfPOJO(){

        Response response = get("/countries").prettyPeek();

        List<Country> countryList = response.jsonPath().getList("item", Country.class);
        countryList.forEach(System.out::println);

    }




}
