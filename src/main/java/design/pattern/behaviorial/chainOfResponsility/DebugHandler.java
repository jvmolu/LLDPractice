package design.pattern.behaviorial.chainOfResponsility;

public class DebugHandler extends LogHandler{

    @Override
    public void log(LoggerType loggerType, String message) {
        if(loggerType == LoggerType.DEBUG && checkSeverity(loggerType)) {
            System.out.println("DEBUG: " + message);
        } else {
            next(loggerType, message);
        }
    }
}
