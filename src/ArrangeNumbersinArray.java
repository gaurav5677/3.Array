import java.util.Scanner;

public class ArrangeNumbersinArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = Arrange(n);
        printArray(arr);

    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] Arrange(int n) {
        int start = 0, end = n - 1, val = 1;
        int[] arr = new int[n];
        for (val = 1; val <= n; val++) {
            if (val % 2 == 0) {

                arr[end] = val;
                end = end - 1;

            } else { arr[start] = val;
                start = start + 1;

            }

        }
        return arr;
    }
}
//        int start =  0;
//        int end = n-1;
//        int val = 1 ;
//      int[] arr = new int[n];
//      while ( start <= end){
//            if( n %2==1){
//                arr[start]=val;
//                start++;
//                val++;
//            }
//            else{
//                arr[end]=val;
//                end -=1;
//                val++;
//            }
//        }
//      return arr;
//    }
//  }
