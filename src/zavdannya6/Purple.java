package zavdannya6;

public class Purple extends Printer {

    public static final String ANSI_PURPLE = "\033[0;35m";
    public static final String ANSI_RESET = "\033[0m";

    void print(String value){
        System.out.println(ANSI_PURPLE+value +ANSI_RESET);
    }
}
