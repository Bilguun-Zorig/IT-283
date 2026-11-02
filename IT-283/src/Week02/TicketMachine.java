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
        price = cost;
        balance = 0;
        total = 0;
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

    public void printTicket(){
        System.out.println("--- Columbia Ticket ---");
        System.out.println("The Price " + price);

        // total = total + balance
        total += balance;
        balance = 0;
    }












}
