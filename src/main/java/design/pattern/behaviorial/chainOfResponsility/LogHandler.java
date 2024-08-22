package design.pattern.behaviorial.chainOfResponsility;

public abstract class LogHandler {
    protected LogHandler successor;
    protected static LoggerType severityLevel;
    LogHandler() {
        this.successor = null;
    }
    LogHandler(LogHandler successor) {
        this.successor = successor;
    }
    public abstract void log(LoggerType loggerType, String message);
    public void setSuccessor(LogHandler successor) {
        this.successor = successor;
    }
    protected void next(LoggerType loggerType, String message) {
        if(successor != null) {
            successor.log(loggerType, message);
        }
    }
    public static void setSeverityLevel(LoggerType severityLevel) {
        LogHandler.severityLevel = severityLevel;
    }
    protected boolean checkSeverity(LoggerType loggerType) {
        return loggerType.getLevel() >= severityLevel.getLevel();
    }
}
