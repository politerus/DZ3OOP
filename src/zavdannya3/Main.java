package zavdannya3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(43000,180,2022,"Honda Acord");
        Plane plane1 = new Plane(77400000,890,2003,12500,1000,"Airbus A320");
        Ship ship1 = new Ship(1350000000,23,2016,2700,"Багамах","Harmony of the Seas");

        System.out.println("Автомобиль маркой :"+car1.model+", " +car1.yearBuild+" года выпуска, может разогнатся до :"+
                car1.speed+" км/ч, стоймость данного автомобиля "+car1.praice+ "$.");
        System.out.println("Самолет маркой :"+plane1.model+", " +plane1.yearBuild+" года выпуска, может разогнатся до :"+
                plane1.speed+" км/ч, на высоте "+plane1.height+" метров над уровнем моря,на борту может находится :"+plane1.howManyPeople+
                "  человек,стоймость данного самолета "+plane1.praice+ "$.");
        System.out.println("Корабль маркой :"+ship1.model+", " +ship1.yearBuild+" года выпуска, может разогнатся до :"+
                ship1.speed+" узлов,данный корабль зарегистрирыван на "+ship1.portOfRegistration+" он может перевозить "+ship1.howManyPeople+" человек," +
                "стоймость корабля составляет :" +ship1.praice+ "$.");
    }
}
    /*  Використовуючи IntelliJ IDEA, створіть проект.
        Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
        координати та параметри суден (ціна, швидкість, рік випуску).
        Створіть 3 похідних класи Plane, Саг та Ship.
        Для класу Plane має бути визначена висота та кількість пасажирів.
        Для класу Ship – кількість пасажирів та порт приписки.
        Написати програму, яка виводить на екран інформацію про кожен засіб пересування. */

