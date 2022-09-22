package exemplos;
import java.util.concurrent.ThreadLocalRandom;
/**
 * estrutura do controle de fluxo while
 * while (expressão booleana de validação){
 *   comando que será executado até que a
 *   expressão de validação torne-se falsa
 * }
 */
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while( mesada > 0 ) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }
    //Metodo para ter um número aleatorio entre 2 e 8 de formato double
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}