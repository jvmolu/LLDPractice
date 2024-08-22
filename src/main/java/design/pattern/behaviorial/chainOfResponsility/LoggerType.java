package design.pattern.behaviorial.chainOfResponsility;

public enum LoggerType {
    DEBUG("debug", 1),
    INFO("info", 2),
    ERROR("error", 3);

    private String type;

    private int level;

    LoggerType(String type, int level) {
        this.type = type;
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

}
