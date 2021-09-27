package com.fabio.desafiosonline.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrimeGenerator {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testsCase = Integer.parseInt(br.readLine());
        Map<Integer,Integer> intervalo = new LinkedHashMap<>();
        for(int i = 0; i < testsCase; i++){
            String[] numeros = br.readLine().split(" ");
            int n1 = Integer.parseInt(numeros[0]);
            int n2 = Integer.parseInt(numeros[1]);
            intervalo.put(n1,n2);
        }
        intervalo.forEach((k,v) ->{
            boolean primo = false;
            for(int i = k; i <= intervalo.get(k);i++){
                if(i == 1) primo = false;
                else if(i == 2) primo = true;
                else if(i % 2 == 0) primo = false;
                else {
                    for (int j = 2; j < i; j++){
                        if ( i % j == 0){
                            primo = false;
                            break;
                        } else primo = true;
                    }
                }
                if (primo){System.out.println(i);}
            }
            System.out.println();
        });
    }
}
