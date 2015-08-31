package algorithms;

public class IterativeBinarySearch {

    public static int exec(int[] data, int key) {
        int n=data.length;
        int mid;
        int low=0;
        int high=n-1;

        while (low<=high){
            mid=(low+high)/2;
            if (data[mid]<key){
                low = mid+1;
                }else if (data[mid]>key){
                    high = mid-1;
                    }else 
                        return mid;
                }
        return -1;
    }

}
