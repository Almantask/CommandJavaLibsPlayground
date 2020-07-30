package CustomLogging;

import org.apache.log4j.Logger;

import java.io.IOException;

public interface ILoggerBuilder {
    LoggerBuilder addFileAppender(String path) throws IOException;

    LoggerBuilder addFileAppender(String path, String pattern) throws IOException;

    LoggerBuilder addConsoleAppender();

    LoggerBuilder addConsoleAppender(String pattern);

    Logger build();
}
