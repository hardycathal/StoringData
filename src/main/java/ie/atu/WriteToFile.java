package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "File2.txt";

        try (FileWriter writer = new FileWriter(fileName, true)){
            writer.append("New content test");
            System.out.println("Content successfully written to file");
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}