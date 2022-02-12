//Создать класс Машина с полями год(int), цвет(String).
//Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
//Создать класс Main в котором создать экземпляры вызывая разные конструкторы.

package Exersice1;

public class Car {
     String color;
     int year;

    public Car(){
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    Object volume(){
         return this;
     }
}
