package com.vbashur.accounting;

import io.restassured.response.ValidatableResponse;

public class TestContext {

    private ValidatableResponse requestResponse;

    public static final String ACCOUNTING_BASE_URI = "http://localhost:8080";

    public ValidatableResponse getRequestResponse() {
        return requestResponse;
    }

    public void setRequestResponse(ValidatableResponse requestResponse) {
        this.requestResponse = requestResponse;
    }
}
