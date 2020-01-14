package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TestCase2Pages;

public class TestCase2Steps extends TestCase2Pages {

	@Given("find country who has the smallest number of gold medals")
	public void find_country_who_has_the_smallest_number_of_gold_medals() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Gold Medals");
		System.out.println(goldMedals());
		System.out.println();
	}

	@Given("find country who has the smallest number of silver medals")
	public void find_country_who_has_the_smallest_number_of_silver_medals() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Silver Medals");
		System.out.println(silverMedals());
		System.out.println();
	}

	@Given("find country who has the smallest number of bronze medals")
	public void find_country_who_has_the_smallest_number_of_bronze_medals() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Bronze Medals");
		System.out.println(bronzeMedals());
		System.out.println();
	}

	@Then("print the number of smalles from Total Medals")
	public void print_the_number_of_smalles_from_Total_Medals() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Least Medals in total");
		System.out.println(leastMedals());
	}








}
