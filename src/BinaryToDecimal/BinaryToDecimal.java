package BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma sequência de até oito dígitos binários: ");
        String binary = scanner.nextLine();

        if(!numeroBinarioValido(binary)){
            System.out.println("Entrada invalida. A sequência deve conter apenas numeros binarios: 0 e 1");
            return;
        }
        int decimal = converterParaDecimal(binary);
        System.out.println("O equivalente decimal de " + binary + " é " + decimal);
    }


    private static boolean numeroBinarioValido(String binary) {
        for(char digito : binary.toCharArray()){
            if (digito != '0' && digito != '1'){
                return false;
            }
        }
        return true;
    }

    private static int converterParaDecimal(String binary) {
        int decimal = 0;
        int power = binary.length() - 1;

        for(char digito : binary.toCharArray()){
            int digitoValor = digito - '0';
            decimal += digitoValor * Math.pow(2, power);
            power--;
        }
        return decimal;
    }

}
