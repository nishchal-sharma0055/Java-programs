public class varrayDemo {
    public static void main(String[] args) {
        printmax(34, 3.3, 2, 56, 5);
        printmax(new double []{1,2,3});
    }
    public static void printmax(double...number)
    {
        if(number.length==0)
        {
            System.out.println("no arguments passed");
            return;
        }double result = number[0];
        for(int i=0; i<number.length; i++)
        {
            if(number[i]>result)
            result=number[i];
            System.out.println("the max value is"+result);
        }
    }
}
