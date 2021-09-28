package com.digitalinnvoationone.everis10092021.basico;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A * B;   ; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + PROD);

        sc.close();

    }

}
