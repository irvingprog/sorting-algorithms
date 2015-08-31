package app;

import algorithms.IterativeBinarySearch;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class IterativeBinarySearchApp {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number you want to look for: ");
        int key=search.nextInt();
        Scanner in = FileUtils.loadFile("sortedInput.txt");
        Scanner read = new Scanner(System.in);
        int[] data = FileUtils.InputDataToArray(in);
        System.out.println("Reading data...");
       
        int result=IterativeBinarySearch.exec(data, key);
        System.out.println();
        
        FileUtils.resultToFile(result);
        System.out.println("Writing data...");
        System.out.println("Finished...");
    }
}