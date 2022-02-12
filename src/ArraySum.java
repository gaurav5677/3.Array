import java.util.Scanner;

public class ArraySum {
    public static int[] takeInput() {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        return arr;
    }

    public static int Arraysum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];


        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.println(Arraysum(arr));
    }
}

