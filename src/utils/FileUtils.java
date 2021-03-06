package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {
    
    public static Scanner loadFile(String fileName) {
        try {
            Scanner in = new Scanner(new FileReader(fileName));
            return in;
        }
        catch (IOException e) {
            System.out.println("The file doesnt exists");
        }
        return null;
    }
    
    public static int[] InputDataToArray(Scanner in) {        
        int lenData = Integer.parseInt(in.nextLine());
 
        int[] data = new int[lenData];
        
        for (int i = 0; i < lenData; i++) {
            data[i] = Integer.parseInt(in.nextLine());
        }
        
        return data;
    }
    
    public static void dataToFile(int[] data) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(new File("output.txt")));
        
        for (int i = 0; i < data.length; i++) {
            writer.write(String.valueOf(data[i]));
            writer.write('\n');
        }
        
        writer.close();
    }

    public static void resultToFile(int result) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter(new File("output.txt")));
        
        writer.write(String.valueOf(result));
        writer.close();
    }

}

    
