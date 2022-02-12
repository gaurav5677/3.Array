import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        swap(arr);
    }

    public static void swap(int[]arr) {
        for (int i = 0; i < arr.length - 1; i=i+2) {
            int temp = arr[i];
            arr[i]= arr[i + 1] ;//be carefull while writing this if you put arr[i+1]= arr[i] whole array will change .
            arr[i + 1]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
