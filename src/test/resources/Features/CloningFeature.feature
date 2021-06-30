Feature: Cloning Feature
  Scenario:Login to the website
    Given user is on login page
    When user enters username and password
    Then user is logged in

  Scenario: Cloning Product
    Given user is on product page
    When user click on clone icon
    And save the product with new name
    Then a success alert is shown on top of the page

    @browser
  Scenario: checking cloned product and changing price
    Given product is cloned
    When user checks the added product name
    And click on price and change its price
    Then click on save to save the item





