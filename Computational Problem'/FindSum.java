

public class FindSum {
    public static void main(String[] args) {
        int [] arr={2,3,5,23,8,7,9,1,34};
        Utility utility= new Utility();
        utility.FindSumOf(arr, 35);
        
    }
    
}

class Utility{
    public void FindSumOf(int arr[], int target){
        boolean found=false;
        for( int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Macht is ("+arr[i]+","+arr[j]+")");
                    found=true;
                    break;

                }
            }
        if(!found){
            
                    System.out.println(" No match found in the class");
                
        }
    
            

        }
    }
        
    } 
