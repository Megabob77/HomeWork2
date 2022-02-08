package Exersice2;

public class Car {
    String color;
    int year;
    int width;
    double sped;

    public Car(String color) {

        this.color = color;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public Car(String color, int year, int width) {
        this.color = color;
        this.year = year;
        this.width = width;
    }

    public Car(String color, int year, int width, double sped) {
        this.color = color;
        this.year = year;
        this.width = width;
        this.sped = sped;
    }
    Object volume() {
        return this;
    }

}

