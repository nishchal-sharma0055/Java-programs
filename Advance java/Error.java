public class Error {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=5;
        int x, y;
        try
        {
            x=a/(b-c);
            System.out.println("x="+x);
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by zero");
        }
        y=a/(b+c);
        System.out.println("y="+y);
    }    
}
