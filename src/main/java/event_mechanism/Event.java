package event_mechanism;

import org.apache.log4j.Logger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class Event {

    private static final Logger log = Logger.getLogger(Event.class);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Date current;
    private Date morning;
    private Date day;
    private Date evening;
    private Date night;
    private Date currentDate;

    public Event(){
       currentDate = new Date();
    }
    public Event(String event) throws ParseException{
        currentDate = dateFormat.parse(event);
    }

    public String  getEvent() throws ParseException{

        Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("bundle");

        current = dateFormat.parse(dateFormat.format(currentDate));
        morning  = dateFormat.parse(BorderEvent.MORNING.toString());
        day  = dateFormat.parse(BorderEvent.DAY.toString());
        evening = dateFormat.parse(BorderEvent.EVENING.toString());
        night = dateFormat.parse(BorderEvent.NIGHT.toString());

        if(current.after(morning) && current.before(day)){
            System.out.println(res.getString("morning"));
            log.info(res.getString("morning"));
            return "MORNING";
        }
        else if (current.after(day) && current.before(evening)){
            System.out.println(res.getString("day"));
            log.info(res.getString("day"));
            return "DAY";
        }
        else if (current.after(evening) && current.before(night)){
            System.out.println(res.getString("evening"));
            log.info(res.getString("evening"));
            return "EVENING";
        }
        else
            System.out.println(res.getString("night"));
            log.info(res.getString("night"));
            return "NIGHT";
}

}
