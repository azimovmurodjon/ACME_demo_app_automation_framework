Feature: Applitools Demo

  Background: Open the Applitools demo login page
    Given I open the Applitools demo login page

  Scenario: Verify the login page with Applitools
    When I perform visual validation for the login page
    Then I close the browser

  Scenario: Login with valid credentials
    And I perform visual validation for the login page
    When I enter the username "admin" and password "admin"
    And I click the login button
    Then I should see the dashboard
    Then I close the browser

  Scenario Outline: Try To login with multiple valid credentials
    And I perform visual validation for the login page
    When I enter the username "<username>" and password "<password>"
    And I click the login button
    Then I should see the dashboard
    Then I close the browser
    Examples:
      | username | password |
      | admin    | admin    |
      | user1    | user1    |
      | user2    | user2    |
      | user3    | user3    |
      | user4    | user4    |
      | user5    | user5    |