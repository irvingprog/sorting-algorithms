package algorithms;

public class InsertionSort {
    
    public static void exec(int[] data) {
        int aux, j;
        for (int i = 1; i <= data.length - 1; i++) {
            aux = data[i];
            for (j = i - 1; j >= 0; j--) {
                if (data[j] > aux) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            data[j + 1] = aux;
        }
    }
}
