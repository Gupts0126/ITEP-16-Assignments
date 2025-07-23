import java.util.Scanner;

class Program8{
    public static void main(String args[]){
             Scanner sc = new Scanner(System.in);

       System.out.println("Enter the altitude : ");
       int altitude = sc.nextInt();

       System.out.println("Enter the area in cmsq : ");
       double area_msq = sc.nextDouble();


        double area_cmsq = area_msq*10000;
        // area of triangle = 1/2(base*altitude)
        double base = (2*area_cmsq)/altitude;

        System.out.println("Base of Triangle = " + base + "cm");


    }
}