package app;

import algorithms.SelectionSort;
import java.io.IOException;
import java.util.Scanner;
import utils.FileUtils;

public class SelectionSortApp {
        public static void main(String[] args) throws IOException {
        Scanner in = FileUtils.loadFile("input.txt");
        int[] data = FileUtils.InputDataToArray(in);

        System.out.println("Reading data...");

        SelectionSort.exec(data);
        System.out.println("Sorting data...");

        FileUtils.dataToFile(data);
        System.out.println("Writing data...");
        System.out.println("Finish...");
    }
}
