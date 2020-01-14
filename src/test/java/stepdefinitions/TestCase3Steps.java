package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestCase3Pages;

public class TestCase3Steps extends TestCase3Pages {

	@Given("get the countries number of silver medals along with country names")
	public void get_the_countries_number_of_silver_medals_along_with_country_names() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println(medal18());
	}

}
