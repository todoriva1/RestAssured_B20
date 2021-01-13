package Day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

// Hamcrest assertion library is already part of our restAssured Dependency in pom file
//No separate dependency needed

public class HamcrestMatchersTest {

    @DisplayName("Test 1 + 3 = 4")
    @Test
    public void test1(){
        assertThat(1+3, is(4) );  // this is the way of assertion in Hamcrest library
        assertThat(1+3, equalTo(4)); // this also another way, the same exact thing, just different way

        //add some nice error message if ti fails
        // assertThat("Wrong result", 1+3, equalTo(5));

        // test 1+3 is not 5
        assertThat(1+3, not(5) );  // like we said 1+3 is not 5
        // we can nest a matcher inside another matcher
        assertThat(1+3, is(not(5) ) ); // another example
        assertThat(1+3, not(equalTo(5) ) ); //also example


        // test 1+3 is less then 5
        assertThat(1+3, lessThan(5));

        //test 1+3 is more then 2
        assertThat(1+3, greaterThan(2));





    }

}
