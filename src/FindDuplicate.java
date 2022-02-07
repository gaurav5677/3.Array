public class FindDuplicate {
    public static void Duplicate(int [] arr){
        for ( int i = 0 ; i< (arr.length-1) ;i++){
            for( int j = i+1 ; j< arr.length;j++){
                if( arr[i]== arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = { 2, 4,5,6,7,5,8};
        Duplicate(arr);
    }

}
