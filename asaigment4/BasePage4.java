package June2021.qaautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import June2021.qaautomation.utils.Util;

public class BasePage4 {
	Util util = new Util();
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

	public BasePage4(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}

	protected final void clickAndWaitByXpath(By locator) {
		explicitWait.get().until(ExpectedConditions.elementToBeClickable(locator));
		driver.get().findElement(locator).click();
	}

	protected final void clickOnly(By locator) {
		driver.get().findElement(locator).click();
	}

	protected final void setText(By locator, String text) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.get().findElement(locator).sendKeys(text);
	}

	protected final String getText(By locator) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.get().findElement(locator).getText();
	}

	protected final void switchIframe(int locator) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(By.tagName("iframe")));
		driver.get().switchTo().frame(locator);

	}

	protected final void setCity(By locator, String text) {
		explicitWait.get().until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement list = driver.get().findElement(locator);

		util.hardWait(2);
		list.sendKeys(text);
		util.hardWait(3);
		list.sendKeys(Keys.ARROW_DOWN);
		util.hardWait(2);
		list.sendKeys(Keys.ENTER);
		util.hardWait(2);

	}

}
