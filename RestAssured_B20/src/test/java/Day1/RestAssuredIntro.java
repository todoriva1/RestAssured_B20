package Day1;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.Matchers.* ;

import static  org.hamcrest.MatcherAssert.assertThat;

public class RestAssuredIntro {

    @DisplayName("Spartan GET /api/hello Endpoint Test")
    @Test
    public  void TestHello(){
       // http://34.203.40.168:8000/api/hello    --> this is my ip

       // import Response below from "import static io.restassured.RestAssured.*  --> first import from top
       Response response = get("http://34.203.40.168:8000/api/hello");
       //get status code out of this response object
        System.out.println("status code is: " + response.statusCode());

        //assert the status code is 200
        assertThat(response.statusCode(), is(200));

        // how to pretty print entire response body
        // prettyPrint() - print and return body as string
        String bodyAsString = response.prettyPrint();
        // assertThat the body is Hello from Sparta
        assertThat(bodyAsString, is("Hello from Sparta"));

        //There are multiply way to same thing in RestAssure
        //get the heather called ContentType from response
        System.out.println(response.getHeader("Content-Type") );
        System.out.println(response.getContentType());
        System.out.println(response.contentType()); // all three above the same --> print --> text/plain;charset=UTF-8

        assertThat(response.contentType(), is("text/plain;charset=UTF-8"));

        //easy way to work with Content-type without typing much --> enum example
        //we can use content type Enum from RestAssured to easily get main part content-Type
        //Content-type.TEXT --> text/plain as Enum
        //startWith accept a String object
        //so use toString method to turn ContentType.TEXT to String so we can use
        assertThat(response.contentType(), startsWith(ContentType.TEXT.toString()));
        assertThat(response.contentType(), is(not(ContentType.JSON)));


    }

    @DisplayName("Common Machers for strings")
    @Test
    public void testString(){

        String str = "Rest Assured is cool so far";
        //assert that str is "Rest Assured is cool so far"
        assertThat(str, is("Rest Assured is cool so far"));


        //assert that str "Rest Assured IS COOL so far" in case insensitive manner
        assertThat(str, equalToIgnoringCase("Rest Assured IS COOL so far"));

        //assert the str startWith "Rest"
        assertThat(str, startsWith("Rest"));


        //assert the str contains "is cool"
        assertThat(str, containsString("is cool"));


        //assert the str is "IS COOL" case insenstive manner
        assertThat(str, containsStringIgnoringCase("IS COOl") );


    }

}
