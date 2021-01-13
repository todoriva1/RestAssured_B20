package Day2;

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

public class SpartanTest {


    @BeforeAll
    public static void setUp(){

        //baseURI and basePath is static field of RestAssured Class
        //Since we static imported RestAssured, we can access all static field directly just it's in  our own class here
        RestAssured.baseURI = "http://34.203.40.168:8000";
        RestAssured.basePath = "/api";
        //moze i bez ovog "RestAssured" na pocetku gore. Znaci samo baseURI i basePath moze, npr samo ovo --> baseURI = "http://34.203.40.168:8000"

        // baseURI + basePath + whatever you provide in http method like get post
        // for example:
        // get("/spartan") --> get(baseURI + basePath + "/spartan")
    }


    @AfterAll
    public static void TearDown(){
        // resetting the value of baseURI,  basePath to original value
        RestAssured.reset();
    }




    @DisplayName("Testing /api/spartan endpoint")
    @Test
    public void testGetAllSpartan() {

        //send a get request to above endpoint
        //save the response
        //print out the result
        //try to assert the status code
        //content type header
        Response response = get("/spartans");
        response.prettyPrint();

        assertThat(response.statusCode(), is(200));
        assertThat(response.contentType(), is(ContentType.JSON.toString())); // ContentType.JSON --> Enum, but we put .toString

    }

    @DisplayName("Testing /api/spartan endpoint XML Response")
    @Test
    public void testGetAllSpartanXML() {

        /**
         * given
         *    ---RequestSpecification
         *    used to provide additional information about request
         *    base URL, base path
         *    header, query params, path variable, body (payload), authentication authorization
         *    logging, cookie
         *
         * when
         *     ---This is where you actually send the request with http method
         *     ---like GET POST PUT DELETE.. with URL
         *     ---We get Response Object after sending the request
         *
         * then
         *     ---ValidatableResponse
         *     ---This is where we can do validation
         *     ---validate status code, header, body(payload), cookie
         *     ---validate  responseTime
         *
         */

         given()
                 .header("accept","application/xml").  // ovo je iz postman "request specification", tamo kliknes na "header" i dodas key and value "accept" <-- key and value -->"application/xml"
         when()
                 .get("/spartans").
         then()
               //.assertThat() // This is not required, but can be added to make it obvious that this is where we start assertion
                 .statusCode(200)
                 .header("Content-Type", "application/xml"); // ovo is postman je "respond", a onaj gore header je from request
           //this is one statement above, nema semicolon, posle given() and posle when(), samo tacka


            // this will do same exact thing as above in slightly different way
            // since accept header and content type header is so common, RestAssured has good support or
            // those header by providing method directly rather that using header method we used above

         given()
                .accept(ContentType.XML). // this line doing exactly the same thing as this line above --> .header("accept","application/xml").
         when()
                .get("/spartans").
         then()
                 .assertThat()
                 .statusCode( is(200) )
                 .and()
                 .contentType(ContentType.XML); // this line doing exactly the same thing as this line above --> .header("Content-Type", "application/xml")




    }


}
