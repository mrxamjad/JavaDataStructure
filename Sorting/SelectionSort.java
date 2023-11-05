package Sorting;

public class SelectionSort {
    /*
     * 
     *Algorithem for seletion short
     
     1. create a for loop that run for its lenth times
     2. create a two varialbe for max and last elemnt;
     3. assign max=zero index eg. 0 and last= last element index eg arr.length-1-i
     4. create a for loop that run over lenght-1-i times
     5. check if arr[max]<arr[j+1] then max=j+1
     6 after first looop swap the value of last elemnt with max element

     */

   static void selectionSort(int [] arr){
        int max, last;

        for( int i=0; i< arr.length; i++){
            max=0;
            last=arr.length-i-1;
            for( int j=0; j<arr.length-i-1 ; j++){
                if( arr[max]< arr[j+1]){
                    max=j+1;

                }
            }
            int temp=arr[last];

            arr[last]=arr[max];
            arr[max]=temp;




        }
    }
    public static void main(String[] args) {
        int arr[]={25,25,87,3,1,58,36,4,35};

        System.out.println("\nSelection Before Sorting");
        for( int element: arr){
            System.out.print(element+",");
        }
        selectionSort(arr);
        System.out.println("Selection After Sorting");
         for( int element: arr){
            System.out.print(element+",");
        }

    }
    
}
