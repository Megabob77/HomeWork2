package Exersice1;

public class Car {
     String color;
     int year;

    public Car(int year,String color){
        this.color = color;
        this.year = year;
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
