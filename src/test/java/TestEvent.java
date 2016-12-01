import event_mechanism.Event;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class TestEvent {
    private Event event;

    @Test
    public  void testGetEvent() throws ParseException {
        event = new Event();
        switch (event.getEvent()){
            case "MORNING": break;
            case "DAY": break;
            case "EVENING":break;
            case "NIGHT": break;
            default:
                Assert.fail();
        }
    }

    @Test
    public void testNightFirst()throws ParseException{
        event = new Event("23:00:00");
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightSecond()throws ParseException{
        event = new Event("05:59:59");
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightThree()throws ParseException{
        event = new Event("23:00:01");
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testNightFour()throws ParseException{
        event = new Event("02:00:00");
        Assert.assertEquals(event.getEvent(), "NIGHT");
    }

    @Test
    public void testMorningFirst()throws ParseException{
        event = new Event("06:00:01");
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningSecond()throws ParseException{
        event = new Event("08:59:59");
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningThree()throws ParseException{
        event = new Event("07:25:01");
        Assert.assertEquals(event.getEvent(), "MORNING");
    }

    @Test
    public void testMorningFour()throws ParseException{
        event = new Event("08:00:00");
        Assert.assertEquals(event.getEvent(), "MORNING");
    }
    @Test
    public void testDayFirst()throws ParseException{
        event = new Event("09:00:01");
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDaySecond()throws ParseException{
        event = new Event("18:59:59");
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDayThree()throws ParseException{
        event = new Event("15:35:51");
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testDayFour()throws ParseException{
        event = new Event("16:53:15");
        Assert.assertEquals(event.getEvent(), "DAY");
    }

    @Test
    public void testEveningFirst()throws ParseException{
        event = new Event("19:00:01");
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningSecond()throws ParseException{
        event = new Event("22:59:59");
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningThree()throws ParseException{
        event = new Event("21:25:01");
        Assert.assertEquals(event.getEvent(), "EVENING");
    }

    @Test
    public void testEveningFour()throws ParseException{
        event = new Event("22:00:00");
        Assert.assertEquals(event.getEvent(), "EVENING");
    }



}