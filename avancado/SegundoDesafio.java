package com.digitalinnvoationone.everis10092021.avancado;

import java.io.IOException;
import java.util.Scanner;

public class SegundoDesafio {

    public static void main(String[] args) throws IOException {

            Scanner leitor = new Scanner(System.in);
            int N = leitor.nextInt();
            int casaComprado = 0;
            int casaSobrando = 0;
            int trabComprado = 0;
            int trabSobrando = 0;
            for (int i = 0; i < N;i++) {
                    String previsaoIda = leitor.next();
                    String previsaoVolta = leitor.next();
                if (previsaoIda.equals("sol") && previsaoVolta.equals("chuva")) {
                    if(trabSobrando > 0){
                        trabSobrando--;
                        casaSobrando++;
                    }else {
                        trabComprado++;
                        casaSobrando++;
                    }

                } else if (previsaoIda.equals("chuva") && previsaoVolta.equals("sol")) {
                    if(casaSobrando > 0){
                        casaSobrando--;
                        trabSobrando++;
                    }else{
                        casaComprado++;
                        trabSobrando++;
                    }

                }else if (previsaoVolta.equals("chuva") && previsaoVolta.equals("chuva")) {

                    if(casaSobrando > 0){
                        casaSobrando--;
                        trabSobrando++;
                    }else{
                        casaComprado++;
                        trabSobrando++;
                    }

                    if(trabSobrando > 0){
                        trabSobrando--;
                        casaSobrando++;
                    }else {
                        casaSobrando++;
                    }


                }
            }

            System.out.println(casaComprado + " " + trabComprado);
        }

}
