package zavdannya4;

public class ExpertDocumentWorker extends ProDocumentWorker{

    private static int AccessKey = 7773727;

     public static int getExpKey() {
        return AccessKey;
    }

    public void saveDocument(){
        System.out.println("Документ сохранен в новом формате");

    }
}
