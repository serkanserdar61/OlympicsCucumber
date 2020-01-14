package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.TestCase5Pages;

public class TestCase5Steps extends TestCase5Pages {

	@Given("check the all countires whoes total bronze medal sum is 18")
	public void check_the_all_countires_whoes_total_medal_sum_is() {
		System.out.println(bronzeMedalListCountries());
	}

}
