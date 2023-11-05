class Fabonnaci{
    public void printFebonnaci( int number){
        int num1=0;
        int num2=1;
        int sum=0;
        // System.out.print(num1+","+num2);

        for( int i=1; i<=number; i++){

            System.out.println(sum);
            sum=num1+num2;
            num1=num2;
            num2=sum;
        }

    }
}
public class FabonnaciDemo {
    
    public static void main(String[] args) {
        System.out.println("");
        Fabonnaci febo=new Fabonnaci();
        febo.printFebonnaci(8);
    
    }
}
