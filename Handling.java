
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Handling {

    public static void Menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
    }

    public static void ConvertFromBinary() {
        System.out.println("1.Convert to Decimal");
        System.out.println("2.Convert to Hexa");
        int choice = Validate.CheckInputChoiceBase();

        switch (choice) {
            case 1:
                System.out.println("Decimal is : " + Convert.ConvertBinaryToDecimal());
                break;

            case 2:
                System.out.println("HexaNumber is : " + Convert.ConvertBinaryToHexa());
                break;
        }
    }

    public static void ConvertFromDecimal() {
        System.out.println("1.Conver to Binary ");
        System.out.println("2.Conver to Hexa ");
        int choice = Validate.CheckInputChoiceBase();

        switch (choice) {
            case 1:
                System.out.println("Binary is : " + Convert.ConvertDecimalToBinary());
                break;

            case 2:
                System.out.println("Hexa is :" + Convert.ConvertDecimalToHexa());
                break;
        }
    }

    public static void ConvertFromHexanumber() {
        System.out.println("1.Conver to Binary ");
        System.out.println("2.Conver to Decimal ");
        int choice = Validate.CheckInputChoiceBase();
        int decimal = 0 ;
        switch(choice){
            case 1 : 
                System.out.println("BinaryNumber is : " + Convert.ConverHexaToBinary());
                break;
            case 2 :
                System.out.println("Decimal is : " + Convert.ConvertHexaToDecimal());
                break;
        }   

    }

}
