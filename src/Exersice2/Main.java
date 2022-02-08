package Exersice2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("white");
        Car car1 = new Car("black", 2021);
        Car car2 = new Car("Blu", 2019, 1500);
        Car car3 = new Car("yellow", 2015, 1650, 150.5);

        System.out.println(car.color);
        System.out.println();
        System.out.println(car1.color + " , " + car1.year);
        System.out.println();
        System.out.println(car2.color + " , " + car2.year + " , " + car2.width);
        System.out.println();
        System.out.println(car3.color + " , " + car3.year + " , " + car3.width + " . " + car3.sped);

    }
}
