import io.mangoo.core.Application;
import io.mangoo.enums.Mode;

public class Main {


    private Main(){
    }

    public static void main(String... args) {
        System.setProperty("application.mode", Mode.DEV.toString());
        Application.main("");
    }

}
