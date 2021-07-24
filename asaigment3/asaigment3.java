package June2021.qaautomation;

import org.testng.annotations.Test;

import June2021.qaautomation.pages.CommonPage;
import June2021.qaautomation.pages.YopMail;

public class asaigment3 extends BaseWebTest {

	CommonPage commonPage = new CommonPage(driver, explicitWait);

	@Test
	public void switching() {

		commonPage.openNewTab();
		commonPage.switchWindow(1);
		commonPage.openUrl("https://yopmail.com");
		String mail = "automation";

		YopMail.login(mail);
		commonPage.switchiFrame();
		// System.out.println(body.getText());

	}

	YopMail YopMail = new YopMail(driver, explicitWait);

}
