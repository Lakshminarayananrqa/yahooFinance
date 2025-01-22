$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/searchTeslaStock.feature");
formatter.feature({
  "name": "Aa a user Search for stocks on Yahoo Finance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search TSLA and check the stocks details.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open the Yahoo Finance website",
  "keyword": "Given "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_open_the_Yahoo_Finance_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"TSLA\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"Tesla, Inc.\" as the first suggestion",
  "keyword": "Then "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_should_see_as_the_first_suggestion(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the first suggestion",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_click_on_the_first_suggestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check the Stock Value greater then \"200\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_check_the_Stock_Value_greater_then(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see previous close and volume values in stock detail",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_should_see_previous_close_and_volume_values_in_stock_detail()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Search GEHC and check the stocks details.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open the Yahoo Finance website",
  "keyword": "Given "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_open_the_Yahoo_Finance_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for \"GEHC\"",
  "keyword": "When "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_search_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see \"GE HealthCare Technologies Inc.\" as the first suggestion",
  "keyword": "Then "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_should_see_as_the_first_suggestion(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the first suggestion",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_click_on_the_first_suggestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user check the Stock Value greater then \"30\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_check_the_Stock_Value_greater_then(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see previous close and volume values in stock detail",
  "keyword": "And "
});
formatter.match({
  "location": "step.searchTeslaStockStep.user_should_see_previous_close_and_volume_values_in_stock_detail()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});