/*37. The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter
 of this cylinder?*/


 class Program37{

    public static void main(String[] args) {

        int surface_area = 149;
        int height = 6;
        double radius,diameter;
        //area = 2*Math.PI*r*(r+h)
        
        int a = 2;
        int b = 12;
        double c = -149/Math.PI;
        
        radius = (Math.sqrt(b*b-4*a*c)/4)-(3);
        diameter = radius*2;

        System.out.println("Diameter of cylinder : " +diameter);
    }
}
