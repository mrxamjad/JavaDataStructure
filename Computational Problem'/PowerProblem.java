class Power{
    public int fintPowerValue( int base, int power){
        int value=1;
        for( int i=1; i<=power; i++){
            value=value*base;
            

        }
        return value;
    }
}

public class PowerProblem{
    public static void main(String[] args) {
        Power power=new Power();
        System.out.println(power.fintPowerValue(3, 4));
        
        
    }
}