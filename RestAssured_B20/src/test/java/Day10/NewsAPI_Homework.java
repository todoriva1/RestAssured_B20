package Day10;

import Utility.DB_Utility;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.ArticlePOJO;
import pojo.Country;
import testbase.HR_ORDS_TestBase;
import static io.restassured.RestAssured.* ;
import static io.restassured.matcher.RestAssuredMatchers.* ;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.* ;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class NewsAPI_Homework {

    @DisplayName("Get all article author if source id is not null")
    @Test
    public void testGetAllArticleAuthor(){

        JsonPath jp =
        given()
                .baseUri("http://newsapi.org")
                .basePath("/v2")
                .queryParam("apikey","d39d53da33db434791d77f7b58658007")
                .queryParam("country","us").
        when()
                .get("/top-headlines") //.prettyPeek()
                .jsonPath();

        List<String> listOfAuthor = jp.getList("articles.findAll{ it.source.id != null }.author"); // we are filtering here, zapamti some ako uopste mozes nesto
        System.out.println("listOfAuthor = " + listOfAuthor);


        // additional requirement --> remove any author with null value
        List<String> listOfAuthorNoNull = jp.getList("articles.findAll{ it.source.id != null && it.author != null }.author"); // we are filtering here, zapamti some ako uopste mozes nesto
        System.out.println("listOfAuthorNoNull = " + listOfAuthorNoNull);


        List<ArticlePOJO> allArticles = jp.getList("articles.findAll{ it.source.id != null && it.author != null}",ArticlePOJO.class);
        allArticles.forEach(System.out::println);

    }


}
