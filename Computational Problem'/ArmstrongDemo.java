class Armstrong{
    public boolean checkArmstring( int num){
        int digit;
        int value=num;
        int sum=0;
        while( num>0){
            digit= num % 10;
            sum=digit*digit*digit+sum;
            num=num/10;

        }
        if(sum==value){
            return true;

        }else
        {
            return false;
        }
    }
}

public class ArmstrongDemo {
    public static void main(String[] args) {
        Armstrong armstrong=new Armstrong();
        boolean b=armstrong.checkArmstring(371);
        System.out.println(b);
        
    }
}
