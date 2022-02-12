//Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы вызывая конструктор из конструктора.
//Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

package Exersice3;

public class Car {
    String color = "black";
    int year = 2020;
    double width = 1520;
    int sped = 150;

    public Car() {
        this.color = color;
        this.year = year;
        this.width = width;
        this.sped = sped;
    }

    public Car(String color) {
        this.color = "white";
        this.year = year;
        this.width = width;
        this.sped = sped;
    }

    public Car(String color, int year) {
        this.color = "Blu";
        this.year = 2019;
        this.width = width;
        this.sped = sped;
    }

    public Car(String color, int year, int width) {
        this.color = "Braun";
        this.year = 2018;
        this.width = 1200;
        this.sped = sped;
    }

    public Car(String color, int year, int width, double sped) {
        this.color = "green";
        this.year = 2013;
        this.width = 1350;
        this.sped = 120;
    }

    Object volume() {
        return this;
    }

}