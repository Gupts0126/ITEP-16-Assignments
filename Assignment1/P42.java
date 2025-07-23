//42. Find the Volume of Cylinder whose diameter and height are 2.25cm

class Program42{

    public static void main(String[] args) {

        double height = 2.25;
        double diameter = 2.25;
        
        double radius = diameter/2;

        double volume = Math.PI * radius*radius* height;

        System.out.println("Volume of the cylinder : " + volume + "cm\u00B3");
    }
}