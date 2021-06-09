package numericalanalysis;

import java.util.Scanner;

public class NAD_Floating_point_Division {
    public static void main(String[] args) {
        float x1,x,x2;
        int e1,e2,e;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter mantissa 1");
        x1= sc.nextFloat();
        System.out.println("Enter exponent 1");
        e1= sc.nextInt();
        System.out.println("Enter mantissa 2");
        x2= sc.nextFloat();
        System.out.println("Enter exponent 2");
        e2= sc.nextInt();

        e = e1 - e2;
        x = x1 / x2;

        if (Math.abs(x) >= 1.0) {
            x = x / 10;
            e = e + 1;
        }
        if (e < -99) {
            System.out.println("Underflow");
        }
        else if (e > 99) {
            System.out.println("Overflow");
        }
        else {
            System.out.printf("Division is %.4f x E%d", x, e);
        }

    }
}
