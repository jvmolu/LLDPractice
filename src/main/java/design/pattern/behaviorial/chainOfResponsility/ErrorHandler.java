package design.pattern.behaviorial.chainOfResponsility;

public class ErrorHandler extends LogHandler{

    @Override
    public void log(LoggerType loggerType, String message) {
        if(loggerType == LoggerType.ERROR && checkSeverity(loggerType)) {
            System.out.println("ERROR: " + message);
        } else {
            next(loggerType, message);
        }
    }
}
