package Day5;
//TODAY IS 13TH DECEMBER 2020

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

public class HamcrestCollectionSupport {

    @Test
    public void testList(){

        List<Integer> numList = Arrays.asList(4,6,7,9,5,88,90);
        // use hamcrest matcher to test the size of the list

        assertThat(numList, hasSize(7));

        //assert that this list contain number 9
        assertThat(numList, hasItem(9));   // here is item

        //assert that this list contain number 9, 88
        assertThat(numList, hasItems(9,88)); // here is itemS  --> with S

        //assert that every item in the list are more then 3
        assertThat(numList,everyItem(greaterThan(3)));
        assertThat(numList,everyItem(is(greaterThan(3)))); // moze i ovako


        List<String> allNames = Arrays.asList("Rory Hogan","Mariana", "Olivia", "Gulbadan", "Ayxamgul", "Kareem", "Virginia", "Tahir Zohra");
        assertThat(allNames, hasSize(8));
        assertThat(allNames, hasItem("Gulbadan"));
        assertThat(allNames, hasItems("Olivia", "Kareem"));

        // check every item has letter "a"
        assertThat(allNames, everyItem(containsString("a")));

        // check every items has letter "a" in case insensitive manner
        assertThat(allNames, everyItem(containsStringIgnoringCase("a")));

        //how to do and or in hamcrest syntax
        // allOf -->  is AND logic
        // anyOf --> is OR logic

        //anyOf --> and
        assertThat("Ivan Todorovski", allOf(startsWith("Iv"),containsString("rov")));

        //anyOf --> or
        assertThat("Ivan Todorovski", anyOf(is("Todorovski"),endsWith("ski")));





    }
}
