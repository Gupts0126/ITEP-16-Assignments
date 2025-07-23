import java.util.Scanner;

class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of board : ");
        int length_of_board = sc.nextInt();
        System.out.println("Enter breadth_of_board : ");
        int breadth_of_board = sc.nextInt();

        int perimeter = 2 * (length_of_board + breadth_of_board);

        System.out.println("The length of Ribbon need is :" + perimeter + " m");

    }
}