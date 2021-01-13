package Day5;

//by default test is running an alphabetical order
//or the test method name

import org.junit.jupiter.api.*;
//import static org.junit.jupiter.api.MethodOrderer.*;     --> with this import we don need "MethodOrderer" u zagradi ispod odmah. Only "OrderAnnotation.class"

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)  // this is how we set up the test order
//@TestMethodOrder(MethodOrderer.Random.class) --> can be also like this order
//@TestMethodOrder(MethodOrderer.MethodName)  --> or like this
// @TestMethodOrder(MethodOrderer.DisplayName.class) --> we don't have right now display name but is also possible like this order

public class TestOrderingInJunit5 {

    @Order(3)
    @Test
    public void testA(){
        System.out.println("running test A");
    }
    @Order(1)
    @Test
    public void testC(){
        System.out.println("running test C");
    }
    @Order(4)
    @Test
    public void testD(){
        System.out.println("running test D");
    }
    @Order(2)
    @Test
    public void testB(){
        System.out.println("running test B");
    }
}
