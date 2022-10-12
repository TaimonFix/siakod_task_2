public class ChainOfResponsibility {

    public static void main(String[] args) {
    Logger fileLogger = new FileLogger(Status.INFO);
    Logger consoleLogger = new ConsoleLogger(Status.DEBUG);
    Logger dataBaseLogger = new DataBaseLogger(Status.ERROR);

    fileLogger.setNextLogger(consoleLogger);
    consoleLogger.setNextLogger(dataBaseLogger);

    fileLogger.log("Successful!", Status.INFO);
    fileLogger.log("Debugging required...", Status.DEBUG);
    fileLogger.log("This is an ERROR information.", Status.ERROR);
    }
}