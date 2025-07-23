//40. I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.

class Program41{

    public static void main(String[] args) {

        int height = 50;
        int diameter = 30;
        
        int radius = diameter/2;

        double volume = Math.PI * radius*radius* height;

        System.out.println("Volume of the cylinder : " + volume + "cm\u00B3");
    }
}