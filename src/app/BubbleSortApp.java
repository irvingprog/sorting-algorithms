package app;

import algorithms.BubbleSort;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class BubbleSortApp {
    
    public static void main(String[] args) throws IOException {
        Scanner in = FileUtils.loadFile();
        int[] data = FileUtils.InputDataToArray(in);
        System.out.println("Reading data...");
       
        BubbleSort.exec(data);
        System.out.println("Sorting data...");
        
        FileUtils.dataToFile(data);
        System.out.println("Writing data...");
        System.out.println("Finish...");
    }
}
