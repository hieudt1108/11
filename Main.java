
import static java.lang.System.exit;
import sun.awt.SunHints;

public class Main {

    public static void main(String[] args) {
        Handling.Menu();

        while (true) {

            int choice = Validate.CheckInputChoice();
            switch (choice) {
                case 1:
                    Handling.ConvertFromBinary();
                    break;
                case 2:
                    Handling.ConvertFromDecimal();
                    break;
                case 3:
                    Handling.ConvertFromHexanumber();
                    break;
                case 4:
                    exit(0);
            }
            Handling.Menu();
        }

    }

}
