package Day4;

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

public class OpenMovieDB_Test {

    //http://www.omdbapi.com/?t=titanic
    //http://www.omdbapi.com/  -->base url
    //?t=titanic  --> query parameter


    @BeforeAll
    public static void setUp(){
        baseURI = "http://www.omdbapi.com";
    }

    @AfterAll
    public static void tearDown(){
        reset();
    }


    @DisplayName("Test search movie or OpenMovieDB Test")
    @Test
    public void testMovie(){

        given()
                .queryParam("apikey","bf56a787")
                .queryParam("t","titanic").
        when()
                .get().  // we don't put here anything because our request url is already complete with base url and query parameter above
        then()
                .statusCode(is(200))
                .contentType(ContentType.JSON)
                .body("Title",is("Titanic"))
                .body("Ratings[0].Source", is("Internet Movie Database"));  // sve ovo u Postman se vidi
    }



    @DisplayName("Getting the log of request and response")
    @Test
    public void testSendingRequestAndGetTheLog(){

        given()
                .queryParam("apikey","bf56a787")
                .queryParam("t","titanic")
                // logging the request should be in given section --> one for request here
                .log().all().
                // .log().uri().
                //.log().params().
        when()
                .get().
        then()
                // logging the request should be in given section --> one for respond here
                  .log().all()
                //.log().status()
                //.log().body()
                  .statusCode(is(200))
                  .body("Plot", containsString("A seventeen-year-old aristocrat"))
                  .body("Ratings[1].Source",is("Rotten Tomatoes")); // sve ovo u postman se vidi

    }






}
