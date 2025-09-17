class ExceptionExample {

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("This block always runs (finally).");
        }
    }
}
