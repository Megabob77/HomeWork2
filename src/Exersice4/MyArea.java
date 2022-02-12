//Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
// который должен принимать радиус, и используя PI посчитать площадь круга.
//Создать класс Main, где запустить данный метод.

package Exersice4;

public class MyArea {

       private static final double Pi = 3.14;

       public static void main(String[] args) {
           System.out.println(MyArea.areaOfCircle(6));
       }

           private static double areaOfCircle ( double radius){
               return Pi * Math.pow(radius, 2);

           }
       }





