package in.reqres.requresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RequresDeleteTest extends TestBase {

    @Test
    public void deleteSigleUserInfo() {
        Response response = given()
                .pathParam("id", 2)
                .when()
                .delete("/users/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
