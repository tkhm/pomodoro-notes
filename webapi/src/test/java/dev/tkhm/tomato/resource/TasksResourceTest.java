package dev.tkhm.tomato.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class TasksResourceTest {

    @Test
    public void testTasksEndpoint() {
        given()
          .when().get("/tasks")
          .then().statusCode(200);
    }

}