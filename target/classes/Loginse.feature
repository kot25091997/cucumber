Feature: login
Description: login application


Scenario:Login valid combination
Given user opens newtours application
When user enter username as "mercury" and password as "mercury"
And click submit button
Then valid successful login 