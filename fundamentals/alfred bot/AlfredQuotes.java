import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return String.format("Hello %s, welcome to Wayne Manor.", name);
    }
    
    // ninja bonus: accept period of day 
    public String guestGreeting(String name, String dayPeriod) {
        // initialize response string
        String guestGreetingString = "";
        // test for time of data and create custom response
        if (dayPeriod.equals("morning")) {
            guestGreetingString = String.format("Good %s %s. Can I get you a cup of tea?", dayPeriod, name);
        } 
        else if (dayPeriod.equals("afternoon")) {
            guestGreetingString = String.format("Good %s %s. Lunch is being served in the solarium", dayPeriod, name);
        } 
        else if (dayPeriod.equals("evening")) {
            guestGreetingString = String.format("Good %s %s. Drinks are being served in the lounge", dayPeriod, name);
        }
        return guestGreetingString;
    }


    // sensei bonus: no parameters
    public String guestGreeting() {
        // set the patern of the simpleDateFormat to hour of day(1-24)
        String pattern = "k";
        // create instance of simpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        // create instance of Date formated to hour of the day
        Integer hourOfDay = Integer.parseInt(simpleDateFormat.format(new Date()));
        // create custom greeting based on time of day
        // hour 23-5: late
        // hour 6-11: good morning
        // hour 12-16: good afternoon
        // hour 17-22: good evening
        String guestGreetingString = "";
        if (hourOfDay <= 5 || hourOfDay >= 23) {
            guestGreetingString = "A bit late to be calling on Master Wayne I'm afraid";
        }
        else if (hourOfDay <= 11 && hourOfDay >= 6) {
            guestGreetingString = "Good morning. Just in time for juice and bagels";
        }
        else if (hourOfDay <= 16 && hourOfDay >= 12) {
            guestGreetingString = "Good afternoon. Just in time for lunch";
        }
        else if (hourOfDay <= 22 && hourOfDay >= 17) {
            guestGreetingString = "Good evening. Dinner will be served shortly";
        }
        return guestGreetingString;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return ("It is currently " + date);
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") != -1) {
            return "Right away sir. She certainly isn't sophisticated enough for that";
        }
        else if(conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally";
        }
        else {
            return "Right. And with that I shall retire";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

