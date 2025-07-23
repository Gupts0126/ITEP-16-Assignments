//Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.

class Program39 {

    public static void main(String[] args) {

        int diameter = 12;
        int height = 9;

        double radius = diameter/2;

        double surface_area = Math.PI * 2 * radius*(radius + height);

        System.out.println("Surface area of the cylinder : " + surface_area + "cm\u00B2");
    }
}
