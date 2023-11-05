public class array1 {
    public static void main(String[] args) {
        //int arr[]={1,2,3,4,5,6,7,8,9};
        
        
        System.out.println("This is 1 dimensional array");
        int [] a1= new int[6];
        for (int i=0; i<a1.length; i++)
        {
            a1[i]=i+1;

        }

        for(int i=0; i<a1.length; i++){
        System.out.print(a1[i]+" ");
        }

        // for(int a:a1){
        //     System.out.println(a);
        // }

        System.out.println("\nThis is 2 Dimensional array");
        int cout=1;

        int [][]arr2= new int [3][4];
        for(int i=0 ; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                arr2[i][j]=cout;
                cout++;
            }
            
        }

        for(int i=0 ; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println("\n");
        }
    }
    
}
