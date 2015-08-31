package app;

import algorithms.MinAlgorithm;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class MinAlgorithmApp {
    
    public static void main(String[] args) throws IOException {
        Scanner in = FileUtils.loadFile("input.txt");
        int[] data = FileUtils.InputDataToArray(in);
        System.out.println("Reading data...");
       
        int result = MinAlgorithm.exec(data);
        System.out.println("Calculating minimum number...");
        
        FileUtils.resultToFile(result);
        System.out.println("Writing data...");
        System.out.println("Finished...");
    }
}
