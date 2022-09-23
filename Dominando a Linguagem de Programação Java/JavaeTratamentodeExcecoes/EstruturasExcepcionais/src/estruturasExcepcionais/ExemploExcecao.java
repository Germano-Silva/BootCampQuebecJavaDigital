package estruturasExcepcionais;
/**
 * E quando inevitavelmente, ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?
 * A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.
 * A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
 * A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares:
 * Estrutura de um bloco com try e catch:
 * try {
 *   //  bloco de código conforme esperado
 * }
 * catch(Exception e) {
 * precisamos saber qual exceção
 *   bloco de código que captura as exceções que podem acontecer
 *   em caso de um fluxo não previsto
 * }
 * O bloco try / catch pode conter um conjunto de catchs, correspondentes a cada exceção prevista em uma funcionalidade do programa.
 */

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
