import java.util.Scanner;

public class InputOutPut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at ith index: ");
          }
        for( int i = 0 ;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
