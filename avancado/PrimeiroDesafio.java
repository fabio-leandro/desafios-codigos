package com.digitalinnvoationone.everis10092021.avancado;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class PrimeiroDesafio{

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);
        for (int i = 1; i < N.length;i++) {
            N[i] = N[i - 1].divide(new BigDecimal(2));
        }
        DecimalFormat decFormat = new DecimalFormat("0.0000");
        for (int i = 0; i < N.length;i++) {
            System.out.println("N[" + i + "] = " + decFormat.format(N[i]));
        }

    }

}
