package romans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMain {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(MyMain.class);

		int counter = 0;
		
		do {
			logger.info("XXXXXXY: "+counter);
			counter++;
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (counter < 20);

	}

}
