package com.fabio.desafiosonline.spoj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLife {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (true){
            int number = scan.nextInt();
            if(number == 42) break;
            if(number > 99) continue;
            numbers.add(number);
        }
        numbers.forEach(n -> System.out.println(n));
        scan.close();
    }
}
