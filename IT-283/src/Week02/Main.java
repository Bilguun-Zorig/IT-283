package Week02;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello World");

        TicketMachine amachine = new TicketMachine(0);

        System.out.println(amachine.name);

        System.out.println(amachine.getPrice());

//        System.out.println(amachine.insertMoney(500));
        amachine.insertMoney(500);
        System.out.println(amachine.getBalance());









    }
}
