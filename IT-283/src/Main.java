public static void main(String[] args) {
//    System.out.println("Hello World");
//    System.out.println(123);
//
//    int age = 18;
//
//    System.out.println(age);
//
//    int x = 4;
//    int y = x - 3;
//
//
//    System.out.println(y);
//
//    boolean isStudent = true;
//
//    for (int i = 1; i <= 5; i++) {
//        System.out.println("Number i " + i);
//    }

  // Object #1
// This creates a Car object
    Car mercedez = new Car(2026, "Grey", true, 8000, "Mercedez");

    // Calling its methods on the existing mercedez object
    mercedez.start();
    mercedez.stop();
    // This will change its stored name
    mercedez.showDetails("Mercedez G-Class");

    //Display object fields
    System.out.println(mercedez.name);
    System.out.println(mercedez.price);
    System.out.println(mercedez.color);
    System.out.println(mercedez.year);
    System.out.println(mercedez.isNew);

    // Object #2
//    Car bmw = new Car();
//    bmw.start();
//    bmw.stop();.
//    bmw.reverse();
//    bmw.showDetails("BMW");


//    // Car 1
//    String mercedez_start = "The car has started";
//    System.out.println(mercedez_start);
//
//    // Car 2
//    String bmw_start = "The car has started";
//    System.out.println(bmw_start);
//    //Car 3
//    String audi_start = "The car has started";
//    System.out.println(audi_start);
}