package algorithms;

public class SelectionSort {
    
    public static void exec(int[] data) {
        int min;
        for (int i = 0; i <= data.length - 2; i++) {
            min = i;
            for (int j = i + 1; j <= data.length - 1; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            
            swap(data, i, min);
        }
    }
    
    private static void swap(int[] data, int pos1, int pos2) {
        int tmpData = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = tmpData;
    }
}
