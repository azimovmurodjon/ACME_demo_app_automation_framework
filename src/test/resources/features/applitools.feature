Feature: Applitools Demo

  Scenario: Verify the login page with Applitools
    Given I open the Applitools demo login page
    When I perform visual validation for the login page
    Then I close the browser

  Scenario: Login with valid credentials
    Given I open the Applitools demo login page
    And I perform visual validation for the login page
    When I enter the username "admin" and password "admin"
    And I click the login button
    Then I should see the dashboard