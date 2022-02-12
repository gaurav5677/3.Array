import java.util.Scanner;

public class ArrayIntersection {
    public static void Intersection(int[] arr1, int[] arr2) {


        for( int i = 0 ; i<(arr1.length-1);i++){
            for( int j =0 ;j< arr2.length;j++){
                if( arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                }
            }
        }

    }



    public static void main(String[] args) {

        int[] arr1 = {1, 2, 0, 4, 5, 6};
        int[] arr2 = {3, 8, 9, 0, 2, 1};
        Intersection(arr1, arr2);
    }
}
