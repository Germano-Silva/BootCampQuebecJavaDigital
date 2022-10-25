package desafio;
/**================================"Desafio"================================
 * Dado um inteiro x, retorne o número de etapas para reduzi-lo a zero.
 * Em uma etapa, se o número atual for par, você deve dividi-lo por 2,
 * caso contrário, você deve subtrair 1 dele.
 *
 *
 */
import java.util.*;

public class ReduziUmNumAZero {
        // Abaixo segue um exemplo de código que você pode ou não utilizar
        public static void main(String[] args) {
            int num = Integer.parseInt(new Scanner(System.in).nextLine());
            int step = 0;

            //condição onde seja possível reduzir o número até 0:
            while (num > 0){
                if ((num & 1) == 1){
                    step++;
                }
                num /= 2;
                step++;
            }
            if(step %2 == 0){
                System.out.println(step);
            }else{
                System.out.println(--step);
            }
        }
    }
