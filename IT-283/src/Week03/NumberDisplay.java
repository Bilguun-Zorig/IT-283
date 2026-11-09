package Week03;

public class NumberDisplay {

    //Encupsulation
    private int limit; //minut: 00  hour: 24\\12
    private int value;  // 1am or 13:00

    public NumberDisplay(int limit) {
        this.limit = limit;
        value = 0;
    }

    //Getter
    public int getValue(){
        return value;
    }

    //Setter
    //                   positive
    public void setValue(int newValue){
        if(newValue >= 0 && newValue < limit){
            value = newValue;
        } else {
            System.out.println("Please, Enter a positive number");
        }
    }

    public String getDisplayValue(){
        if(value < 10){
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public void increment(){
        value = value + 1; //value += 1;
        if(value == limit) {
            value = 0;
        }
    }


















}
