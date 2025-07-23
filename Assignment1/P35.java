// 35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.

class Program35 {

    public static void main(String[] args) {

        double radius = 7.7;
        int height = 12;

        double surface_area = Math.PI * 2 * radius*(radius + height);

        System.out.println("Surface area of the cylinder : " + surface_area + "cm\u00B2");
    }
}
