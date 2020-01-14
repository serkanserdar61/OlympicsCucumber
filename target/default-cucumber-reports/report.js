$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestCase1.feature");
formatter.feature({
  "name": "Verifying table information",
  "description": "  As a user I should able to verify and compare the data in given table",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "  Verify that Rank column is sorted by default.",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the Rank column is sorted",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.verify_the_Rank_column_is_sorted()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on NOC and verify that tables is sorted by the country names",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.click_on_NOC_and_verify_that_tables_is_sorted_by_the_country_names()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that rank column is NOT in ascending order.",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase1Steps.verify_that_rank_column_is_NOT_in_ascending_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase2.feature");
formatter.feature({
  "name": "The first from the bottom",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "  Write a method that returns country names with smallest numbers by medals",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find country who has the smallest number of gold medals",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.find_country_who_has_the_smallest_number_of_gold_medals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find country who has the smallest number of silver medals",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.find_country_who_has_the_smallest_number_of_silver_medals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "find country who has the smallest number of bronze medals",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase2Steps.find_country_who_has_the_smallest_number_of_bronze_medals()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "print the number of smalles from Total Medals",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase2Steps.print_the_number_of_smalles_from_Total_Medals()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase3.feature");
formatter.feature({
  "name": "Country By Medal",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "  Write a method that returns a list of countries names by their silver medals",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the countries number of silver medals along with country names",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase3Steps.get_the_countries_number_of_silver_medals_along_with_country_names()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase4.feature");
formatter.feature({
  "name": "Get Index",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "  Write a method that takes country name and returns the row and column number\n  of that country in that table",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find the \"Japan\" row and column",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase4Steps.find_the_row_and_column(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TestCase5.feature");
formatter.feature({
  "name": "Get Sum",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "  Write a method that returns a list of\n  two countries whose sum of bronze medals is 18",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase1Steps.user_is_on_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the all countires whoes total bronze medal sum is 18",
  "keyword": "And "
});
formatter.match({
  "location": "TestCase5Steps.check_the_all_countires_whoes_total_medal_sum_is()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});