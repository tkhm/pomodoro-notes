package dev.tkhm.tomato.resource;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class TasksResourceTest {

    @Disabled
    @Test
    public void testTasksEndpoint() {
        given()
          .when().get("/tasks")
          .then().statusCode(200);
    }

}