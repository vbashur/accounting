package com.vbashur.accounting;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static com.jayway.jsonpath.matchers.JsonPathMatchers.isJson;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.emptyString;

public class StatusStepDefenitions {


    private final TestContext context;

    public StatusStepDefenitions(TestContext context) {
        this.context = context;
    }

    @When("I request the status of my service")
    public void iRequestTheStatusOfMyService() {
        ValidatableResponse response =
            given()
                .baseUri(TestContext.ACCOUNTING_BASE_URI)
                .when()
                .get("/status")
                .then();
        this.context.setRequestResponse(response);
    }


    @Then("the service responds with OK")
    public void theServiceRespondsWithOK() {
        this.context.getRequestResponse().statusCode(HttpStatus.SC_OK);
    }

    @And("response is valid json")
    public void responseIsValidJson() {
        this.context.getRequestResponse().body(isJson());
    }

    @And("response contains non empty {string}")
    public void responseContainsNonEmpty(String key) {
        this.context.getRequestResponse()
            .body(hasJsonPath(key), not(emptyString()));
    }
}
