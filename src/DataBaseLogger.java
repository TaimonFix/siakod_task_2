public class DataBaseLogger extends Logger{

    public DataBaseLogger(int status) {
        super(status);
    }

    @Override
    public void write(String message) {
        System.out.println("The message will be saved to a DataBase: " + message);
    }
}
