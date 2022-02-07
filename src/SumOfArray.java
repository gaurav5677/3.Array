import java.util.Scanner;

public class SumOfArray {
    public static void main (String[] args){
        int[] arr = takeInput();

        System.out.println(sum(arr));
    }
        //Your code goes here
        public static int sum(int[] arr) {
            //Your code goes here
            int ans=0;
            for (int i=0;i<arr.length;i++)
                {
                ans = ans + arr[i];
            }
            return ans;
        }
        public static int[] takeInput () {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {

                arr[i] = s.nextInt();
            }
            return arr;

        }


    }
