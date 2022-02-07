
import java.util.Scanner;

public class LinearSearch {



static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {

        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element at " + i + "th index");
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int x) {
        //Your code goes here
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return (-1);
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int x = s.nextInt();
        System.out.print(LinearSearch.linearSearch(arr, x));
    }
}



