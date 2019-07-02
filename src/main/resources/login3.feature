Feature: signup
Background: display Welcome
Given application display Welcome
  
  Scenario Outline: test signup
  
  Given open signup page
  When user enters firstname as "<firstname>"
  And user enters the lastname as"<lastname>"
  And user enters the DOB as"<DOB>"
  And user enters the password as"<password>"
  And user enters the confirm password as"<confirm password>"
  Then click signup button
  And verify the signup success message
  
  
  
  
  Examples:
  |firstname|lastname|DOB|password|confirm password|
  |kothai|sakthi|22/02/1997|koth|koth|
  |ko|sakthi|22/02/1997|koth|koth|
  |koth|sakthi|22/02/1997|koth|koth|