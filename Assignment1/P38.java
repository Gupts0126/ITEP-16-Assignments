/*38. The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface 
of the cylinder?*/

class Program38{

    public static void main(String[] args) {

        int volume = 1287;
        int radius = 10;

         double height = (volume/(Math.PI*radius*radius));

         double surface_area = Math.PI * 2 * radius*(radius + height);

        System.out.println("Surface area of the cylinder : " + surface_area + "cm\u00B2");
    }
}
