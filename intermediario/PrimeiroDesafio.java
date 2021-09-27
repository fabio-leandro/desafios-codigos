package com.digitalinnvoationone.everis10092021.intermediario;
import java.io.IOException;
import java.util.Scanner;
public class PrimeiroDesafio {
    //Area direita
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char O = scanner.next().toUpperCase().charAt(0);
        double sum = 0;

        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 12; j++)
                M[i][j] = scanner.nextDouble();

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if (((i < 6) && i + j >= 12) || ((i >= 12 / 2) && j - i > 0))
                    sum += M[i][j];
            }
        }

        double media = sum / 30;

        System.out.printf("%.1f", O == 'S' ? sum : media);
    }

}
