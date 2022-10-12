public abstract class Logger {

    private int status;

    public Logger(int status) {
        this.status = status;
    }

    private Logger nextLogger;

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(String message, int level) {
        if (level >= status) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.log(message, level);
        }

    }

    public abstract void write(String message);
}

