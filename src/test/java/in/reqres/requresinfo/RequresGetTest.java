package in.reqres.requresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RequresGetTest extends TestBase {

    @Test
    public void getListofAllUserinfo() {

        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSigleUserInfo() {
        Response response = given()
                .pathParam("id", 2)
                .when()
                .get("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
