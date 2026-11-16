package Week04;

import java.util.ArrayList;

public class MusicOrganizer {

    //Encupsulation
    private ArrayList<String> files;

    public MusicOrganizer(){
        files = new ArrayList<>();
    }

    // Create 2 methods named: addFiles and getNumberOfFiles

    public  void addFiles(String fileName) {
        files.add(fileName);
    }

    public int getNumberOfFiles(){
        return files.size();
    }

    //Method to Display list of files with details

    public void displayList (){
        for(int i = 0; i<files.size(); i++){
            System.out.println(files.get(i));
        }
    }

    public ArrayList<String> getFiles (){
        return files;
    }

    public void displayListOfFiles (){
        int index = 0;
        for(String file: files){
            System.out.println(file);
            index ++;
        }
    }

  //Get a music
    public void displaySingleFile(int i){
        if(i >= 0 && i < files.size()){
            System.out.println(files.get(i));
        } else {
            System.out.println( "File not found");
        }
    }


//    public String getFile(int number){
//        int index = number - 1;
//
//        if(index >= 0 && index < files.size()){
//            return files.get(index);
//        } else {
//            return "File not found";
//        }
//    }
//Method to  Remove a music
public void removeSingleFile(int i){
    if(i >= 0 && i < files.size()){
        files.remove(i);
    } else {
        System.out.println( "File not found");
    }
}
 //Method to Update the list
 public void updateSingleFile(int i, String element){
     if(i >= 0 && i < files.size()){
         files.set(i, element);
         System.out.println( "Success");
     } else {
         System.out.println( "File not found");
     }
 }

 //--------- ASSIGNMENT -------------
 //DRY - DO NOT REPEAT YOURSELF!!!









}
