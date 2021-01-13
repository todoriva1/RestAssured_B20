package Day11;

import Utility.SpartanUtil;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.SpartanAdminTestBase;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import static io.restassured.RestAssured.given;

public class JsonSchemaValidationPractice extends SpartanAdminTestBase {

    @DisplayName("Testing GET /spartan endpoint structure")
    @Test
    public void testAllSpartanResponseSchema(){

        given()
                .spec(adminReqSpec).
        when()
                .get("/spartans").
        then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("allSpartansSchema.json"));


    }


    @DisplayName("Testing POST/ spartans endpoint response structure")
    @Test
    public void testPostSpartanResponseSchema(){

        // we can also use matchesJsonSchema method if we want to provide full path for this file
        File schemaFile = new File("src/test/resources/postSuccessResponseSchema.json"); // nadjemo postSuccesResponseSchema u resource folder, right click, copy path and copy root, tako dobijemo ovo zeleno u zagradi

        given()
                .spec(adminReqSpec)
                .contentType(ContentType.JSON)
                .body(SpartanUtil.getRandomSpartanPOJO_Payload()).
        when()
                .post("/spartans").
        then()
                //.body(matchesJsonSchemaInClasspath("postSuccessResponseSchema.json")) // moze ovako a moze i dole pogledati

                // What if my schema file is somewhere else other then resource folder?
                // then we need to provide full path and use different method
                .body(matchesJsonSchema(schemaFile));
    }


    @DisplayName("Testing GET/ spartans/ search endpoint response structure")
    @Test
    public void testSearchSpartanResponseSchema(){

        given()
                .spec(adminReqSpec)
                .queryParam("nameContains","a")
                .queryParam("gender","Female").
        when()
                .get("/spartans/search").
        then()
                .body(matchesJsonSchemaInClasspath("searchSpartanSchema.json"));

    }



}
