import java.util.Scanner;

public class LinearSearchAlgo {
    static Scanner s = new Scanner(System.in);
    public static int[] takeInput(){

        int n = s.nextInt();
        int [] arr = new int[n];
        for( int i = 0 ; i<n;i++){
            arr[i]= s.nextInt();
        }
        return arr;
    }

    public static void LinearSearch(int[]arr){
        int c = s.nextInt();
        for(int  j = 0 ; j< arr.length;j++){
            if( arr[j]== c){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr =takeInput();
        LinearSearch(arr);
    }
}
