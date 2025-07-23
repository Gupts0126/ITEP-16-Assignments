//44. Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 


class Program44{
    public static void main(String[] args) {
        
        int a = -21;
        int d = 3;
        int n = 28;

        int nth_term = a+(n-1)*d;

        System.out.println("The 28th term of AP is : "+nth_term);
    }
}
