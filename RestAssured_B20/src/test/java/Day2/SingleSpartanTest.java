package Day2;
// Today is December 11, 2020

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

import org.junit.jupiter.api.BeforeAll;

public class SingleSpartanTest {

    @BeforeAll
    public static void SetUp(){
        baseURI = "http://34.203.40.168:8000";
        basePath = "/api";
    }

    @AfterAll
    public static void TearDown(){
        reset();
    }



    @DisplayName("Testing GET /spartans/{id} endpoint")
    @Test
    public void test1Spartan() {
        //(1) prvi nacin

        given()
                // I want to get JSON result out
                //When I send Get request to /spartans/{id} endpoint
                // and expecting 200 status code
                .accept(ContentType.JSON).

        when()
                .get("spartans/103"). // we want to test ID number 103
        then()

                .statusCode(is(200))
                .contentType(ContentType.JSON);

        // I want to make it obvious for the value 103 is path variable(parameter) to uniquely identify the resource
        // this will whole Request URL a this test:
        // http://34.203.40.168:8000/api/spartans/103
        // (2) drugi nacin
        given()
                .accept(ContentType.JSON)
                .pathParam("id", 103).  // like we defined variable and we put below
        when()
                .get("/spartans/{id}").
        then()
                .assertThat()
                .statusCode((is(200)))
                .contentType(ContentType.JSON);


        // (3) This is the easiest one, same result

        given()
                .accept(ContentType.JSON).
        when()
                .get("/spartans/{id}", 103).
        then()
                .assertThat()
                .statusCode(is(200))
                .contentType(ContentType.JSON);

    }
        // we have 3 method above the same result. The second one is the most obvious


        @DisplayName("Testing GET /spartans/{id} endpoint Payload")  //Payload is "body"
        @Test
        public void test1SpartanPayLoad(){
            /**  expecting body below
             * {
             *     "id": 103,
             *     "name": "sa",
             *     "gender": "Male",
             *     "phone": 1234444444
             * }
             */

            given()
                    .accept(ContentType.JSON).
            when()
                    .get("/spartans/{id}", 103).
            then()
                    .assertThat()
                    .statusCode(is(200))
                    .contentType(ContentType.JSON)
                    .body("id",is (103))
                    .body("name", is("sa"))
                    .body("gender", equalTo("Male"))
                    .body("phone", is(equalTo(1234444444))); //is(equalTo) or is, equalTo is the same shit, moze kakom hoces





        }






    }





