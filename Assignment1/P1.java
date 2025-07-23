/* 1.  The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm,
   find its breadth and area.*/
 

class Program1{
    public static void main(String args[]){

        int perimeter_rectangle = 230;
        int lenght_rectangle = 70;
        
        // perimeter = 2*(l+b)
        int breadth = (perimeter_rectangle / 2) - lenght_rectangle;
        int area = (lenght_rectangle * breadth);

        System.out.println("breadth is : " + breadth + "cm");
        System.out.println("area is : " + area + "cm\u00B2");

    }

}