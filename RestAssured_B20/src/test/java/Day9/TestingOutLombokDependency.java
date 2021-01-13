package Day9;

import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.Department;
import testbase.HR_ORDS_TestBase;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestingOutLombokDependency extends HR_ORDS_TestBase {

@Test
    public void testDepartmentPOJO(){

    Department d = new Department();
    d.setDepartment_id(100); // radi sa Lombok @Setter annotation in POJO, without getter and setter method
    System.out.println(d.getDepartment_id());  // radi sa Lombok @Getter annotation in POJO, without getter and setter method

    Department d2 = new Department(100,"abc",23,1700); // example constructor with argument
    System.out.println("d2 = " + d2);

}

    @DisplayName("GET/departments and save List of POJO")
    @Test
    public void testDepartmentJsonArrayToListOfPOJO(){

        List<Department> allDeps = get("/departments").jsonPath().getList("items",Department.class);
        //allDeps.forEach(System.out::println);

        // Copy the contect of this list into new List
        // and only print id the dep manager ID is not null
        //allDeps.removeIf(eachDep -> eachDep.getDepartment_id() !=0 );
        //allDeps.forEach(System.out::println); // all this is just eaxmple and exercise

        List<Department> allDepsCopy = new ArrayList<>(allDeps);
        allDepsCopy.removeIf(eachDep -> eachDep.getManager_id() == 0);
        allDepsCopy.forEach(System.out::println);


    }


    @DisplayName("GET /department and filter the result with JsonPath groovy")
    @Test
    public void testFilterResultWithGroovy(){

        JsonPath jp = get("/departments").jsonPath();
        List<Department> allDeps = jp.getList("item.findAll {it.manager_id > 0}", Department.class);  // "it" represent each item, manager_id is the key, >0 is the condition
        allDeps.forEach(System.out::println);

        //what if I just want to get List<String> to store DepartmentName
        List<String> depName = jp.getList("items.department_name"); // getting everything, all of them
        System.out.println("depName = " + depName);

        List<String> depNameFiltered = jp.getList("items.findAll {it.manager_id > 0}.department_name"); // getting the filter one
        System.out.println("depNameFiltered = " + depNameFiltered);



        //get all department ID if it is more then 70
        List<Integer> allDepIds = jp.getList("items.department_id");
        System.out.println("allDepIds = " + allDepIds);

        List<Integer> allDepIdsFilter = jp.getList("items.department_id.findAll{ it > 70 }");
        System.out.println("allDepIdsFilter = " + allDepIdsFilter);

        //what if you have more then one condition for example: department_id between 70-100
        List<Integer> dep70to100 = jp.getList("items.department_id.findAll { it>=70 && it<=100 }");
        System.out.println("dep70to100 = " + dep70to100);

        //get the name of department id department_id between 70-100
        List<String> allDeps70to100 = jp.getList("items.findAll { it.department_id >=70 && it.department_id<=100 }.department_name");
        System.out.println("allDeps70to100 = " + allDeps70to100);
        // allDeps70to100 = [Public Relations, Sales, Executive, Finance]

        //findAll --> will return all matching result
        //find --> will return first match for the condition
        String dep10 = jp.getString("items.find{ it.department_id == 10}.department_name");
        System.out.println("dep10 = " + dep10);
        // dep10 = Administration  <-- response when we run above


        //sum / min / max  collect
        //get the sum of entire department-id
        int sumOfAllDepIDs = jp.getInt("items.department_id.sum()");
        int sumOfAllDepIDs2 = jp.getInt("items.sum{it.department_id}"); //the same as above

        System.out.println("sumOfAllDepIDs = " + sumOfAllDepIDs);
        System.out.println("sumOfAllDepIDs2 = " + sumOfAllDepIDs2);


        //get the lowest department_id
        int lowestDepId = jp.getInt("items.department_id.min()");
        System.out.println("lowestDepId = " + lowestDepId);

        //get the highest department_id
        int highestDepId = jp.getInt("items.department_id.max()");
        System.out.println("highestDepId = " + highestDepId);

        // print number 5 department_id
        System.out.println("number 5 dep ID" + jp.getInt("items.department_id[4]"));


        //print number lastDep_id
        System.out.println("last dep ID "+ jp.getInt("items.department_id[-1]"));


        //print from index 7 till index 10 dep ID
        System.out.println("70-100 dep ID " + jp.getList("items.department_id[7..10]" ));
    }

}
