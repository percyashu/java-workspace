public class CountDigits {
    private int n;

    public int countDigits(int n){
        this.n=n;
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    }

