package Day5;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

public class ExtractPractice {

    /*
        extract() method of RestAssured
        enable you to extract data after validation
        in then section of the method chaining
    */

    @BeforeAll
    public static void setUp(){
        baseURI = "http://34.203.40.168:8000";
        basePath = "/api" ;
    }
    @AfterAll
    public static void tearDown(){
        reset();
    }
    @DisplayName("Testing GET /api/spartans/search with Basic auth")
    @Test
    public void testSearchAndExtractData(){

        // search for nameContains : a , gender Female
        // verify status code is 200
        // extract jsonPath object after validation
        // use that jsonPath object to get the list of all results
        // and get the numberOfElements field value
        // compare those 2

       JsonPath jp = given()
                            .auth().basic("admin","admin")
                            .queryParam("nameContains","a")
                            .queryParam("gender","Female").
                      when()
                            .get("/spartans/search").
                      then()
                            .assertThat()
                            .statusCode(is(200))
                            .extract()
                            .jsonPath();  // this is the most important part, we extract from jsonPath object

        // get the list of all names in String
        List<String> allNames = jp.getList("content.name");
        System.out.println("allNames = " + allNames);
        // we are getting numberOfElements field from json result
        // since it's a top level key , json path will be just numberOfElements

        int numOfElements = jp.getInt("numberOfElements");
        System.out.println("numOfElements = " + numOfElements);

        // verifying the numOfElements match the size of list we got
        assertThat(numOfElements, equalTo(allNames.size())); //according to the task, test passed


        //using hamcrest matcher collection support for asserting the list size
        assertThat(allNames,hasSize(numOfElements)); // moze i ovako assertion from above

    }






}
