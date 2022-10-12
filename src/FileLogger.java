public class FileLogger extends Logger {

    public FileLogger(int status) {
        super(status);
    }

    @Override
    public void write(String message) {
        System.out.println("The message will be saved to a file: " + message);

    }
}
