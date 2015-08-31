package app;

import algorithms.IterativeBinarySearch;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class IterativeBinarySearchApp {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number you want to look for: ");
        Scanner in = FileUtils.loadFile("sortedInput.txt");
        int[] data = FileUtils.InputDataToArray(in);
        int key = Math.random()*17+1;
        System.out.println("Reading data...");
        System.out.println("Looking for: "+key);
       
        int result=IterativeBinarySearch.exec(data, key);
        System.out.println();
        
        FileUtils.resultToFile(result);
        System.out.println("Writing data...");
        System.out.println("Finished...");
    }
}