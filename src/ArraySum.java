import java.util.Scanner;

public class ArraySum {
    public static int[] takeIntput(){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] arr = new int[n];
      for( int i = 0; i< n;i++) {
          arr[i] = s.nextInt();
      }

      return arr;

    }




    public static int sum(int[] arr){
        int ans =0;
        for (int  i = 0; i<arr.length; i++){
            ans = ans + arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
         int[]arr = takeIntput();
         int c = sum(arr);
        System.out.println(c);

    }
}
