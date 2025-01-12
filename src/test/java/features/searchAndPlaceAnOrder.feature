Feature: Search and Place the order for Products


@regression
Scenario Outline: Search Experience for product search in ecommerce website
Given User is on Holbi Group Landing page
When user entered "sofa" in the search bars
Then I select the product Name
And I add Product to cart
And I select payWithCard as option for payment
And I enter the shipping address with the following details:
  | firstName   | secondName | streetAddress | postCode | city       | country | emailAddress      |
  | <firstName> | <secondName> | <streetAddress> | <postCode> | <city> | <country> | <emailAddress> |
And I select payment Option
And I click on terms and conditions
Then I place an Order
  Examples:
    | firstName | secondName | streetAddress | postCode | city | country | emailAddress             |
    | Mahender  |   kumar   |park street     |5000056   |Hyderabad|India |  gowlikarmahi@gmail.com  |
