$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com\\w2a\\facebook\\login\\Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to Facebook.com",
  "description": "\r\nIn order to access Application\r\nAs a Admin\r\nI want to login",
  "id": "login-to-facebook.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Login in to Facebook.com",
  "description": "",
  "id": "login-to-facebook.com;login-in-to-facebook.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I open \"testsiteurl\" on \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter \"username\" as \"seleniumcoaching@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter \"password\" as \"selenium123\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on \"signin\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "login should be a \"success\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "testsiteurl",
      "offset": 8
    },
    {
      "val": "browser",
      "offset": 25
    }
  ],
  "location": "LoginTest.I_open(String,String)"
});
formatter.result({
  "duration": 5866390382,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 9
    },
    {
      "val": "seleniumcoaching@gmail.com",
      "offset": 23
    }
  ],
  "location": "LoginTest.I_enter(String,String)"
});
formatter.result({
  "duration": 1020139529,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 9
    },
    {
      "val": "selenium123",
      "offset": 23
    }
  ],
  "location": "LoginTest.I_enter(String,String)"
});
formatter.result({
  "duration": 343434663,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signin",
      "offset": 12
    }
  ],
  "location": "LoginTest.I_click_on(String)"
});
formatter.result({
  "duration": 120976,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 19
    }
  ],
  "location": "LoginTest.Then_Login_should_be(String)"
});
formatter.result({
  "duration": 80547,
  "status": "passed"
});
});