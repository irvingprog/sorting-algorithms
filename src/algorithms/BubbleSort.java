package algorithms;

public class BubbleSort {

    public static void exec(int[] data) {
        for (int i = data.length - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }
    }
    
    public static void swap(int[] data, int pos1, int pos2) {
        int tmpData = data[pos1];
        data[pos1] = data[pos2];
        data[pos2] = tmpData;
    }
}
