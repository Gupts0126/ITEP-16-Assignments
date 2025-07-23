import java.util.Scanner;
class Program03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total marks : ");
        int total_marks = sc.nextInt();
        
        System.out.println("Enter the obtained marks : ");
        int obtained_marks = sc.nextInt();

        float percentage = (obtained_marks*100.0f)/total_marks;

        System.out.println("Percentage of student : "+percentage+"%");
    }
}