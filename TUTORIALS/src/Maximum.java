import java.util.Scanner;

public class Maximum {
    private int [] a ;
    private int Max=0;

    public int maximum( int [] a){
        this.a=a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n= scan.nextInt();
        System.out.println("Enter "+n+ " elements");
        for (int i=0;i<n;i++)
            a[i]=scan.nextInt();
        System.out.printf("Elements are :");
        for (int i=0;i<n;i++)
            System.out.printf("%d: ", a[i]);
        for (int i=0;i<n;i++)
            if(Max<a[i])
                Max=a[i];
            return Max;
    }
}
