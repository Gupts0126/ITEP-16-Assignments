//36. What is the surface area of a cylinder if the diameter is 15m height is 7m?

class Program36{

    public static void main(String[] args) {

        int diameter = 15;
        int height = 7;

         double radius = diameter/2;


        double surface_area = Math.PI * 2 * radius*(radius + height);

        System.out.println("Surface area of the cylinder : " + surface_area + "cm\u00B2");
    }
}
