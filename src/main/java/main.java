import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    //Reading Data
    public static void main(String[] args) {
        Scanner myinput = null;
        try{
            myinput = new Scanner(new File("text2.txt")); //This is what read the input file
        }catch (FileNotFoundException e ){
            e.printStackTrace();
        }

        while (myinput.hasNext())
        {
            String str = myinput.nextLine();
            System.out.println(str);
        }
    }
}
