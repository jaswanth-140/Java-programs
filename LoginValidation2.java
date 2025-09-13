class LoginValidation2{
    static void validateLogin(String username, String password)
    {
        if(!username.equals("admin")||!password.equals("1234"))
        {
            throw new SecurityException("Invalid username or password");
        }
        else
        {
            System.out.println("Login suceesful!");
        }
    }
    public static void main(String[]args)
    {
        try
        {
        validateLogin("admin","1111");
        }
        catch(SecurityException e)
        {
           System.out.println("Exception Caught: "+e.getMessage());
        }
        try
        {
        validateLogin("admin","1234");
        }
        catch(SecurityException e)
        {
           System.out.println("Exception Caught: "+e.getMessage());
        }
    }
}