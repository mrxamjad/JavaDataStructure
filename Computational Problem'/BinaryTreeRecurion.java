public class BinaryTreeRecurion {
    

    public static int searchNumber( int number, int arr[], int start, int end ){
        int medium=arr.length/2;
        

        if(number==arr[medium]){
            return medium;
        }
        else if( number<medium){
            end=medium;
            searchNumber(number, arr, start, end);
        }
           
        else if(number> medium){
            start=medium;
            searchNumber(number, arr, start, end);
        }
        
        return -1;
        
        


    }

    
}

class Main{
    public static void main(String[] args) {
        int arr[]={1,3,4,6,7,12,17};
       int a= BinaryTreeRecurion.searchNumber(7, arr, 0, arr.length);
        System.out.println(a);
    }
}
