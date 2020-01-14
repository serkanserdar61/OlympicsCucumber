package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.MyDriver;

import java.util.ArrayList;
import java.util.List;

public class TestCase5Pages {

	public List<String> bronzeMedalListCountries() {

		List<WebElement> countryNameBronze18 = MyDriver.get().findElements(By.xpath("//table[9]/tbody[1]/tr/th[1]"));

		List<WebElement> bronzeMedal18 = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[3]"));

		List<String> countryHaving18BronzeMedal = new ArrayList<String>();

		for (int i = 1; i < bronzeMedal18.size() - 1; i++) {

			if (Integer.parseInt(bronzeMedal18.get(i).getText()) == 18) {
				countryHaving18BronzeMedal.add(countryNameBronze18.get(i).getText().trim());
			}
		}
		return countryHaving18BronzeMedal;

	}

}
