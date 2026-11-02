package Week02;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello World");

        TicketMachine amachine = new TicketMachine(500);

//        System.out.println(amachine.name);
//
//        System.out.println(amachine.getPrice());

////        System.out.println(amachine.insertMoney(500));
//        amachine.insertMoney(500);
//        System.out.println(amachine.getBalance());
//
//        amachine.printTicket();

        TicketMachine bmachine = new TicketMachine(450);

        System.out.println("Ticket price: " + bmachine.getPrice());
        System.out.println("Ticket balance: " + bmachine.getBalance());
        bmachine.insertMoney(450);
        System.out.println("Ticket balance: " + bmachine.getBalance());
        bmachine.printTicket();





    //String concatenation
//        System.out.println(2 + 3); // 5
//
//        System.out.println("Columiba " + "College"); //Columbia College
//        System.out.println("Columbia " + 3); //
//        System.out.println(6 + " Columiba");
//
//        String firstName = "Columbia";
//        String lastName = "College";
//
//        //                   0          1       2
//        System.out.println(firstName + " " + lastName);
//
//        int a = 1;
//        //            a = a + 2
//        System.out.println(a+=2); //3
//
//        String ab = "Tysons";
//        //            ab = ab + " 2"
//        System.out.println(ab+= " 2"); //







    }
}
