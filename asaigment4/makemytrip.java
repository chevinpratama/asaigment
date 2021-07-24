package June2021.qaautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import June2021.qaautomation.utils.Util;

public class makemytrip extends BasePage4 {

	By from = By.xpath("//*[@id=\"fromCity\"]");
	By fromCity = By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']");
	By to = By.xpath("//*[@id=\"toCity\"]");
	By toCity = By.xpath("//*[@id=\'react-autowhatever-1-section-0-item-0\']");
	By departure = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]");

	Util util = new Util();

	/**
	 * @param driver
	 */
	public makemytrip(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public String tiket(String city1, String city2) {
		By from = By.xpath("//input[@placeholder='From']");
		By to = By.xpath("//input[@placeholder='To']");
		By search = By.xpath("//a[normalize-space()='Search']");
		By price = By.xpath("//div[@id='premEcon']/div/div[1]/div/div[2]/div[2]/div/div/p");
		By date = By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']");

		clickAndWaitByXpath(By.xpath("//span[text()='From']"));
		setCity(from, city1);
		setCity(to, city2);
		clickAndWaitByXpath(date);
		clickAndWaitByXpath(search);
		return getText(price);
	}

}
