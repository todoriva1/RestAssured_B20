package Day9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;
import testbase.HR_ORDS_TestBase;

import static org.junit.jupiter.api.Assertions.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class JUnit5_ParameterizedTest extends HR_ORDS_TestBase {


    @ParameterizedTest
    @ValueSource(ints = {5,6,7,8,9}  )
    public void test1( int myNumber){

        //no loop at all,they do iteration automatically
        System.out.println("myNumber = " + myNumber);
        // assert  5,6,7,8,9  all less than 10

        assertTrue( myNumber < 10 ) ;

    }
    // using CSV file as source for parameterized test  (csv, coma separated value)
    @ParameterizedTest
    @CsvFileSource(resources = "/zipcode.csv" , numLinesToSkip = 1) // numLinesToSkip = 1  --> to skip first line - header
    public void test2( String zip ){
        System.out.println("zip = " + zip);
        // sending request to zipcode endpoint here

        //api.zippopotam.us/us/{zipcode}
        // baseurl : api.zippopotam.us
        //  endpoint is /us/{zipcode}
        given()
                .log().uri()
                .baseUri("https://api.zippopotam.us")
                .pathParam("zipcode" , zip).
        when()
                .get("/us/{zipcode}").
        then()
                .statusCode(200) ;


    }

    @ParameterizedTest
    @CsvFileSource(resources = "/country_zip.csv" , numLinesToSkip = 1)
    public void testCountryZipCodeCombo(String csvCountry, int csvZip){

        given()
                .log().uri()
                .baseUri("https://api.zippopotam.us")
                .pathParam("country" , csvCountry)
                .pathParam("zipcode" , csvZip).
        when()
                .get("/{country}/{zipcode}").
        then()
                .statusCode(200) ;

    }




}