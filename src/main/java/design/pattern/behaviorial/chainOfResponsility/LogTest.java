package design.pattern.behaviorial.chainOfResponsility;

public class LogTest {

    public static void main(String[] args) {

        LogHandler debugHandler = new DebugHandler();
        LogHandler infoHandler = new InfoHandler();
        LogHandler errorHandler = new ErrorHandler();

        debugHandler.setSuccessor(infoHandler);
        infoHandler.setSuccessor(errorHandler);

        LogHandler.setSeverityLevel(LoggerType.ERROR);

        debugHandler.log(LoggerType.DEBUG, "This is a debug message");
        debugHandler.log(LoggerType.INFO, "This is an info message");
        debugHandler.log(LoggerType.ERROR, "This is an error message");
    }

}
