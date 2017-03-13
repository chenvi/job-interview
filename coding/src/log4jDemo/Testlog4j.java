package log4jDemo;

import org.apache.log4j.Logger;

public class Testlog4j {
	private static Logger logger = Logger.getLogger(Testlog4j.class);
	
	public static void main(String[] args) {
		logger.debug("this is debug message.");
		logger.info("this is info message.");
		logger.error("this is error message.");
	}

}
