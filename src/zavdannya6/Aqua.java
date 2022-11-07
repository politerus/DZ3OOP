package zavdannya6;

public class Aqua extends Printer {
    public static final String ANSI_CYAN = "\033[0;36m";
    public static final String ANSI_RESET = "\033[0m";
    void print(String value) {
       System.out.println(ANSI_CYAN+value+ANSI_RESET);
     //   public static final String ANSI_GREEN = "\u001B[32m";
      //  public static final String ANSI_RESET = "\u001B[0m";
      //  void print(String value){
       //     System.out.println(ANSI_GREEN+value+ANSI_RESET);
    }
}
