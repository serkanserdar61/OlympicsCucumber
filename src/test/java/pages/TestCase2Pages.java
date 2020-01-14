package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.MyDriver;

import java.util.List;

public class TestCase2Pages {

	public String goldMedals() {
		//Getting the URL from configuration file.



		List<WebElement> leastGoldCountry = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		List<WebElement> leastGoldNo = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[2]"));

		int min = Integer.parseInt(leastGoldNo.get(0).getText());
		int countryRank = 0;

		for (int i = 1; i < leastGoldNo.size() - 1; i++) {
			//in table 11-86 is jumping other table cells and due to that I have put try-catch block to avoid string-integer conversion error.
			try {
				if (Integer.parseInt(leastGoldNo.get(i).getText()) < min) {
					min = Integer.parseInt(leastGoldNo.get(i).getText());
					countryRank = i;
				}
			}catch (Exception e){

			}
		}
		return leastGoldCountry.get(countryRank).getText().trim();

	}


	public String silverMedals() {

		List<WebElement> silverCountry = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		List<WebElement> silverNo = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[3]"));

		int min = Integer.parseInt(silverNo.get(0).getText());
		int countryRank = 0;

		for (int i = 1; i < silverNo.size() - 1; i++) {

			try {
				if (Integer.parseInt(silverNo.get(i).getText()) < min) {

					min = Integer.parseInt(silverNo.get(i).getText());
					countryRank = i;

				}
			}catch (Exception e){

			}
		}

		return silverCountry.get(countryRank).getText().trim();
	}

	public String bronzeMedals() {

		List<WebElement> bronzeMedals = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		List<WebElement> bronzeMedalsNo = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[4]"));

		int min = Integer.parseInt(bronzeMedalsNo.get(0).getText());
		int countryRank = 0;

		for (int i = 1; i < bronzeMedalsNo.size() - 1; i++) {

			try {
				if (Integer.parseInt(bronzeMedalsNo.get(i).getText()) < min) {

					min = Integer.parseInt(bronzeMedalsNo.get(i).getText());
					countryRank = i;

				}
			}catch(Exception e){

			}
		}

		return bronzeMedals.get(countryRank).getText().trim();

	}

	public String leastMedals() {


		List<WebElement> totalMedals = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[5]"));
		List<WebElement> country = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		int min = Integer.parseInt(totalMedals.get(0).getText());
		int countryRank = 0;

		for (int i = 1; i < totalMedals.size() - 1; i++) {

			try {
				if (Integer.parseInt(totalMedals.get(i).getText()) < min) {
					min = Integer.parseInt(totalMedals.get(i).getText());
					countryRank = i;

				}
			}catch (Exception e){

			}
		}

		return country.get(countryRank).getText().trim();
	}

}
