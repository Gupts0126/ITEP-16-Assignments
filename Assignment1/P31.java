//31. What will be the area of a square with perimeter 200 m?

class Program31{
    public static void main(String args[]){
        int perimeter = 200;
        int side;
        
        //perimeter = 4*side
        side = perimeter/4;
         
        int area = side * side;
        System.out.println("Area of square: " +area+"m\u00B2");
    }
}