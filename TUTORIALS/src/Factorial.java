public class Factorial {
    private int  n  =   1 ;
    private int Fac =   1 ;

    public Factorial(int n ){
        this.n=n;
    }

    public void setN(int n){
        this.n=n;
    }
    public int getFac(){
        int i = 1;
        for (i=1;i<=n;i++){
            Fac = Fac * i;
        }
    return Fac;
    }
}
