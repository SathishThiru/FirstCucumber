$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Feature to test user screen related functionalitites",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@user"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "the user opens the application in \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters prints the below data",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Username",
        "DOB"
      ]
    },
    {
      "cells": [
        "\u003cUserName\u003e",
        "\u003cPassword\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "the user enters username as \"\u003cUserName\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "login should be successful with the \"\u003cExpected Message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "Expected Message",
        "Browser"
      ]
    },
    {
      "cells": [
        "Nivi2296",
        "Saravanan@2296",
        "Welcome to Adactin Group of Hotels",
        "chrome"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@user"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "the user opens the application in \"chrome\"",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDef.launchApp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters prints the below data",
  "rows": [
    {
      "cells": [
        "Username",
        "DOB"
      ]
    },
    {
      "cells": [
        "Nivi2296",
        "Saravanan@2296"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.readData(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username as \"Nivi2296\" and password as \"Saravanan@2296\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDef.enterCredentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login should be successful with the \"Welcome to Adactin Group of Hotels\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.validateLogin(String)"
});
formatter.result({
  "status": "passed"
});
});