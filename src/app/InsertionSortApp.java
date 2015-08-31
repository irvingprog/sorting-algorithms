package app;

import algorithms.InsertionSort;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class InsertionSortApp {
    
    public static void main(String[] args) throws IOException {
        Scanner in = FileUtils.loadFile("input.txt");
        int[] data = FileUtils.InputDataToArray(in);

        System.out.println("Reading data...");

        InsertionSort.exec(data);
        System.out.println("Sorting data...");

        FileUtils.dataToFile(data);
        System.out.println("Writing data...");
        System.out.println("Finish...");
    }
}
