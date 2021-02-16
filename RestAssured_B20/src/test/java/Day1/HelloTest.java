package Day1;

import io.restassured.internal.common.assertion.Assertion;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 1 Hello Test")
public class HelloTest {

    // Junit5 Annotation and all below is Junit5 examples
    //@BeforeAll   @AfterAll  @BeforeEach   @AfterEach
    //@DisplayName   @Disabled
    //examples below

    @BeforeAll // run only 1 and will be static
    public static void setUp(){
        System.out.println("@BeforeAll is running");
    }

    @AfterAll // // run only 1 and will be static
    public static void tearDown(){
        System.out.println("@AfterAll is running");
    }


    @BeforeEach
    public void setUpTest(){
        System.out.println("@Before each is runnning");
    }


    @AfterEach
    public void tearDownTest(){
        System.out.println("@AfterEach is runnning");
    }



    @DisplayName("Test 1 + 3 = 4")  // this is sample only
    @Test
    public void test(){
        System.out.println("test 1 is running");
        Assertions.assertEquals(4,1+3);
    }


    @Disabled  // example only, result be ignored test
    @DisplayName("Test 3 * 4 = 12") // example only
    @Test
    public void test2(){
        System.out.println("test 2 is running");
        // assert 4 times 3 is 12
        assertEquals(12, 4*3);
    }
}
