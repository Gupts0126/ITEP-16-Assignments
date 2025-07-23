// 8.Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².

class Program8{
    public static void main(String args[]){
        double altitude_triangle = 20;
        double area_in_msq = 0.8;

        double area_in_cmsq = area_in_msq*10000;
        // area of triangle = 1/2(base*altitude)
        double base_triangle = (2*area_in_cmsq)/altitude_triangle;

        System.out.println("Base of Triangle = " + base_triangle + "cm");


    }
}