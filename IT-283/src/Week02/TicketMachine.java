package Week02;

public class TicketMachine {
//Insert Money
//Print the ticket

    //Fields
    private int price;
    private int balance;
    private int total;
    public String name;

    //Default Constructor
//    public TicketMachine(){
//    }
    //Parameter Constructor
    public TicketMachine (int cost){
        this.price = cost;
        this.balance = 0;
        this.total = 0;
    }

    //Method - Accessor/Getter
    public int getPrice(){
        return price;
    }
    public int getBalance(){
        return balance;
    }
    public int getTotal(){
        return total;
    }

//    public int getPrice(){
//        System.out.println(price);
//    }

    //Method - Mutator/Setter
    public void insertMoney(int amount){
        balance = balance + amount;
    }














}
