package com.company;
import java.util.Scanner;
public class RAThypotenuse
{
    public static void main(String[] args)
    {
        Scanner stdIn = new Scanner(System.in);
        double base;
        double height;
        double hypotenuse;
        System.out.print("Enter right triangle base: ");
        base = stdIn.nextDouble();
        System.out.print("Enter right triangle height: ");
        height = stdIn.nextDouble();
        hypotenuse = Math.sqrt(base * base + height * height);
        System.out.println("Hypotenuse length = " + hypotenuse);
    } // end main
} // end FindHypotenuse