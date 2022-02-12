import java.util.Scanner;

public class FindTheUniqe {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int n = s.nextInt();
        int [] arr = new int[n];
        FindUni(arr);
    }
    public static void FindUni( int [] arr){

        for ( int i = 0 ;i< arr.length; i++ ) {
            arr[i] = s.nextInt();
        }
        int uni = 0 ;
        for( int val : arr) {
            uni = uni ^ val;
        }
        System.out.println(uni);
        }
    }

