package zavdannya4;

public class ProDocumentWorker extends DocumentWorker{
    private static int AccessKeyPro = 122218;

    public static int getAccessKeyPro() {
        return AccessKeyPro;
    }

    public void editDocument(){
        System.out.println("Документ отредактированный");
    }

    public void saveDocument(){
        System.out.println("Документ сохранен в старом формате, в  других форматах сохренение возможно в Expert версии");

    }
}