// 7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².

class Program7{
    public static void main(String args[]){
        int base = 50;
        int area  = 500;

        // Area of traingle = 1/2 * base * height
        int height = ( area / base ) * 2 ;

        System.out.println("Height of Traingle : " + height + "cm");
    }
}