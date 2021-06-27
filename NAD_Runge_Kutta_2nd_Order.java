package numericalanalysis;

import java.util.Scanner;

public class NAD_Runge_Kutta_2nd_Order {
    static float fun(double x,double y) {
        return (float) (x+y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial value of x");
        float x0 = sc.nextFloat();
        System.out.println("Enter initial value of y");
        float y0 = sc.nextFloat();
        System.out.println("Enter jump ie h");
        float h = sc.nextFloat();
        System.out.println("Enter final value of x");
        float xf = sc.nextFloat();
        float k1, k2, k;
        float x,y;
        x=x0;y=y0;
        int i=1;
        System.out.printf("i\t\t\t x\t\t\t  y\n");
        while (xf>=x) {
            System.out.printf("%d\t\t %f\t\t %f\n", i, x, y);
            k1 = h * fun(x, y);
            x=x+h;
            k2 = h * fun(x, y + k1);
            y= y+ (k1 +  k2 ) / 2;
            i++;
        }
    }
}
