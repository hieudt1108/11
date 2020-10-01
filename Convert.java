
import static java.lang.Math.pow;

public class Convert {

    public static int ConvertBinaryToDecimal() {
                    int decimal = 0;
        while (true) {

            int loop = 0;
            do {
                try {
                    decimal = Integer.parseInt(Validate.CheckInputBinary(), 2);
                    loop = 1;
                } catch (NumberFormatException e) {
                    System.err.println("Over limit");

                }
            } while (loop == 0);
            if (decimal == Integer.MAX_VALUE) {
                System.err.println("Vuot qua gia tri tinh toan ");
            } else {
                break;
            }
        }
            return decimal;

        }

    

    public static String ConvertBinaryToHexa() {
        int decimal = 0;
        int loop = 0;
        do {
            try {
                decimal = Integer.parseInt(Validate.CheckInputBinary(), 2);
                loop = 1;
            } catch (NumberFormatException e) {
                System.err.println("Neither number nor over limit ! Enter again");
            }
        } while (loop == 0);
        String HexaRep = "";
        while (decimal > 0) {
            int result = decimal % 16;
            if (result > 9) {
                HexaRep += (char) (result + 55);
            } else {
                HexaRep += (char) (result + 48);
            }
            decimal /= 16;
        }
        String Hexa = "";
        for (int i = HexaRep.length()-1; i >= 0; i--) {
            Hexa += HexaRep.charAt(i);

        }
        return Hexa;
    }

    public static String ConvertDecimalToBinary() {
        int decimalvalue = 0;
        int loop = 0;
        do {
            try {
                decimalvalue = Integer.parseInt(Validate.CheckInputDecimal(), 10);
                loop = 1;
            } catch (NumberFormatException e) {
                System.err.println("Neither number nor over limit ! Enter again");
            }
        } while (loop == 0);
        String BinaryRep = "";
        String Binary = "";
        while (decimalvalue > 0) {
            int result = decimalvalue % 2;
            BinaryRep += (char) (result + 48);
            decimalvalue /= 2;
        }
        for (int i = BinaryRep.length()-1; i >= 0; i--) {
            Binary += BinaryRep.charAt(i);
        }
        return Binary;
    }

    public static String ConvertDecimalToHexa() {
        int decimalvalue = 0;
        int loop = 0;
        do {
            try {
                decimalvalue = Integer.parseInt(Validate.CheckInputDecimal());
                loop = 1;
            } catch (NumberFormatException e) {
                System.err.println("Neither number nor over limit ! Enter again");
            }
        } while (loop == 0);
        String HexaRep = "";
        while (decimalvalue > 0) {
            int result = decimalvalue % 16;
            if (result > 9) {
                HexaRep += (char) (result + 55);
            } else {
                HexaRep += (char) (result + 48);
            }
            decimalvalue /= 16;
        }
        String Hexa = "";
        for (int i = HexaRep.length()-1; i >= 0; i--) {
            Hexa += HexaRep.charAt(i);

        }
        return Hexa;
    }

    public static String ConverHexaToBinary() {
        String hexa = Validate.CheckInputHexa();
        int index = 0;
        int decimal = 0;
        for (int i = hexa.length()-1; i >= 0; i--) {
            if (Character.isDigit(hexa.charAt(i))) {
                int valueofindex = hexa.charAt(i) - 48;
                decimal += valueofindex * pow(16, index);
                index++;
            } else {
                int valueofindex = hexa.charAt(i) - 55;
                decimal += valueofindex * pow(16, index);
                index++;
            }
        }

        String BinaryRep = "";
        String Binary = "";
        while (decimal > 0) {
            int result = decimal % 2;
            BinaryRep += (char) (result + 48);
            decimal /= 2;
        }
        for (int i = BinaryRep.length()-1; i >= 0; i--) {
            Binary += BinaryRep.charAt(i);
        }
        return Binary;
    }

    public static int ConvertHexaToDecimal() {
        int decimal = 0;
        while (true) {
            String hexa = Validate.CheckInputHexa();
            int index = 0;
            decimal = 0;
            for (int i = hexa.length()-1; i >= 0; i--) {
                if (Character.isDigit(hexa.charAt(i))) {
                    int valueofindex = hexa.charAt(i) - 48;
                    decimal += valueofindex * pow(16, index);
                    index++;
                } else {
                    int valueofindex = hexa.charAt(i) - 55;
                    decimal += valueofindex * pow(16, index);
                    index++;
                }
            }
            if (decimal == Integer.MAX_VALUE) {
                System.err.println("Vuot qua gioi han tinh toan ! Enter again");
            } else {
                break;
            }
        }
        return decimal;
    }

}
