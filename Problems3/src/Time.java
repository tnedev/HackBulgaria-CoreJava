import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {

    private String time;

    private Time(String time){
        this.time = time; 
    }
    @Override
    public String toString(){
        return time;      
    }
    
    public String now(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.YY");
        return sdf.format(cal.getTime());
    }
}
