package collection.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
/**================================Utilizando o ForEach==========================*/
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
/**================================Método completo====================================
 *       numerosAleatorios.stream().forEach(new Consumer<String>() {
 *       📖 para utilizar o forEach é necessario utilizar uma interface funcional
 *          @Override
 *          public void accept(String s) {
 *          📖 a utilização desse metodo vai pegar elemento por elemento do tipo String e vai imprimir um por um
 *              System.out.println(s);
 *            }
 *          });
 */
/**================================Usuando a simplificação lambida=============================
 *         📖 Usando o metodo de lambida simplificando
 *         numerosAleatorios.stream().forEach(s -> System.out.println(s));
 */
/**================================Simplificando para método de referencia=============================
 *          Usando o forEach com o metodo liste não é necessario usar o stream
 *          Para maior simplificação devemos tranformar o lambida para um metodo de referencia
 *          numerosAleatorios.forEach(System.out::println);
 */
/**================================Adicionando os 5 primeiros números em um set e imprimindo eles==================
 *
 *         System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
 *         numerosAleatorios.stream()
 *                 .limit(5)
 *                 .collect(Collectors.toSet())
 *                 .forEach(System.out::println);
 */
/**================================Adicionando os 5 primeiros número em um set=========================
 *         Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
 *                 .limit(5)
 *                 .collect(Collectors.toSet());
 *         System.out.println(numerosAleatorios5Primeiros);
 */
/**================================Método completo====================================
 *         📖 Utilizando sem abstração com o método completo
 *         System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
 *         numerosAleatorios.stream()
 *                 .map(new Function<String, Interger>() {
 *                     @Override
 *                     public Integer apply(String s){
 *                         return Integer.parseInt(s);
 *                     }
 *                 })
 */
/**================================Lambida=========================================
 *
 *         📖 utilizando a simplificação do lambida
 *         numerosAleatorios.stream()
 *                 .map(s -> Integer.parseInt(s);
 */
/**================================Método de Referencia=========================================
 *
 *        📖 Utilizando mais simplifiocação com referenciamento de metodo
 *         numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList())
 *                 .forEach(System.out::println);
 */
/**================================Armazenando em um Objeto====================================
 *
 *         📖 Simplificando para uma lista de inteiros utilizando um objetos para armazenar
 *         List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                .collect(Collectors.toList());
 *
 *
 *         List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList());
 *
 */
/**================================Método completo===============================
 *         System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
 *         📖 adicionado a um objeto o resultado
 *         List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
 *         📖 tranformando em interiro
 *                 .map(Integer::parseInt)
 *                 .filter(new Predicate<Integer>() {
 *                     @Override
 *                     public boolean test(Integer i) {
 *                         if (i %2 ==0 && i>2)  return true;
 *                         return false;
 *                     }
 *                 }).collect(Collectors.toList());
 *         System.out.println(listParesMaioresQue2);
 */
/**================================Usuando a simplificação lambida=============================
 *         System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
 *        📖 adicionado a um objeto o resultado
 *         List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
 *        📖 tranformando em interiro
 *                 .map(Integer::parseInt)
 *                 .filter(i -> (i %2 ==0 && i>2))
 *                 .collect(Collectors.toList());
 *         System.out.println(listParesMaioresQue2);
 */

//        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
//        numerosAleatorios.stream()
                    //tranformando em interiro
//                .map(Integer::parseInt)
                    //filtrando mumeros pares e maiores que 2

//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

//        System.out.println("Mostre a média dos números: ");
//        numerosAleatorios1.stream()
//                .average()
//                .ifPresent(System.out::println);
//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

//        System.out.println("Remova os valores ímpares: ");
//        numerosAleatorios1.removeIf(integer -> integer % 2 != 0);
//        System.out.println(numerosAleatorios1);
//        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(numerosAleatoriosInteger);

//        Para você
        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countNumerosUnicos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);

        System.out.print("Mostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Mostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);

        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numerosOrdemNatural);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}
