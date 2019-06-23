import java.util.Random;
import java.util.Scanner;

public class Contains {
    private int[] a ;
    private int x;
    public boolean contains(int[] a, int x){
        this.a=a;
        this.x=x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n =scan.nextInt();
        System.out.println("Enter Elements ");
        Random rand = new Random();
        for (int i=0 ; i<n;i++)
            a[i]=rand.nextInt(10);// Random numbers between 0-9
        for (int i=0 ; i<n;i++)
            System.out.printf("%d  ",a[i]);
        System.out.println("");
        for (int i=0 ; i<n ; i++){
            if(a[i]==x)
                return true;
        }
        return false;

    }
}
