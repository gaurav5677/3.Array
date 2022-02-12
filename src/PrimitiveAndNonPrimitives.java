public class PrimitiveAndNonPrimitives {
    public static void increment(int i) {
        i = i + 1; // here the increment.i becomes i+1
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    //non primitive
    public static void incrementArray(int[] arr) {//here the array referernce is called which contain the vale of array and array lenght
//here the arr is also pointing the array of  1 ,2 ,3 ,4 ,5.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }//here the array is incremented
    }

    public static void main(String[] args) {
//      int i  =10 ;//here the i is main.i
//
////        in java everything is pass by valuse
//      increment(i);// this called increment funciton
//        System.out.println(i);// and here again we are calling the main.i which is 10
////        that why the value we get is still 10

        int[] arr = {1, 2, 3, 4, 5};//here we have made an arry

        incrementArray(arr);// here the arr is storing the Refrences and lenght  .
        //function which increase each values in array
        printArray(arr);
// here we are called the incrementArray fucntion which gives the incremented arrya as output

    }
}
