Feature: Applitools Demo

  Scenario: Verify the login page with Applitools
    Given I open the Applitools demo login page
    When I perform visual validation for the login page
    Then I close the browser
