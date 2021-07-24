package June2021.qaautomation.utils;

public class Util {
	public void hardWait(int seconds) {

		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
