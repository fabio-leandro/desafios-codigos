package com.digitalinnvoationone.everis10092021.intermediario;

import java.util.Scanner;

public class QuartoDesafio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 1; i <= N; i++){
            if(N % i == 0) System.out.println(i);
        }
        scan.close();
    }
}