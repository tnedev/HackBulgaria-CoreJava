import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateLogger extends Logger {
    
    public DateLogger(int level) {
        super (level);
    }
    public DateLogger() {
        super();
    }
    
    @Override
    protected void printMsg(int messageLevel, String message){
        String timeStamp = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy").format(Calendar.getInstance().getTime());
        if(messageLevel<=level){
            System.out.format("| %s | %d => %s",timeStamp, messageLevel,message);
        }
    }
    
    public static void main(String[] args) {
        DateLogger dateLogger = new DateLogger();
        dateLogger.log(3, "Logger working perfectly");

    }
}
