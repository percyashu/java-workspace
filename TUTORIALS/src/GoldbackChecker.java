public class GoldbackChecker {
    private int n;
    private int[] arr= new int[2];


    public void checkGoldbach(int n) {
        this.n = n;
        if (n < 1) {
            System.out.println("Number is less than 1");

            return;
        }
        PrimalityChecker prime = new PrimalityChecker();
        int k = 0;
        int l = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                if (prime.isPrime(i) == true && prime.isPrime(j) == true && i + j == n) {
                    k = i;
                    l = j;
                }

            }


        }
        if (k != 0 && l!= 0) {
            arr[0] = k;
            arr[1] = l;
            System.out.println("Array elements are");
            for (int i = 1; i >= 0; i--)
                System.out.println(+arr[i]);
        }
        else System.out.println("Null"); return;
    }
}
