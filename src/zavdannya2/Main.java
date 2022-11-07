package zavdannya2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BadPupil bad = new BadPupil();
        Schoolboy standardPupil = new Schoolboy();
        ExcelentPupil exPupil = new ExcelentPupil();
        GoodPupil goodPupil = new GoodPupil();
        System.out.println("Задайте количество учеников в класс(от 2 до 4)");

        Scanner scanner = new Scanner(System.in);
        int howManyPupils = scanner.nextInt();
        while (howManyPupils<2||howManyPupils>4){
            System.out.println("не верное количество учеников");
            howManyPupils = scanner.nextInt();
        }

        if (howManyPupils==4){ClassRoom cr = new ClassRoom(bad,standardPupil,goodPupil,exPupil);}
        if (howManyPupils==3){ClassRoom cr = new ClassRoom(bad,standardPupil,goodPupil);}
        if (howManyPupils==2){ClassRoom cr = new ClassRoom(bad,standardPupil);}






    }
}