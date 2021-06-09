package numericalanalysis;

import java.util.Scanner;

public class NAD_Floating_point_Subtraction {
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
        if(e1>e2){
            while(e2!=e1){

                x2=x2/10;
                e2++;
            }
            e=e1;
        }
        else{
            while(e1!=e2){
                x1=x1/10;
                e1++;
            }
            e=e2;
        }

        if (x1 > x2)
            x = x1 - x2;
        else
            x = x2 - x1;
        while (x < 0.1 && x > 0.0) {
            x = x * 10;
            e = e - 1;
        }
        if (e < -99) {
            System.out.println("Underflow");
        } else
            {
                System.out.printf("Sum is %.4f x E%d", x, e);
            }

    }
}

