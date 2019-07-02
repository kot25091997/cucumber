Feature: Test background

Background: display Welcome
Given application display Welcome
@smoke @regression
Scenario: signin
Given un and password
And click signin
@regression
Scenario: Search for the product
When user searches for product headphone
@regression

Scenario: Add to cart
When user assing product to cart
@regression
 
 Scenario: payment process
 When user performing payment process using netbanking
 @smoke @regression
 Scenario: sign out
 When user click signout