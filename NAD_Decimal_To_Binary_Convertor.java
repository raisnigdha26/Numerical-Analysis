package numericalanalysis;

import java.util.Scanner;

public class NAD_Decimal_To_Binary_Convertor {
    public static void fun(int n)
    {
        if(n==0||n==1) {
            System.out.print(n);
        }
        else
        {
            int r=n;
            n=n/2;
            fun(n);
            System.out.print(r%2);
        }
    }
    public static void main(String[] args) {
        int n ;
        System.out.println("Enter value: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int a=Math.abs(n);
        if(n<0)
        {
            System.out.println("No. entered is negative");
           // System.out.println("Using sign and then representing");
            System.out.print("-");
            fun(a);


        }
        else {
            System.out.println("No. entered is positive");
            fun(a);
        }


    }
}
