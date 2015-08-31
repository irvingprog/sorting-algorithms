package app;

import algorithms.BubbleSort;
import algorithms.SecondMayorAlgorithm;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class secondMayorApp {
    
    public static void main(String[] args) throws IOException {
        Scanner in = FileUtils.loadFile("input.txt");
        int[] data = FileUtils.InputDataToArray(in);
        System.out.println("Reading data...");
       
        int result = SecondMayorAlgorithm.exec(data);
        System.out.println("Calculating the second mayor number...");     
        
        FileUtils.resultToFile(result);
        System.out.println("Writing data...");
        System.out.println("Finish...");
    }
    
}
