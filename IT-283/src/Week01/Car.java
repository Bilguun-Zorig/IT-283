package Week01;

// Defines a class named Week01.Car which acts as the blueprint for Week01.Car objects
public class Car {

    //Property or fields - store the information
    int year;
    String color;
    boolean isNew = true;
    float price;
    String name;

    //Constructors - Receives information when a Week01.Car object is created and initializes its fields.
    // A constructor runs when a new object is created. It takes the values provided by the programmer and stores them in that object's fields.
    //Parameter constructor
    public Car (int year, String color, boolean isNew, float price, String name) {
        this.year = year; // Assigns constructor parameter values to the new object's fields.
        this.color = color;
        this.isNew = isNew;
        this.price = price;
        this.name = name;
    }


    //Method or Behavior

    public void start(){
        //Prints a message
        System.out.println("The car has started");
    }

    public void stop(){
        //Prints a message
        System.out.println("The car has stopped");
    }

    public void reverse(){
        //Prints a message
        System.out.println("The car is reversing");
    }

    //Updates the car's name and displays it.
    public void showDetails (String name) {
        this.name = name;
    System.out.println("This is my car " + name);
    }
}
