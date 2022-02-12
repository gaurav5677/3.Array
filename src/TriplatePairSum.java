import java.util.Scanner;

public class TriplatePairSum {
    static Scanner s = new Scanner(System.in);

    public static int[] takeInput() {


        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }


    private static int pairSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
        }

        public static void main (String[]args){

            int[] arr = takeInput();

            System.out.println("Enter the Sum amount : ");
            int x = s.nextInt();
            System.out.println(" total number of pairs which are equal to the sum amount are: ");
            System.out.println(pairSum(arr, x));
        }

    }


