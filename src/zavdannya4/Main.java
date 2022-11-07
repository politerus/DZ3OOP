package zavdannya4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите серийный ключ");
        int accessUser = scanner.nextInt();
//    Для експерт версии ключ - 7773727;
//    Для PRO  версии ключ - 122218;


        if (accessUser==ExpertDocumentWorker.getExpKey()){
            System.out.println(" Вы открыли Expert версиию  программы");
            ExpertDocumentWorker expAccess = new ExpertDocumentWorker();
            expAccess.openDocument();
            expAccess.editDocument();
            expAccess.saveDocument();
        } else if (accessUser==ProDocumentWorker.getAccessKeyPro()) {
            System.out.println(" Вы открыли PRO версию программы");
            ProDocumentWorker proAccess = new ProDocumentWorker();
            proAccess.openDocument();
            proAccess.editDocument();
            proAccess.saveDocument();
        } else  {
            System.out.println("Данного клллюча не существует,активирывана бесплатная версия программы ");
            DocumentWorker freeAccess = new DocumentWorker();
            freeAccess.openDocument();
            freeAccess.editDocument();
            freeAccess.saveDocument();

        }


    }
}
