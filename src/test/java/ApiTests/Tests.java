package ApiTests;

import utilities.ConfigurationReader;
import io.github.cdimascio.dotenv.Dotenv;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.ConfigurationReader;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    static String accessToken;
    static String id;
    Dotenv dotenv = Dotenv.load();

    @Test
    public void BearerToken() {
        Response response =
                given()
                        .baseUri(ConfigurationReader.get("base_url"))
                        .and().queryParam("grant_type", dotenv.get("GRANT_TYPE"))
                        .queryParam("client_id", dotenv.get("CLIENT_ID"))
                        .queryParam("client_secret", dotenv.get("CLIENT_SECRET"))
                        .header("content-type", "application/x-www-form-urlencoded")
                        .when().post("/oauth/token");

        assertEquals(response.statusCode(), 200);

        response.prettyPrint();

        accessToken = response.path("access_token");

        System.out.println(accessToken);

    }

}
