package CustomLogging;

import org.apache.log4j.*;

import java.io.FileWriter;
import java.io.IOException;

public class CustomLogger {
    private static final String PATH_TO_LOG_FILE = "C:\\Users\\alman\\IdeaProjects\\CommandJavaLibsPlayground\\src\\main\\java\\test.log";

    private static CustomLogger instance;
    private Logger logger;

    public static CustomLogger getInstance() throws IOException {
        if(instance == null){
            instance = new CustomLogger();
            instance.logger = new LoggerBuilder()
                                    .addConsoleAppender()
                                    .addFileAppender(PATH_TO_LOG_FILE)
                                    .build();
        }

        return instance;
    }

    public void info(String message){
        logger.info(message);
    }

    public void error(String message){
        logger.error(message);
    }

    public void warning(String message){
        logger.warn(message);
    }
}
