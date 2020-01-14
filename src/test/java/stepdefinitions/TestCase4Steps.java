package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestCase4Pages;

public class TestCase4Steps extends TestCase4Pages {

	@Given("Find the {string} row and column")
	public void find_the_row_and_column(String desiredCountry) {
		System.out.println("Row and Column Nanumber of " +desiredCountry+ " is "+ rowColumn(desiredCountry));
	}


}
