package numericalanalysis;

import java.util.Scanner;

public class NAD_Roots_of_Quadratic_Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float a,b,c,d,xReal,xImg,x,alpha,beta;


        System.out.println("Enter the coefficients a,b and c ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        if(a==0){
            System.out.println("Not a quadratic equation");
            if (b!=0){
                x=-c/b;
                System.out.println("Root x="+x);
            }
        }
        else
        {
            d=b*b-(4*a*c);
            if (d==0)
            {
                System.out.println("Roots are Real and Equal");
                alpha=-b/(2*a);
                beta=alpha;

                System.out.printf("Roots are : %f and %f\n",alpha,beta);
            }
            else if (d>0)
            {
                System.out.println("Roots are Real and distinct");
                alpha= (float) ((-b+Math.sqrt(d))/(2*a));
                beta=(float) ((-b-Math.sqrt(d))/(2*a));
                System.out.printf("Roots are : %f and %f",alpha,beta);
            }
            else
            {
                System.out.println("Roots are Complex and Distinct ");
                xReal=-b/(2*a);
                xImg= (float) (Math.sqrt(Math.abs(d))/(2*a));
                System.out.printf("Roots are: x1=%f+i%f\n ",xReal,xImg);
                System.out.printf("Roots are: x1=%f-i%f\n ",xReal,xImg);
            }
        }




    }
}
