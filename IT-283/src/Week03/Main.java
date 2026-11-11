package Week03;
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello World");

        //Conditional Statement/ if else

//        if(1 > 2) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

//    NumberDisplay minutes = new NumberDisplay(60);
//
//    minutes.setValue(58);
//    System.out.println(minutes.getDisplayValue());
//    minutes.increment();
//    System.out.println(minutes.getDisplayValue());
//    minutes.increment();
//    System.out.println(minutes.getDisplayValue());

//        ClockDisplay clock = new ClockDisplay();

//        clock.setTime(10, 25);
//        clock.getTime();
//
//        String finalClock = clock.getTime();
//        System.out.println(finalClock);


        ClockDisplay clock2 = new ClockDisplay(23, 58);
        System.out.println(clock2.getTime());
        clock2.rollover();
        System.out.println(clock2.getTime());
        clock2.rollover();
        System.out.println(clock2.getTime());
        clock2.rollover();
        System.out.println(clock2.getTime());



    }
}
