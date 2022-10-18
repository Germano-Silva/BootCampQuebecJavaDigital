package desafiosCodigoBasicoJavaQuebec;

import java.util.Scanner;
/**
 * ================================"💻 Desafio"================================
 * Faça um programa que leia um valor T e preencha um vetor N[1000] com a
 * sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
 * Imprima o vetor N.
 *================================"Entrada"=====================================
 * A entrada contém um valor inteiro T (2 ≤ T ≤ 50).
 *================================"Saída"=======================================
 * Para cada posição do vetor, escreva "N[i] = x",
 * onde i é a posição do vetor e x é o valor armazenado naquela posição.
 *==============================================================================
 */
public class PreenchimentoVetor {
    public static void main(String[] args){
        //📖 Importa-se a classe Scanner para ler os comandos digitados pelo console.
        Scanner scan = new Scanner(System.in);
        //📖 Cria-se objeto para ser adicionado a variável.
        int t = scan.nextInt();
        //📖 Cria-se um objeto
        //📖 Declara array como um array de ints
        //📖 Cria-se espaço para 1000 variaveis do tipo inteiro
        int[]  n = new int [1000];
        //📖 Declarou-se um laço de repetição
        //📖 Cria-se i sendo uma variavel temporária para a posição do array
        for(int i = 0; i < n.length;){
            //📖 Cria-se x sendo uma variavel temporária para o valor do array
            for(int x = 0 ; x < t ; x++ ){
                if(i>= n.length){
                    break;
                }else{
                    System.out.println("N[" + i + "] = " + x);
                    i++;
                }
            }
        }
    }
}
