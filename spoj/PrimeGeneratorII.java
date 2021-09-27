package com.fabio.desafiosonline.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrimeGeneratorII {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testsCase = Integer.parseInt(br.readLine());
        Map<Integer,Integer> intervalo = new LinkedHashMap<>();

        for(int i = 0; i < testsCase; i++){
            String[] numeros = br.readLine().split(" ");
            String n1 = numeros[0];
            String n2 = numeros[1];
            intervalo.put(Integer.parseInt(n1),Integer.parseInt(n2));
        }

        for(Map.Entry<Integer,Integer> n : intervalo.entrySet()){

            boolean primo = false;
            for(int i = n.getKey(); i <= n.getValue();i++){
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
        }
    }
}