package CustomLogging;

import org.apache.log4j.*;

import java.io.FileWriter;
import java.io.IOException;

public class LoggerBuilder implements ILoggerBuilder {
    public static final String FULL_DATETIME_PATTERN = "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p - %m%n";

    private final Logger logger;

    public LoggerBuilder(){
        logger = LogManager.getLogger(CustomLogger.class);
    }

    @Override
    public final LoggerBuilder addFileAppender(final String path) throws IOException {
        addFileAppender(path, FULL_DATETIME_PATTERN);

        return this;
    }

    @Override
    public final LoggerBuilder addFileAppender(final String path, final String pattern) throws IOException {
        FileAppender appender = new FileAppender();
        appender.setName("File appender");
        FileWriter fileWriter = new FileWriter(path, true);
        appender.setWriter(fileWriter);
        appender.setLayout(new PatternLayout(pattern));

        BasicConfigurator.configure(appender);

        return this;
    }

    @Override
    public final LoggerBuilder addConsoleAppender(){
        addConsoleAppender(FULL_DATETIME_PATTERN);

        return this;
    }

    @Override
    public final LoggerBuilder addConsoleAppender(final String pattern){
        ConsoleAppender appender = new ConsoleAppender(new PatternLayout(pattern));
        appender.setName("Console appender");

        BasicConfigurator.configure(appender);

        return this;
    }

    @Override
    public final Logger build(){
        return logger;
    }
}
