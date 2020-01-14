package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.MyDriver;

import java.util.List;

public class TestCase4Pages {

	public String rowColumn(String country) {

		List<WebElement> desiredCountryList = MyDriver.get().findElements(
				By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		String rowColumn = "";
		for (int i = 0; i < desiredCountryList.size(); i++) {

			if (country.equalsIgnoreCase(desiredCountryList.get(i).getText().trim().substring(0, desiredCountryList.get(i).getText().trim().indexOf(" ")))) {
				rowColumn += (i + 1) + " 2";
			}
		}
		return rowColumn;
	}
}
