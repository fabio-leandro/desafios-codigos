package com.digitalinnvoationone.everis10092021.basico;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        List<Integer> listaPessoas = new ArrayList<Integer>();
        int N = scan.nextInt();
        for (int i = 0; i < N; i++)
            listaPessoas.add(scan.nextInt());

        int menorPessoa = listaPessoas.indexOf(Collections.min(listaPessoas))+1;
        System.out.println(menorPessoa);
    }

}
