import java.util.Arrays;

public class SwapAlternates {
    public static void main(String[] args) {
        int [] arr = { 1,2,1,3,5,3,5};
        swap(arr);
    }
    public static void swap( int []arr){
        for( int  i = 0 ; i< arr.length-1;i=i+2){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]= temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
