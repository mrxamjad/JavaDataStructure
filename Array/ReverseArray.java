package Array;

import java.util.Arrays;

public class ReverseArray {

    static void reverseArr(int[] arr){
        for( int i=0; i<arr.length/2; i++){
            int temp= arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

            
        }
        System.out.println(Arrays.toString(arr));

    }


    public static void main(String[] args) {
        int[] arr = { 2, 45, 23,10, 42, 102 };
        reverseArr(arr);
        
    }
    
}
