package Day3;

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

public class JsonPathIntro {

    @BeforeAll
    public static void SetUp(){
        baseURI = "http://34.203.40.168:8000";
        basePath = "/api";
    }

    @AfterAll
    public static void TearDown(){
        reset();
    }

    @DisplayName("Extracting data out of Spartan Json Object")
    @Test
    public void test1SpartanPayload(){

        // send the request to get 1 spartan by providing path params with valid id
        // save it into Response object
        //NEW: create an object called with type JsonPath by calling the method JsonPath() on response object
        // extract id, name, gender, phone
        // and save it into variable of correct type

        Response response = given()
                                    .pathParam("id", 34).
                            when()
                                    .get("/spartans/{id}")
                                    .prettyPeek(); // --> return Response
        // response.prettyPrint();  --> return String

        //JsonPath is used to navigate through the json payload
        //and extract the value according to the valid "jsonpath" provided
        JsonPath jp = response.jsonPath();
        int myId = jp.getInt("id");
        String myName = jp.getString("name");
        String myGender = jp.getString("gender");
        long myPhone = jp.getLong("phone");

        System.out.println("myId = " + myId);
        System.out.println("myName = " + myName);
        System.out.println("myGender = " + myGender);
        System.out.println("myPhone = " + myPhone);

    }

    @DisplayName("Extracting date from Json Array Response ")
    @Test
    public void getAllSpartanExtractData() {

        //Response response = get("/spartans");
        //JsonPath jp = response.jsonPath();

        // below is another way of this two approach from above

        JsonPath jp = get("/spartans").jsonPath();

        // get the first json object name field
        // jp.getString("name[0]")).soutv --> dobijamo ovo dole - shortcut tom print
        System.out.println("jp.getString(\"name[0]\") = " + jp.getString("name[0]"));

        System.out.println("jp.getLong(\"phone[0]\") = " + jp.getLong("phone[0]"));

        //get the 7th json object gender field from json array
        System.out.println("jp.getString(\"gender[6]\") = " + jp.getString("gender[6]"));


        // getting all the name fields from the JsonArray Response
        //and storing as a List
        List<String> allNames = jp.getList("name");

        System.out.println(allNames);


        // getting all the phone fields from the JsonArray Response
        //and storing as a List

        List<Long> allNumbers = jp.getList("phone");
        System.out.println(allNumbers);

    }
        // send request to this request url
        // http://100.26.101.158:8000/api/spartans/search?nameContains=de&gender=Male
        // get the name of first guy in the result
        // get the phone of 3rd guy in the result
        // get all names , all phones save it as list
        // save the value of field called empty under pageable in the response
        // print it out

        @DisplayName("Testing /spartans/search and extracting data")
        @Test
        public void testSearch(){

            JsonPath jp = given()
                                .queryParam("nameContains","de") // --> http://100.26.101.158:8000/api/spartans/search?nameContains=de&gender=Male  after "?" mark from above
                                .queryParam("gender","Male").
                          when()
                                .get("/spartans/search") // this is where we get response object
                                .jsonPath();

            System.out.println("first guy name " +
                    jp.getString("content[0].name")    );
            System.out.println("third guy phone number " +
                    jp.getLong("content[2].phone")  );

            System.out.println("allNames " + jp.getList("content.name"));
            System.out.println("allPhones " + jp.getList("content.phone"));

            System.out.println("value of field empty " +
                    jp.getBoolean("pageable.sort.empty") );


        }

}
