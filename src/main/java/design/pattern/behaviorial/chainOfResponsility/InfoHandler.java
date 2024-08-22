package design.pattern.behaviorial.chainOfResponsility;

public class InfoHandler extends LogHandler{
    @Override
    public void log(LoggerType loggerType, String message) {
        if(loggerType == LoggerType.INFO && checkSeverity(loggerType)) {
            System.out.println("INFO: " + message);
        } else {
            next(loggerType, message);
        }
    }
}
