@Rest
Feature: Record a new trade
  @RestDemo
  Scenario: Validate the post request
    Given Generate Token for following Client:
    | clientName 	| clientEmail 							 |
    | Postman     | valetin12356@example.com   |
    When I Create Order for following tools
    | toolId 			| customerName 							 |
    | 1709    	  | John Doe   								 | 
    Then the order created sucessfully

