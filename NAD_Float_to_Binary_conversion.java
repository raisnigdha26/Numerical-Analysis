package numericalanalysis;

import java.util.Scanner;

public class NAD_Float_to_Binary_conversion {
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
    public static void fun2(float c)
    {
        int i=1;
        while(i<=32){
            float d=(c*2);

            int j= (int) Math.floor(d);
            System.out.print(j);
            c=d-j;
            if(c==0.0000){
                System.exit(0);
            }
            i++;


        }
    }
    public static void main(String[] args) {
        float n ;
        System.out.println("Enter value: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextFloat();
        float a=Math.abs(n);


        int b= (int) Math.floor(a);

        float c=a-b;
        //System.out.println(c);

        if(n<0)
        {
            System.out.println("No. entered is negative");
            // System.out.println("Using sign and then representing");
            System.out.print("-");
            fun(b);


        }
        else {
            System.out.println("No. entered is positive");
            fun(b);
        }

        System.out.print(".");
        fun2(c);


    }
}
