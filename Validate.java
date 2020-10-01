
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validate {

    //check input cua choice;
    public static int CheckInputChoice() {
        System.out.print("Enter choice menu: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int inputchoice = Integer.parseInt(sc.nextLine());
                Validate choiceValidate = new Validate(inputchoice, 1, 4);
                return inputchoice;
            } catch (NumberFormatException e) {
                System.err.println("Enter 1 through 4");
                System.out.print("Enter again : ");
            } catch (ExInputChoice ex) {
                System.err.println("Enter 1 through 4");
                System.out.print("Enter again : ");
            }
        }

    }

    public static int CheckInputChoiceBase() {
        System.out.print("Enter choice : ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int inputchoice = Integer.parseInt(sc.nextLine());
                Validate choiceValidate = new Validate(inputchoice, 1, 2);
                return inputchoice;
            } catch (NumberFormatException e) {
                System.err.println("Enter 1 through 2");
                System.out.print("Enter again : ");
            } catch (ExInputChoice ex) {
                System.err.println("Enter 1 through 2");
                System.out.print("Enter again : ");
            }
        }

    }

    public static String CheckInputBinary() {
        boolean CheckInput;
        String inputbinary = "";
        do {
            CheckInput = true;
            System.out.print("Enter Binarynumber : ");
            Scanner sc = new Scanner(System.in);
            inputbinary = sc.nextLine();
            for (int i = 0; i < inputbinary.length(); i++) {

                if (inputbinary.charAt(i) < 48 || inputbinary.charAt(i) > 49) {
                    CheckInput = false;
                }
            }
            if (CheckInput == false) {
                System.err.println("Enter 0 or 1");
            }
        } while (CheckInput == false);

        return inputbinary;
    }

    public static String CheckInputDecimal() {
        boolean CheckInput;
        String inputdecimal = "";
        do {
            CheckInput = true;
            System.out.print("Enter Decimalnumber : ");
            Scanner sc = new Scanner(System.in);
            inputdecimal = sc.nextLine();
            for (int i = 0; i < inputdecimal.length(); i++) {
                if (inputdecimal.charAt(i) < 48 || inputdecimal.charAt(i) > 57) {
                    CheckInput = false;
                }
            }
            if (CheckInput == false) {
                System.err.println("Enter 0 through 9");
            }
        } while (CheckInput == false);

        return inputdecimal;
    }

    public static String CheckInputHexa() {
        String InPutHexa ;
        System.out.print("Enter HexaNumber : ");
        int loop;
        do {
            loop = 0;
            Scanner sc = new Scanner(System.in);
            InPutHexa = sc.nextLine();
            for (int i = 0; i < InPutHexa.length(); i++) {
                if ((InPutHexa.charAt(i) >= '0' && InPutHexa.charAt(i) <= '9')||(InPutHexa.charAt(i) >= 'A' && InPutHexa.charAt(i) <= 'F')) {
                }  
                else {
                    loop = 1;
                }
            }
            if (loop == 1) {
                System.err.println("Enter 0->9 and A->F");
                System.out.print("Enter again : ");
            }
        } while (loop == 1);
        return InPutHexa;
    }

   
    public Validate(int inputchoice, int min, int max) throws Validate.ExInputChoice {
        if (inputchoice > max || inputchoice < min) {
            throw new Validate.ExInputChoice();
        }
    }

    private static class ExInputChoice extends Exception {

        public ExInputChoice() {
        }
    }

}
