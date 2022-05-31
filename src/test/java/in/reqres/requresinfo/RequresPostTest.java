package in.reqres.requresinfo;

import in.reqres.model.RequresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class RequresPostTest extends TestBase {

    @Test
        public void setCreateNewUser() {
        RequresPojo requresPojo = new RequresPojo();
        requresPojo.setName("morpheus");
        requresPojo.setJob("leader");

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(requresPojo)
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();

    }
    @Test
    public void setLoginSuccessful() {
        RequresPojo requresPojo = new RequresPojo();
        requresPojo.setEmail("eve.holt@reqres.in");
        requresPojo.setPassword("cityslicka");
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .body(requresPojo)
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
