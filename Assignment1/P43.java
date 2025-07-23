/*43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm 
at the rate of 10 rs. Per sq. cm*/

class Program43{
    public static void main(String[] args) {
        int height = 4;
        int slant_height = 5;

        // using pythagorean theorem
        double base_radius = Math.sqrt((slant_height*slant_height)-(height*height));  

        double base_area = Math.PI*base*base;

        System.out.println("The cost of polishing the base : "+(base_area*10));
    }
}
