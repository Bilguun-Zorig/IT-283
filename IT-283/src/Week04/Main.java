package Week04;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //Student
//        String firstName = "aa";
//        String lastName = "BB";
//        int age = 18;
//        int IDNumber = 123456;
//        boolean isStudent = true;

//        System.out.println(firstName + " " + lastName);

//        ArrayList<String> student = new ArrayList<String>();
//
//        System.out.println(student.size());
//        student.add("John");
//        student.add("Bruno");
//        student.add("Cheshty");
//        System.out.println(student.size());
//
//        student.add(0, "Thomas");
//        student.add(4, "Pham");
//        student.add(5, "Pandey");
//        System.out.println(student.get(2));
//student.set(0, "Sayson");
//        System.out.println(student.get(0));
//
//        student.remove(1);
//
//        for (int i = 0; i <student.size(); i++){
//            System.out.println ("Index at "+ i+  " = " + student.get(i));
//        }
//
//        for(int i =1; i<10; i++){
//            System.out.println ("Index at "+ i);
//        }


//        int i = 1;
//        while (i < 5) {
//            System.out.println(i);
////            i++;
//        }

//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        for (String car : cars) {
//            System.out.println(car);
//        }

    //MusicOrganizer
        MusicOrganizer organizer = new MusicOrganizer();
        organizer.addFiles("music1");
        organizer.addFiles("music2");
        organizer.addFiles("music3");
        organizer.addFiles("music4");


        System.out.println("Number of files: "+organizer.getNumberOfFiles());

//        organizer.displayList();
//        System.out.println(organizer.getFiles(3));
//        organizer.displayListOfFiles();
//        organizer.displaySingleFile(-1);
//        System.out.println(organizer.getFile(52));
        organizer.removeSingleFile(0);
    organizer.displayList();
    organizer.updateSingleFile(1, "UpdatedMusic3");
        organizer.displayList();




    }
}
