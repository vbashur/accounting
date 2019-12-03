Feature: checking status of the service
    As Ops
    I want to be able to check the application status

    Background:
        Given service is running

    Scenario: status endpoint contains mandatory fields
        When I request the status of my service
        Then the service responds with OK
        And response is valid json
        And response contains non empty "version"
