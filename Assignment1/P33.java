/*33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two
 pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m.
 Calculate the total usable area of the garden.*/

class Program33 {

    public static void main(String args[]) {

        int length_of_garden = 30;
        int breadth_of_garden = 20;

        int length_of_path1 = 30;
        int breadth_of_path1 = 3;

        int length_of_path2 = 20;
        int breadth_of_path2 = 4;

        int length_of_commonpath = 3;
        int breadth_of_commonpath = 4;

        float area_of_garden = length_of_garden * breadth_of_garden;
        float area_of_path1 = length_of_path1 * breadth_of_path1;
        float area_of_path2 = length_of_path2 * breadth_of_path2;
        float area_of_commonpath = length_of_commonpath * breadth_of_commonpath;

        System.out.println("Total area usable for garden is : " + (area_of_garden - (area_of_path1 + area_of_path2 - area_of_commonpath)) + "cm\u00B2");
    }
}
