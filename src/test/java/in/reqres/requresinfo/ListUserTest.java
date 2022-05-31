package in.reqres.requresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ListUserTest extends TestBase {

    @Test
    public void Test001() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

        int page = response.then().extract().path("page");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of page is : " + page);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test002() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        List<Integer> perpage = response.then().extract().path("per_page");
//    int page = response.then().extract().path("data[1].id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The values per page are : " + perpage);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test003() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        int id = response.then().extract().path("data[1].id");
//    int page = response.then().extract().path("data[1].id");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The ID number of 1st value is  : " + id);
        System.out.println("------------------End of Test---------------------------");

    }

    @Test
    public void Test004() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        String firstname = response.then().extract().path("data[3].first_name");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The First name is : " + firstname);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test005() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        List<Integer> listOfdata = response.then().extract().path("data");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The list of data are : " + listOfdata.size());
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test006() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        String avatar = response.then().extract().path("data[5].avatar");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The avatar link is : " + avatar);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test007() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        String supporturl = response.then().extract().path("support.url");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The support url link is : " + supporturl);
        System.out.println("------------------End of Test---------------------------");
    }

    @Test
    public void Test008() {
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
        String supporttext = response.then().extract().path("support.text");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The support text is : " + supporttext);
        System.out.println("------------------End of Test---------------------------");
    }
}