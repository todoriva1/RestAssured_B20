package Day7;

import io.restassured.RestAssured;
import org.junit.jupiter.api.*;
import io.restassured.http.ContentType;
import pojo.Spartan;
import Utility.ConfigurationReader;
import Utility.SpartanUtil;
import pojo.SpartanRead;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;

public class PatchOneSpartanTest {

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

        @DisplayName("Patching 1 data with Java Object")
        @Test
        public void testPatch1DataPartialUpdate(){

            // we just need to update the name and phone number

            Map<String,Object> patchBodyMap = new LinkedHashMap<>();
            patchBodyMap.put("name", "B20 Voila");
            patchBodyMap.put("phone", 1234567890L);

            given()
                    .auth().basic("admin","admin")
                    .log().all()
                    .pathParam("id", 5)
                    .contentType(ContentType.JSON)
                    .body(patchBodyMap).
            when()
                    .patch("/spartans/{id}").
            then()
                    .log().all()
                    .statusCode(204);




        }



        // here below is the same as above, just this time with "POJO", not with "Java Object", we don't use MAP also




    @DisplayName("Patching 1 data with POJO")
    @Test
    public void testPatch1DataPartialUpdateWithPOJO(){

        // we just need to update the name and phone number

       Spartan sp = new Spartan(); //("B20 VOILA","",1234567890);
        sp.setName("B20 Voila");
        sp.setGender("Female");
        sp.setPhone(1234567890);

        // MAP IS BETTER OPTION WITH MINIMAL EFFORT
        // POJO class need some handling to ignore empty fields value when being serialized

        given()
                .auth().basic("admin","admin")
                .log().all()
                .pathParam("id", 5)
                .contentType(ContentType.JSON)
                .body(sp).
        when()
                .patch("/spartans/{id}").
        then()
                .log().all()
                .statusCode(204);




    }


}
