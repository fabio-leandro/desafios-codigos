package com.digitalinnvoationone.everis10092021.intermediario;

import java.util.Scanner;

public class QuintoDesafio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int fatorial = N;
        for(int i = N; i > 1; i--){
            fatorial = fatorial * (i - 1);
        }
        System.out.println(fatorial);
        scan.close();
    }
}
