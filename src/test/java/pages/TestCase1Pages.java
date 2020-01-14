package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.MyDriver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.assertNotEquals;

public class TestCase1Pages {

	public void rankSortSet() throws InterruptedException {

		//checking the Rank is sorted or not
		List<WebElement> rank = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[1]"));

		for (int i = 0; i < rank.size() - 2; i++) {

			int actual = Integer.parseInt(rank.get(i).getText());
			Assert.assertEquals(actual, ++i, "something wrong");
		}
		System.out.println("Sorting is correct");

	}
	public void nocClick() {
		//Clicking the NOC
		MyDriver.get().findElement(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//th[.='NOC']")).click();

		List<String> countryListActual = new ArrayList<String>();

		List<WebElement> element = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th/a"));

		// Adding country list to our list
		for (WebElement each : element) {

			countryListActual.add(each.getText());
		}
		//Sorting the country list to compare with actual one.
		Collections.sort(countryListActual);

		//retrieving the country list to compare.
		for (int i = 0; i < element.size(); i++) {

			String actual = element.get(i).getText();
			Assert.assertEquals(actual, countryListActual.get(i));
		}
		System.out.println("Country list match");

	}
	public void rankIsNotInAscendingOrder(){
		//Verifying Rank column is not ascending order.
		List<WebElement> notSorted = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[1]"));
		int actual = 0;
		for (int j = 0; j < notSorted.size(); j++) {
			//in table 11-86 is jumping other table cells and due to that I have put try-catch block to avoid string-integer conversion error.
			try {
				actual = Integer.parseInt(notSorted.get(j).getText());
			} catch (Exception e) {
				System.out.println("not integer");
			}
			assertNotEquals(actual, j + 1);
		}
		System.out.println("Ranking sorting is not in ascenting order.");

	}

}

