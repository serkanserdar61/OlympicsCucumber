package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.TestCase1Pages;
import utilities.MyDriver;

public class TestCase1Steps extends TestCase1Pages {

	@Given("user is on landing page")
	public void user_is_on_landing_page() throws InterruptedException {
		Thread.sleep(2000);
		String expected="https://en.wikipedia.org/wiki/2016_Summer_Olympics#Medal_table";
		String actual= MyDriver.get().getCurrentUrl();
		Assert.assertEquals(expected,actual,"something not matching");
		System.out.println("Landing page verifications is passed");
	}

	@Given("verify the Rank column is sorted")
	public void verify_the_Rank_column_is_sorted() throws InterruptedException {
		rankSortSet();
	}

	@Given("Click on NOC and verify that tables is sorted by the country names")
	public void click_on_NOC_and_verify_that_tables_is_sorted_by_the_country_names() {
		nocClick();
	}

	@Then("verify that rank column is NOT in ascending order.")
	public void verify_that_rank_column_is_NOT_in_ascending_order() {
		rankIsNotInAscendingOrder();
	}

}
