import java.util.Scanner;

public class tutoTest {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);

        /* 1    test for class Factorial

        System.out.println("Enter number ");
        int n;
        int fac;
        n = scan.nextInt();
        Factorial   fact = new Factorial(n);
        fac=fact.getFac();
        System.out.println("Factorial of "+n+" is "+fac);       */

        /* 2 test for Fibonacci
        System.out.println("Enter number ");
        int n;
        int fib;
        n = scan.nextInt();
        Fibonacci Fib   =  new Fibonacci();
        fib=Fib.fibonacci(n);
        System.out.println("Fibonacci to "+n+" is "+fib);       */

        /*  3 test for Prime number
        boolean S;
        int n;
        System.out.println("Enter number ");
        n = scan.nextInt();
        PrimalityChecker prime = new PrimalityChecker();
        S = prime.isPrime(n);
        System.out.println("Is Number "+n+" is a prime number? "+S);    */

        /* 4 test for Goldback
        int n;
        System.out.println("Enter number ");
        n = scan.nextInt();
        GoldbackChecker goldbackChecker = new GoldbackChecker();
        goldbackChecker.checkGoldbach(n);       */

        /* 5 test for power
        int e;
        double b;
        System.out.println("Enter exponent and base");
        e = scan.nextInt();
        b = scan.nextDouble();
        Power pow = new Power();
        double ans = pow.power(b,e);
        System.out.println("Ans of number "+b+" ^ "+e+ " is "+ans);     */

        /* 6 test countdigits
        int n;
        System.out.println("Enter number ");
        n = scan.nextInt();
        CountDigits count = new CountDigits();
        int ans = count.countDigits(n);
        System.out.println("The Number of digits in "+n+" is "+ans);    */

        /*7 test for contains
        int [] a= new int[999];
        int x;
        System.out.println(" Enter  number between 0-9 to check if present in array");
        x = scan.nextInt();
        Contains cons = new Contains();
        boolean bool = cons.contains(a , x);
        System.out.println("Is Number "+x+" is present ? "+bool);   */

        /* 9 test CheckDuplicates
        int [] a= new int[99];
        CheckDuplicates check = new CheckDuplicates();
        boolean bool = check.checkDuplicates(a);
        System.out.println("Duplicate Number ?  "+bool);    */

        /* 10 test Maximum
        int [] a= new int[999];
        Maximum max = new Maximum();
        int bool = max.maximum(a);
        System.out.println("Max Number  is  "+bool);    */

          /*test for class Circle
        System.out.println("Enter  radius, color");
        double radius=scan.nextDouble();
        String color=scan.next();
        Circle circle = new Circle(radius,color);
        circle.setRadius(radius);
        circle.setColor(color);
        double area = circle.Area();
        System.out.println(" area of circle is ="+area);*/

    }
}
