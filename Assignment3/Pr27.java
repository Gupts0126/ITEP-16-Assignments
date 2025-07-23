import java.util.Scanner;

 class Program027{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        int basic_salary = sc.nextInt();

        float hra,da,gross_salary;

        if (basic_salary <= 10000) {
           hra =(basic_salary*20)/100.0f;
           da =(basic_salary*80)/100.0f;

            gross_salary = basic_salary + hra + da;

            System.out.println("Gross Salary: " + gross_salary);

        } 
        else if (basic_salary <= 20000) {
            hra = (basic_salary*25)/100.0f;
            da = (basic_salary*90)/100.0f;

              gross_salary = basic_salary + hra + da;

              System.out.println("Gross Salary: " + gross_salary);

        } 
        else if(basic_salary > 20000 ){
            hra = (basic_salary*30)/100.0f;
            da =  (basic_salary*95)/100.0f;

              gross_salary = basic_salary + hra + da;

               System.out.println("Gross Salary: " + gross_salary);

        }
    }
}