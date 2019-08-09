@AddToBasket
Feature: Add product to basket
  As a customer
  I want to add a product to the basket
  So I can checkout 

  @AddToBasketContainingSubTotal
  Scenario Outline: Add product to basket already containing subtotal
    Given a product is priced at "<price>"
    And the basket total is "<subtotal>"
		When I add it to the basket
		Then the total basket price should be "<total>"

    Examples:
      | price | subtotal | total |
      | 15    | 6        | 21    |
      | 25    | 7        | 32    |
