package BinarySearch;

 

public class BinaryTreeSearch {
    static int SearchTarget(int target, int[] list, int start, int end){
        int mid;
        // int[] list={1,2,3,4,5,6};
       
        mid=(start+end)/2;

        if(list[mid]==target){
            return mid;
            

        }
        else if (target<list[mid]){
            SearchTarget(target, list, start, mid-1);
        }
        else if(target>list[mid]){
            SearchTarget(target, list, mid+1, end);
        }
    return -1;
}
    public static void main(String[] args) {
        int[] list={1,2,3,4,5,6,7};

        System.out.println(SearchTarget(5, list, 0, list.length-1));

    

        
    }
    
    
    
}
