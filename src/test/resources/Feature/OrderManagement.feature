@OrderManagement
Feature: Order Management

  @CreateOrder
  Scenario Outline: Create Order AS A Registered Customer


    Given I am on Login page
    When I enter "<Email>" "<Password>"
    And I click sign in
    When I Create new order "<Product>"
    And I Search for product
    And I add Product to order
    And I select order details page
    And I submit order
    Then My order summary should displayed


    Examples:
      | Product  | Email                 | Password |
      | WomenBag | Didi-ray330@gmail.com | Dada@123 |
