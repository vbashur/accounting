package com.vbashur.accounting;

import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class CommonStepDefenitions {

    private final TestContext context;

    /*
    .ctor must be public to make pico container happy
     */
    public CommonStepDefenitions(TestContext context) {
        this.context = context;
    }

    @io.cucumber.java.en.Given("^service is running$")
    public void serviceIsRunning() {
        given()
            .baseUri(TestContext.ACCOUNTING_BASE_URI)
            .when()
            .get("/status")
            .then()
            .statusCode(HttpStatus.SC_OK);
    }

}
