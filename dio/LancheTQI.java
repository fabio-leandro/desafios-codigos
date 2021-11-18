package com.fabio.desafiosonline.dio;

import java.util.Scanner;

public class LancheTQI {

    public static void main(String[] args) {
        int codigo, quantidade;
        float preco = 0;

        Scanner input = new Scanner(System.in);
        codigo = input.nextInt();
        quantidade = input.nextInt();
            if (codigo == 1) {
                preco  = (float) (4.00 * quantidade);
            }else if (codigo == 2) {
                preco  = (float) (4.50 * quantidade);  //implemente sua lógica aqui
            }else if (codigo == 3) {
                preco  = (float) (5.00 * quantidade);  //implemente sua lógica aqui
            }else if (codigo == 4) {
                preco  = (float) (2.00 * quantidade); //implemente sua lógica aqui
            }else if (codigo == 5) {
                preco  = (float) (1.50 * quantidade); //implemente sua lógica aqui
            }

        System.out.printf("Total: R$ %.2f\n",preco);
        input.close();
    }

}
/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

CODIGO  ESPECIFICAÇÃO PREÇO
1 Cachorro Quente R$4,00
2 X-Salada        R$4,50
3 X-Bacon         R$5,00
4 Torrada simples R$2,00
5 Refrigerante    R$1,50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade
de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago,
com 2 casas após o ponto decimal.

Exemplo de Entrada	Exemplo de Saída
3 2

                    Total: R$ 10.00

4 3

                    Total: R$ 6.00

2 3

                    Total: R$ 13.50
 */
