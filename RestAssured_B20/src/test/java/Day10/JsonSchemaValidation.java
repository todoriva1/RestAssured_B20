package Day10;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.SpartanAdminTestBase;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JsonSchemaValidation extends SpartanAdminTestBase {


    @DisplayName("Testing the structure of GET /api/spartans/{id} response")
    @Test
    public void testGetSingleSpartanSchema(){

        given()
                .spec(adminReqSpec)
                .pathParam("id",34).
        when()
                .get("/spartans/{id}").
        then()
                .log().body()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath("singleSpartanSchema.json") ) ; // only this line is necessary for jsonschema validation
                                        // ovo u zagradi je file in resource package
    }



}