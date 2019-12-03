Feature: checking status of the service
    As User
    I want to be able to read/update and delete employee data

    Background:
        Given service is running


    Scenario: User is able to create a new Employee

        When user requests creation of Employee "Smith" with Salary 1000.0
        Then response contains created Employee "Smith" with Salary 1000.0


