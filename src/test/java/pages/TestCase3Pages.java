package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.MyDriver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCase3Pages {

	public Map<String,Integer> medal18() {

		List<WebElement> countrySilver18 = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/th"));
		List<WebElement> silver18 = MyDriver.get().findElements(By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']/tbody/tr/td[3]"));

		Map<String,Integer> results = new HashMap<>();


		for (int i = 1; i < silver18.size() - 1; i++) {
			results.put( countrySilver18.get(i).getText().trim(),Integer.parseInt(silver18.get(i).getText()));
		}

		return results;

	}
}
