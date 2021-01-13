package Day6;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import pojo.Spartan;
import Utility.ConfigurationReader;
import Utility.SpartanUtil;
import pojo.SpartanRead;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;


public class JsonToJavaObject {

    @BeforeAll
    public static void setUp(){
        //RestAssured.filters().add(new AllureRestAssured() ) ;
        baseURI = ConfigurationReader.getProperty("spartan.base_url");
        basePath = "/api" ;
    }

    @AfterAll
    public static void tearDown(){
        reset();
    }

    @DisplayName("Get 1 Data with Save Response Json as Java Object")
    @Test
    public void getOneSpartanAndSaveResponseJsonAsMap(){

        Response response =  given()
                                    .auth().basic("admin","admin")
                                    .log().all()
                                    .pathParam("id", 8).
                             when()
                                    .get("/spartans/{id}").prettyPeek();

        //get jsonPath object
        JsonPath jp = response.jsonPath();
        Map<String,Object> responseMap = jp.getMap("");
        System.out.println("responseMap = " + responseMap);


        SpartanRead sp = jp.getObject("",SpartanRead.class);
        System.out.println("sp = " + sp);


        /**
         *
         * {
         *     "id": 5,
         *     "name": "Blythe",
         *     "gender": "Female",
         *     "phone": 3677539542
         * }
         *
         * jsonPath to get whole json object is just empty string
         *
         * assume this is a car object
         * {
         *      "make":"Honda"
         *      "color":"white"
         *      "engine": {
         *                  "type":"v8"
         *                  "horsepower":350
         *                  }
         * }
         * jsonPath for horse power --> engine.horsepower
         * jsonPath for engine itself --> engine
         * jsonPath for entire car jsonObject --> ""   --> only empty string
         *
         */

    }

    @DisplayName("Get All Data with Save Response JsonArray as Java Object")
    @Test
    public void getOneSpartanAndSaveResponseJsonAsJavaObject() {

        Response response = get("/spartans");
        JsonPath jp = response.jsonPath();

        List<SpartanRead> allSpartanPOJOs = jp.getList("", SpartanRead.class);
        System.out.println("allSpartanPOJOs = " + allSpartanPOJOs);


        // send request to api/spartans/search endpoint
        //save your jsonArray from search result into List of SpartanRead POJO




    }

}
