package algorithms;

public class SecondMayorAlgorithm {
    
    public static int exec(int[] data) {
        int first = Math.max(data[0], data[1]);
        int second = Math.min(data[0], data[1]);
        
        for (int i = 2; i <= data.length - 1; i++) {
            if (data[i] > second) {
                if (data[i] > first) {
                    second = first;
                    first = data[i];
                } else {
                    second = data[i];
                }
            }
        }
        
        return second;
    }
}
