import java.lang.Exception;
class myException extends Exception{
    myException(String message)
    {
        super(message);
    }
}
public class testmyException {
    public static void main(String[] args) {
        int x=5, y=1000;
        try
        {
            float z=(float)x/(float)y;
            if(z<0.01)
            {
                throw new myException("number is to small");
            }
        }   
        catch(myException e)
        {
            System.out.println("catch my Exception");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println(" I am always here");
        }
    }
}
