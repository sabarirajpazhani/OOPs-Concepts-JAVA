package FileHandling;

import java.io.File;
import java.io.FileWriter;

public class WrittingFile {
    public static void main(String[] args) {
        try{
            File f = new File("Example.txt");
            FileWriter fw = new FileWriter(f);
            fw.write("Hello...Devlopers!!!!!!..............");
            fw.close();
        }
        catch(Exception E){
            System.out.println(E);
        }
    }
}
