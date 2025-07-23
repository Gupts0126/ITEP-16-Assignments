/*34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and
 its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases.
 Calculate the area of the wooded area after the addition of the walkway.*/
 

class Program34 {
    public static void main(String[] args) {
      
      int base1 = 128;
      int base2= 92;
      int height = 40;

      int breadth_of_walkway = 4;
      int length_of_walkway = 40; 
      // walkway is perpendicular to both base so length will equal to height of trapezoid

      double area = 0.5 * (base1 + base2) * height;
      double area_of_walkway = breadth_of_walkway * length_of_walkway;
      double total_area = (area + area_of_walkway);

      System.out.println("Area of wooded area after the addition of walkway " +total_area+"m\u00B2");
        
    }

}