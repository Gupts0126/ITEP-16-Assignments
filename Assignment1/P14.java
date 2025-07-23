/*14. The length of one of the diagonals of a field in the form of a quadrilateral is 46 m.
 The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, 
 find the area of the field.*/


class Program14 {
    public static void main(String[] args) {
      
      int diagonal = 46;
      int vertix1 = 13;
      int vertix2= 10;

      float area = (1/2.0f) * (vertix1 + vertix2) * diagonal;

      System.out.println("Area of Quadrilateral : " +area+"m\u00B2");
      
    }

}