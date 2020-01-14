Feature:Verifying table information
  As a user I should able to verify and compare the data in given table

  Scenario:
  Verify that Rank column is sorted by default.
    Given user is on landing page
    Given verify the Rank column is sorted
    Given Click on NOC and verify that tables is sorted by the country names
    Then verify that rank column is NOT in ascending order.