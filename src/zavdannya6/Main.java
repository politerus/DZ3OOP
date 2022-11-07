package zavdannya6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Printer standard = new  Printer();
        Printer aqua = new Aqua();
        Printer purple = new Purple();

        System.out.println("Введите первую фразу");

        Scanner innput =new Scanner(System.in);
        String phrase1 = innput.nextLine();

        System.out.println("Введите вторую фразу");
        String phrase2 = innput.nextLine();
        System.out.println("Введите третью фразу");
        String phrase3 = innput.nextLine();



        standard.print(phrase1);
        aqua.print(phrase2);
        purple.print(phrase3);

    }
}
     /*  Використовуючи IntelliJ IDEA, створіть проект.
        Потрібно: Створити клас Printer. У тілі класу створіть метод void print(String value),
        який виводить на екран значення аргументу. Реалізуйте можливість того,
        щоб у разі успадкування від даного класу інших класів,
        та виклику відповідного методу їх екземпляра, рядки, передані як аргументи методів,
        виводилися різними кольорами. Обязательно используйте приведення типів. */