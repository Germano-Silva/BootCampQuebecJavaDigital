package desafiosCodigoBasicoJavaQuebec;

import java.io.IOException;
import java.util.Scanner;
/**================================"Classe Scanner"================================
 * A classe Scanner apareceu a partir do Java 5 com o objetivo de facilitar a entrada de dados no modo Console.
 * Uma das características mais interessante da classe Scanner é a possibilidade de obter o valor digitado
 * diretamente no formato do tipo primitivo que o usuário digitar. Para isso basta utilizarmos os métodos next
 * do tipo primitivo no formato nextTipoDado(). Como no código abaixo.
 */

/**
 * ================================"💻 Desafio"================================
 * O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1.
 * O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 * Após, calcule e mostre o valor a ser pago.
 *================================"Entrada"===============================
 * O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 * respectivamente dois inteiros e um valor com 2 casas decimais.
 *================================"Saída"=================================
 * A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de
 * deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser
 *  apresentado com 2 casas após o ponto.
 *================================"Exemplo 1:"============================
 *===========Entrada===============================Saída==================
 *          12 1 5.30                      VALOR A PAGAR: R$ 15.50
 *          16 2 5.10
 */

public class ValorSerPago {
    //📖 Importa-se a classe Scanner para ler os comandos digitados pelo console.
    public static void main(String[] args) throws IOException {
        //📖 Cria-se objeto para ser adicionado a variável.
        Scanner leitor = new Scanner(System.in);
        //📖 Cria-se as variáveis temporárias, adiciona os elementos em seu espaço de memória
        int c1 = leitor.nextInt();
        int q1 = leitor.nextInt();
        double v1 = leitor.nextDouble();

        //📖 Cria-se as variáveis temporárias, adiciona os elementos em seu espaço de memória
        int c2 = leitor.nextInt();
        int q2 = leitor.nextInt();
        double v2 = leitor.nextDouble();

        //📖 Cria-se a função para que multiplicar e somar os valores respectivos.
        //📖 Adiciona-se o valor a uma variável temporária para facilitar o entendimento.
        double total = q1 * v1 + q2 * v2;
        //📖 Imprima-se no console o valor total da função criada.
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
    }

}