
Feature: Aa a user Search for stocks on Yahoo Finance

  Scenario: Search TSLA and check the stocks details.
    Given user open the Yahoo Finance website
    When user search for "TSLA"
    Then user should see "Tesla, Inc." as the first suggestion
    And user click on the first suggestion
    And user check the Stock Value greater then "200"
    And user should see previous close and volume values in stock detail
    
    
  Scenario: Search GEHC and check the stocks details.
    Given user open the Yahoo Finance website
    When user search for "GEHC"
    Then user should see "GE HealthCare Technologies Inc." as the first suggestion
    And user click on the first suggestion
    And user check the Stock Value greater then "30"
    And user should see previous close and volume values in stock detail