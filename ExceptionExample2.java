class ExceptionExample2{

    static void checkNumber(int num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Number must be positive!");
        } else {
            System.out.println("Number is: " + num);
        }
    }

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            checkNumber(-5);

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Caught an Exception: " + e);

        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
