package Day9;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class JUnit5RepeatedTest {

    @RepeatedTest(10)
    public void testRepeating(){
        System.out.println("Repeating");

        Faker faker = new Faker();
        System.out.println("Name is "+ faker.funnyName().name()); // just exercise repeating with annotation @RepeatedTest

        System.out.println(faker.chuckNorris().fact()); // for fun
    }

}
