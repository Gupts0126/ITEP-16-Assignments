/*12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its 
sides containing the right angle is 12 cm. Find the length of the other side.*/


 class Program12 {
    public static void main(String[] args) {
        int hypotenuse = 13;
        int oneside = 12;

        double otherside = Math.sqrt(hypotenuse * hypotenuse - oneside * oneside);

        double area_triangle = (1/2.0f) * (oneside * otherside);
        System.out.println("Otherside of Triangle : " + otherside + "cm");
        System.out.println("Area of Triangle : " + area_triangle + "cm\u00B2");
    }

}