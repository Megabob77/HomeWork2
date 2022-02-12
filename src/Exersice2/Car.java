//Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
//Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
//Перегрузить конструкторы.
//Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.

package Exersice2;

public class Car {
    String color = "Black";
    int year = 2020;
    double width = 1520;
    int sped = 150;

    public Car(){
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public Car(String color, int year, double width) {
        this.color = color;
        this.year = year;
        this.width = width;
    }

    public Car(String color, int year, double width, int sped) {
        this.color = color;
        this.year = year;
        this.width = width;
        this.sped = sped;
    }

    Object volume() {
        return this;
    }

}

