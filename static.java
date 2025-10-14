class Car {
    static int totalCars = 0;
    
    public Car() {
        totalCars++;
    }
    
    public static void main(String[] args) {
        new Car();
        new Car();
        System.out.println("Total cars: " + totalCars);
    }
}