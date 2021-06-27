package numericalanalysis;

import java.util.Scanner;

public class NAD_System_of_Simultaneous_equation {
    public static void main(String[] args) {
        System.out.println("Enter value of coefficients a,b,c,p,q,r");
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float p= sc.nextFloat();
        float q= sc.nextFloat();
        float r= sc.nextFloat();
        float x,y;
        q=q-(p*b/a);
        r=r-(p*c/a);
        if(q==0)
        {
            System.out.println("No Solution");
            System.exit(0);
        }
        else
        {
            y=r/q;
            x=c-(b*y/a);
            System.out.printf("x = %f and y = %f",x,y);
        }
    }
}
