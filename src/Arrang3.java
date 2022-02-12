import java.util.Scanner;

public class Arrang3 {

    public static int[] ArrangeArray(int n) {
        int start = 0, end = n - 1, val = 1;
        int[] arr = new int[n];

        for (val = 1; val <= n; val++) {
            if (val % 2 == 0) {
                arr[start] = val;
                start++;
            }else{
                arr[end]=val;
                end--;

            }

        }
        return  arr;
    }

    public static void printArray(int[]arr){
        for( int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
       int[]arr= ArrangeArray(x);
        printArray(arr);


    }
}
