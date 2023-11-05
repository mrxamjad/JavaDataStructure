package Sorting;

/* 
Algorithem for bubble sort

1. create a for loop that runs for lenght- i times whare i i index of element
2 create a for loop that runs for lenght -1 -i times whare i is index of element and j is the initial value whare j=0
3 a if-else condition that check that the selected elemnt is greater or not, if selected element is greate than next elemt swap the current element with next elemtn 
4 Close the programm
*/ 


public class BubbleSort {

    static void BubbleSortAlgo( int [] arr){
        for( int i=0; i< arr.length-1; i++ ){
            for( int j=0; j<arr.length-1-i; j++){
                if(arr[j]> arr[j+1]){
                    int temp =arr[j];
                    arr[j]= arr[j+1];

                    arr[j+1]=temp;

                }
            }
        }
    }
    

    public static void main(String[] args) {
        int arr[]={25,25,87,3,1,58,36,4,35};

        System.out.println("Before Sorting");
        for( int element: arr){
            System.out.print(element+",");
        }
        BubbleSortAlgo(arr);
        System.out.println("After Sorting");
         for( int element: arr){
            System.out.print(element+",");
        }

    }
}
