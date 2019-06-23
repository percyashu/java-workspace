public class Power {
    private int exponent;
    private double  base;
    private double  ans=0;
    public double power(double  base , int exponent){
        this.base=base;
        this.exponent=exponent;
        if (exponent<0) {
            System.out.println("exponent must be positive");
            return 1;
        }
        if(exponent==0)
            return 1;
        if(exponent==1)
            return base;
        else return ans=base*power(base,exponent-1);

    }
}
