package Array;

public class LinearSearch {

    static int searchNumber(int[] arr, int value){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 45, 23,10, 42, 102 };
        // int[] arr = {  };
       int number= searchNumber(arr, 42);
       System.out.println("Index value: "+number);
        
    }
    
}
