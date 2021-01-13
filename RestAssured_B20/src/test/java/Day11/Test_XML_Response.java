package Day11;

import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testbase.SpartanAdminTestBase;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_XML_Response extends SpartanAdminTestBase {

    //get xml response for GET/ spartans
    @DisplayName("GET/spartans get xml response")
    @Test
    public void testXML(){

        XmlPath xp =
        given()
                .spec(adminReqSpec)
                .accept(ContentType.XML).
        when()
                .get("/spartans").
        then()
                .log().all()
                .statusCode(200)
                //verify first person name is "sa"
                .body("List.item[0].name",is("sa"))
                //verify first person id is 103
                .body("List.item[0].id",is("103"))
                //.body("List.item[0].id.toInteger",is(103))  //with this Groovy function we use integer instead of String above, it is optional. Just to show how we can do that. It is the same as above
                .contentType(ContentType.XML)
                .extract()
                .xmlPath();

        //get the name of of the 6th person in the response
         String extactName = xp.getString("List.item[5].name");
        System.out.println("extactName = " + extactName);

        //get the id of the 3rd person
        String extractID = xp.getString("List.item[2].id");
        System.out.println("extractID = " + extractID);

        //get the last item phone number
        long lastPhoneNumber = xp.getLong("List.item[-1].phone");
        System.out.println("lastPhoneNumber = " + lastPhoneNumber);




    }
}
