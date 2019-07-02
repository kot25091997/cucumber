Feature: Login Test
Description: Registered user can login into application using valid username and valid password


Scenario: Login with valid combination
When search for product
|iphone|
|travel kit|
|headphone|
And verify products display
Then close the application