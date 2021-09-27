package com.digitalinnvoationone.everis10092021.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class TerceiroDesafio {

    //area inferior

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        char O = scanner.next().toUpperCase().charAt(0);
        double sum = 0;
        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                M[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {

                if((j == 5 || j == 6) && i == 7) {
                    sum += M[i][j];
                }else if((j >= 4 && j <= 7) && i == 8) {
                    sum += M[i][j];
                }else if((j >= 3 && j <= 8) && i == 9) {
                    sum += M[i][j];
                }else if((j >= 2 && j <= 9) && i == 10){
                    sum += M[i][j];
                }else if((j >= 1 && j <= 10) && i == 11) {
                    sum += M[i][j];
                }
            }
        }

        double media = sum / 30;

        System.out.printf("%.1f", O == 'S' ? sum : media);
    }
}
