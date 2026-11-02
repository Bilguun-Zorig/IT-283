
# IT283 - Object-Oriented Programming
## Week 1: Introduction to Classes and Objects

### Learning Objectives
In Week 1, we learned the fundamentals of Java
Object-Oriented Programming using IntelliJ IDEA.

### What is a Class?
A class is a blueprint or template that defines
the properties and behaviors of objects.

Example:
`public class Car`

### What is an Object?
An object is an instance created from a class.

Example:

```java
import Week01.Car;

Car mercedez = new Car(
        2026, "Grey", true, 8000f, "Mercedez"
);
```

This statement creates a new Week01.Car object.

- Week01.Car: The class/type
- mercedez: The reference variable
- new: Creates the object
- Week01.Car(...): Calls the constructor
- Arguments: Initial information about the car

### Week01.Car.java
Defines the properties and methods of Week01.Car objects.

Fields:
- year (int)
- color (String)
- isNew (boolean)
- price (float)
- name (String)

Methods:
- start(): Prints a starting message
- stop(): Prints a stopping message
- reverse(): Prints a reversing message
- showDetails(String name): Changes and displays the name

### Week01.Main.java
Contains the main method used to run the application.

The beginning includes a commented diagnostic quiz
covering Java fundamentals.

The remaining code creates Week01.Car objects,
calls methods, and displays their field values.

### Key Takeaways
A class defines the structure and behavior.
An object is an instance of a class.
Different objects can have different field values.
Methods are used to interact with objects.

### Next Class
Week 2: Understanding Class Definitions

We will study fields, constructors, parameters,
methods, return values, and access modifiers
in more detail.

### Git and GitHub
See GIT_COMMANDS.md for commonly used commands.
```
