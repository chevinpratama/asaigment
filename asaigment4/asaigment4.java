package June2021.qaautomation;

import org.testng.annotations.Test;

import June2021.qaautomation.pages.makemytrip;

/**
 * Unit test for simple App.
 */
public class asaigment4 extends BaseWebTest4 {
	makemytrip tiket = new makemytrip(driver, explicitWait);

	@Test(testName = "from", description = "get mails body")
	public void test1() {

		String price = tiket.tiket("Jakarta", "Delhi");
		System.out.print(price);
	}

}
