public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {6, 6, 8, 8, 2, 2, 5};
       int x =  findUnique(arr);
        System.out.println(x);
    }

    public static int findUnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }
            }
            if (j == arr.length)
                return arr[i];




        }
        return Integer.MIN_VALUE;
    }
}