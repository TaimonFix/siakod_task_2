public class ConsoleLogger extends Logger{

    public ConsoleLogger(int status) {
        super(status);
    }

    @Override
    public void write(String message) {
        System.out.println("The message will be saved to a console: " + message);

    }
}
