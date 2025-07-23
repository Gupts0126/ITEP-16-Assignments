// 45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .

class Program45{
    public static void main(String[] args) {
        
        int a = -21;
        int d = 3;
        int n = 28;

        int sum = (n/2)*(2*a+(n-1)*d);

        System.out.println("The sum of first 28th term of AP is : "+sum);
    }
}