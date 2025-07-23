/*2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm,
 find its length and perimeter.*/ 

class Program2{
    public static void main(String args[]){

        int area_rectangle = 96;
        int breadth_rectangle = 8 ;
        
        // area = length * breadth
        int length = (area_rectangle / breadth_rectangle);
        int perimeter = 2*(length + breadth_rectangle);

        System.out.println("length is : " + length + "cm");
        System.out.println("perimeter is : " + perimeter + "cm");

    }
}
