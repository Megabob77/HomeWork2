package Exersice3;

public class Car {
    int year;
    double speed;
    int width;
    String color;

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int width) {
        this.year = year;
        this.speed = speed;
        this.width = width;
    }

    public Car(int year, double speed, int width, String color) {
        this.year = year;
        this.speed = speed;
        this.width = width;
        this.color = color;
    }
//    public Car(int year){
//        this.year = year;
//    }


    Object volum(){
        return this;
    }
}
