class LoginValidation{
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
        validateLogin("admin","1111");
        validateLogin("admin","1234");
    }
}