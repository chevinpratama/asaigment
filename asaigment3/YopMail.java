package June2021.qaautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YopMail extends BasePage {

	By login = By.id("login");
	By klik = By.xpath("//*[@id=\"refreshbut\"]/button/i");

	public YopMail(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		PageFactory.initElements(driver.get(), this);
	}

	public void login(String mail) {

		setText(login, mail);
		clickAndWaitByXpath(klik);
	}

}