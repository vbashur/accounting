package com.vbashur.accounting;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.json.JSONObject;

import static com.jayway.jsonpath.matchers.JsonPathMatchers.hasJsonPath;
import static com.vbashur.accounting.TestContext.ACCOUNTING_BASE_URI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

public class EmployeeStepDefenitions {

    private final TestContext context;

    public EmployeeStepDefenitions(TestContext context) {
        this.context = context;
    }

    @When("user requests creation of Employee {string} with Salary {double}")
    public void userCreatesEmployeeWithSalary(String employeeName, double salary) {

        String employeeRepresentation = new JSONObject()
            .put("personalData", new JSONObject().put("name", employeeName))
            .put("financialData", new JSONObject().put("monthIncome", salary))
            .toString();

        context.setRequestResponse(given()
            .baseUri(ACCOUNTING_BASE_URI)
            .contentType(ContentType.JSON)
            .body(employeeRepresentation)
            .when()
            .post("/employee")
            .then());
    }

    @Then("response contains created Employee {string} with Salary {double}")
    public void employeeWithSalaryIsCreated(String employeeName, double salary) {

        String expectedMessage = String.format("Employee '%s' with salary '%f has been created",
            employeeName,
            salary);
        context.getRequestResponse()
            .statusCode(HttpStatus.SC_OK)
            .and()
            .body(hasJsonPath("employees", hasSize(1)))
            .body(hasJsonPath("employees[0].personalData.name", Matchers.equalToIgnoringCase(employeeName)))
            .body(hasJsonPath("employees[0].financialData.monthIncome", Matchers.equalTo(salary)))
            .body(hasJsonPath("message", Matchers.equalTo(expectedMessage)));
    }
}
