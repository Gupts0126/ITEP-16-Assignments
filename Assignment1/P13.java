/* 13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long.
 Find the length of other leg. */

class Program13{
    public static void main(String[] args) {

        int one_leg = 16;
        int area_triangle = 184;
        
        // area of right angle triangle = 1/2(base*height) 
        int other_leg=(area_triangle*2)/one_leg;

        System.out.println("Other Leg of Tringle = " +other_leg + "cm");

    }
}