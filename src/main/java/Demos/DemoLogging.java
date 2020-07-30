package Demos;

import CustomLogging.CustomLogger;
import java.io.IOException;

public class DemoLogging {
    public static void main(String[] args) throws IOException {
        CustomLogger logger = CustomLogger.getInstance();
        logger.info("Testing");
        logger.error("Testing");
        logger.warning("Testing");
    }
}
