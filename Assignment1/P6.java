// 6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.

class Program6{
    public static void main(String args[]){
        double a = 10, b = 9; 
        double perimeter = 36;
        double c = perimeter-(a+b);
        
        // semi-perimeter
        double s = perimeter/2;
        // heron's formula
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area of Traingle :" + area + "cm\u00B2");
         
    }
}