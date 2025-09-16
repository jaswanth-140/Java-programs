class FinallyExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("This is the finally block. It always executes!");
        }
        
        System.out.println("Program continues after try-catch-finally.");
    }
}
