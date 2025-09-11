public class throw2{
    static void Checkage(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Access denied - you must be at least 18 years old");
        }
        else
        {
            System.out.println("Access granted");
        }
    }
    public static void main(String[]args)
    {
        try
        {
            Checkage(15);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}