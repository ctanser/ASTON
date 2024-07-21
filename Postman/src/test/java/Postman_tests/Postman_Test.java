package Postman_tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class  Postman_Test {
    String foo1 = "foo1";
    String foo2 = "foo2";
    String bar1 = "bar1";
    String bar2 = "bar2";

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "https://postman-echo.com/";
    }

    @Test
    @DisplayName("GET")
    public void TestGet() {
        given().queryParam("foo1", "bar1").queryParam("foo2", "bar2")
                .when().get("/get")
                .then().statusCode(200)
                .assertThat().body("args." + foo1, equalTo(bar1))
                .assertThat().body("args." + foo2, equalTo(bar2));
    }

    @Test
    @DisplayName("POST_Raw")
    public void TestPost() {
        String json = "{\"" + foo1 + "\": \"" + bar1 + "\", \"" + foo2 + "\": \"" + bar2 + "\"}";

        given().header("Content-type", "application/json")
                .body(json)
                .log().all()
                .when().post("/post")
                .then().statusCode(200)
                .and()
                .assertThat().body("json." + foo1, equalTo(bar1))
                .assertThat().body("json." + foo2, equalTo(bar2));
    }

    @Test
    @DisplayName("POST_Form")
    public void TestPostForm() {
        given().contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .log().all()
                .when().post("/post")
                .then().statusCode(200)
                .and()
                .assertThat().body("form." + foo1, equalTo(bar1))
                .assertThat().body("form." + foo2, equalTo(bar2));


    }

    @Test
    @DisplayName("PUT")
    public void TestPut() {
        String json = "{\"" + foo1 + "\": \"" + bar1 + "\", \"" + foo2 + "\": \"" + bar2 + "\"}";
        Response response = RestAssured
                .given().header("Content-type", "application/json")
                .body(json)
                .log().all()
                .when().put("/put")
                .then().statusCode(200)
                .assertThat().body("json." + foo1, equalTo(bar1))
                .assertThat().body("json." + foo2, equalTo(bar2))
                .extract().response();

        // Вывод ответа
        System.out.println("Response: " + response.asString());
    }

    @Test
    @DisplayName("PATCH")
    public void TestPatch() {
        String json = "{\"" + foo1 + "\": \"" + bar1 + "\", \"" + foo2 + "\": \"" + bar2 + "\"}";
        given().header("Content-type", "application/json")
                .body(json)
                .log().all()
                .when().patch("/patch")
                .then().statusCode(200)
                .assertThat().body("json." + foo1, equalTo(bar1))
                .assertThat().body("json." + foo2, equalTo(bar2));
    }

    @Test
    @DisplayName("DELETE")
    public void TestDelete() {
        given().header("Content-type", "application/json")
                .delete("/delete")
                .then().statusCode(200);

    }
}