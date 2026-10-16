abstract class Logger{
    String level;
    
    public Logger(String level){
       this.level = level;
    }

    public String formatMessage(String message){
        return "["+level+"]"+message;
    }

    public abstract void log(String message);
}

class ConsoleLogger extends Logger{

    public ConsoleLogger(String level){
        super(level);
    }

    
    public void log(String message){
        System.out.println("Console ->" + formatMessage(message) );
    }
}
class FileLogger extends Logger{
    private String filePath;
    public FileLogger(String level,String filePath){
        super(level);
        this.filePath = filePath;
    }
    public void log(String message){
        System.out.println("file"+ "[" +filePath+ "]"+"->"+formatMessage(message));
    }   
}

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger("info");
        Logger fileLogger = new FileLogger("info", "logs/app.log");
        consoleLogger.log("I am good");
        fileLogger.log("I am nice");
    }
}