package back;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class parabankAPI {

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://parabank.parasoft.com/parabank";
    }

    @Test
    public void testRegistration() {

        String requestBody = "{\n" +
                "  \"firstName\": \"Caio\",\n" +
                "  \"lastName\": \"Castro\",\n" +
                "  \"address\": \"street: Logo Ali\",\n" +
                "  \"address\": \"city: Perto dali\",\n" +
                "  \"address\": \"state: Depois de lá\",\n" +
                "  \"address\": \"zipCode: 000001\",\n" +
                "  \"phoneNumber\": \"278382681\",\n" +
                "  \"ssn\": \"100\" \n}" +
                "  \"username\": \"caio12\" \n}" +
                "  \"password\": \"12caio\",\n";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(new Gson().toJson(requestBody))
                .when()
                .post("/register.htm")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void testOpenANewAccount() {
        String requestBody = "{\n" +
                "  \"customerId\": \"166361\",\n" +
                "  \"newAccountType\": \"1\",\n" +
                "  \"fromAccountId\": \"16678\",\n";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(new Gson().toJson(requestBody))
                .when()
                .post("/createAccount")
                .then()
                .extract().response();

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void testOverview() {

        Response response = RestAssured.get("/overview.htm");

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    public void testTransferFunds() {

        String requestBody = "{\n" +
                "  \"fromAccountId\": \"16636\",\n" +
                "  \"toAccountId\": \"16678\",\n" +
                "  \"amount\": \"10\",\n";

        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(new Gson().toJson(requestBody))
                .when()
                .post("/transfer")
                .then()
                .extract().response();

        Assertions.assertEquals(200,response.statusCode());
    }

    @Test
    public void testActivityAccount() {
        Response response = RestAssured.get("/accounts/16636/transactions/fromDate/All/toDate/All");

        Assertions.assertEquals(200,response.statusCode());
    }
}
