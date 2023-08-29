import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _111_File_Handling {
    public static void main(String[] args) {

//        Code to create  a New File
        /*
        File Myfl =new File("Thaseenfl.txt");
        try {
            Myfl.createNewFile();
        }
        catch (IOException e) {
            System.out.println("Unable To create this File");
             e.printStackTrace();
        }
        */


//        Code to Write to a file
        /*
        try {
            FileWriter myFlwrite =new FileWriter("Thaseenfl.txt");
            myFlwrite.write("This is our first created file from java Code\n Okay now bye File");
            myFlwrite.close();
        }
        catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
*/

//        Reading the File
        /*
        File myFile =new File("Thaseenfl.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line= sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
*/

//        Deleting a File

        File dFile = new File("Thaseenfl.txt");
        if(dFile.delete()){
            System.out.println("I have deleted the :"+dFile.getName());
        }
        else{
            System.out.println("Some problem occured during deleting the File :"+dFile.getName());
        }

    }
}
