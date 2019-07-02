
Feature: login
  
Description: two scenarios


  Scenario: Login with valid combination
Given user opens login page in newtours application
When user enter the username as "mercury" And password as "mercury" 
And  submit login form
Then verify login success
 
 Scenario: Login with invalid combination
Given user opens login page in newtours application
When user enter the username as "kothai" And password as "sakthi" 
And submit login form
Then verify login failure