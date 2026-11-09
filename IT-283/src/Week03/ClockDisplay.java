package Week03;

public class ClockDisplay {

    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String finalClock;
    //Default Constructor
    public ClockDisplay (){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        displayFinalClock();
    }

    public ClockDisplay (int hour, int minute) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void setTime(int hour, int minute) {
        if(hour >= 0 && hour < 24 && minute >= 0 && minute < 60){
            hours.setValue(hour);
            minutes.setValue(minute);
        }else{
            System.out.println("Error");
        }
        displayFinalClock();
    }

    public void displayFinalClock(){
//        System.out.println("CODE FROM DISPLAYFINALCLOCK");
        finalClock = hours.getDisplayValue() + " : " + minutes.getDisplayValue();
//        System.out.println("CODE FROM DISPLAYFINALCLOCK " + finalClock);
    }

// Getter
    public String getTime(){
//        System.out.println("CODE REACHES HERE");
        return finalClock;
    }

    // Time rollover
    public void rollover(){
        minutes.increment();

        if(minutes.getValue() == 0){
            hours.increment();
        }
        displayFinalClock();
    }












}
