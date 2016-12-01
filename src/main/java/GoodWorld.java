import event_mechanism.Event;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GoodWorld {

    private static final Logger log = Logger.getLogger(GoodWorld.class);

    public static void main(String[] args) {

        Event event = new Event();

        String events = null;
        try {
            events = event.getEvent();
            System.out.println(events);
        }catch (ParseException e){
            log.error("Parse exception", e);
        }

    }

}

