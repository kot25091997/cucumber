$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/loginse.feature");
formatter.feature({
  "name": "login",
  "description": "Description: login application",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login valid combination",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens newtours application",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginse.user_opens_newtours_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"mercury\" and password as \"mercury\"",
  "keyword": "When "
});
formatter.match({
  "location": "Loginse.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Login1.click_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valid successful login",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginse.valid_successful_login()"
});
formatter.result({
  "status": "passed"
});
});