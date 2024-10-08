package org.example;

public class NumDigits {

    public double digits(int num) {
        String numStr = String.valueOf(Math.abs(num));
        int digits = numStr.length();
        int soma = 0;


        for (int i = 0; i < digits; i++) {
            soma += Character.getNumericValue(numStr.charAt(i));
        }

        double media = (double) soma / digits;
        System.out.println("Número de dígitos: " + digits);
        System.out.println("Média dos dígitos: " + media);

        return media;
    }
}