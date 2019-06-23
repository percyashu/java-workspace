import java.util.Scanner;

public class CheckDuplicates {
    private int [] a ;
    public boolean checkDuplicates(int[] a){
        this.a=a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n =scan.nextInt();
        System.out.println("Enter Elements ");
        for (int i=0 ; i<n;i++)
            a[i]=scan.nextInt();
        System.out.printf("Elements are :");
        for (int i=0 ; i<n;i++)
            System.out.printf("%d  ",a[i]);
        System.out.println("");
        for(int i=0;i<n;i++) {
            for (int j =i+ 1; j < n; j++) {
            if (a[i] == a[j]) {
                return true;
            }
            }
        }

        return false;

    }
}
