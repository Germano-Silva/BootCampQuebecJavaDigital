package desafiosCodigoBasicoJavaQuebec;

import java.util.Arrays;

/**
 * ================================"💻 Desafio"================================
 * O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
 * uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.
 * Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um programa que
 * retorne como resultado apenas os números pares dessa array.
 *================================"Entrada"===============================
 * A entrada consiste em um array de números inteiros positivos.
 *================================"Saída"=================================
 * A saída do desafio equivale aos números pares do Array, como mostra o exemplo a baixo:
 *================================"Exemplo 1:"============================
 *===========Entrada===============================Saída==================
 *  2, 3, 5, 7, 11, 13, 18, 34  |                 2, 18, 34
 */
public class ArraysPares {
    public static void main(String[] args) {
        //📖 inicializar valores em um array em sua declaração
        int[] array = {2, 3, 5, 7, 11, 13, 18, 34};
        //📖 Cria-se uma variável temporária
        //📖 Gera-se a saída do valor de cada elemento do array
        //📖 Adiciona-se +1 ao index do vetor
        for (int i = 0; i< array.length;  i++){
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }
    }
}