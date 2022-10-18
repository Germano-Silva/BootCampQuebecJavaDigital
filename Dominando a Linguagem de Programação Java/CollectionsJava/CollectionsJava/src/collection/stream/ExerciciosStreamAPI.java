package collection.stream;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
/*================================Utilizando o ForEach Exemplo 01==========================*/
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
/*================================Método completo====================================
 *       numerosAleatorios.stream().forEach(new Consumer<String>() {
 *       📖 para utilizar o forEach é necessário utilizar uma interface funcional
 *          @Override
 *          public void accept(String s) {
 *          📖 a utilização desse método vai pegar elemento por elemento do tipo String e vai imprimir um por um
 *              System.out.println(s);
 *            }
 *          });
 */
/*================================Usuando a simplificação lambida=============================
 *         📖 Usando o método de lambida simplificando
 *         numerosAleatorios.stream().forEach(s -> System.out.println(s));
 */
/*================================Simplificando para método de referencia=============================
 *          Usando o forEach com o método liste não é necessário usar o stream
 *          Para maior simplificação devemos transformar a lambida para um método de referência
 *          numerosAleatorios.forEach(System.out::println);
 */
/*================================Utilizando o ForEach Exemplo 02==========================*/
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream()
            .limit(5)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
/*================================Adicionando a um objeto==========================
 *         Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
 *                 .limit(5)
 *                 .collect(Collectors.toSet());
 *         System.out.println(numerosAleatorios5Primeiros);
 */
/*================================Utilizando o ForEach Exemplo 03================================*/
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosInteger);
/*================================Método completo====================================
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
/*================================Lambida=========================================
 *
 *         📖 utilizando a simplificação da lambida
 *         numerosAleatorios.stream()
 *                 .map(s -> Integer.parseInt(s);
 */
/*================================Método de Referencia=========================================
 *
 *        📖 Utilizando mais simplifiocação com referenciamento de metodo
 *         numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList())
 *                 .forEach(System.out::println);
 */
/*================================Armazenando em um Objeto====================================
 *
 *         📖 Simplificando para uma lista de inteiros utilizando um objeto para armazenar
 *         List<Integer> numerosAleatorios1 = numerosAleatorios
 *                 .stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList());
 *                 .forEach(System.out::println);
 *
 *         📖 Simplificando para uma lista de inteiros utilizando um objeto para armazenar
 *         List<Integer> numerosAleatoriosInteger = numerosAleatorios
 *                 .stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList());
 *         System.out.println(numerosAleatoriosInteger);
 *
 */
/*================================Utilizando o ForEach Exemplo 04================================*/
         System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
         List<Integer> listParesMaioresQue2 = numerosAleatorios
                 .stream()
                 .map(Integer::parseInt)
                 .filter(i -> (i % 2 == 0 && i > 2))
                 .collect(Collectors.toList());
         System.out.println(listParesMaioresQue2);

/*================================Método completo===============================
 *            📖 adicionado a um objeto o resultado
 *          List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
 *            📖 transformando em inteiro
 *                  .map(new Function<String, Object>() {
 *                      @Override
 *                      public Object apply(String i) {
 *                          return Integer.parseInt(i);
 *                      }
 *                  })
 *             📖 Fazendo o filtro para realizar a separação de números pares e maiores que 2
 *                  .filter(new Predicate<Integer>() {
 *                      @Override
 *                      public boolean test(Integer i) {
 *                          if (i %2 ==0 && i>2)  return true;
 *                          return false;
 *                      }
 *                  })
 *              📖 como o método collect iremos fazer a retirada do que solicitamos e vamos adicionar em uma lista.
 *                  .collect(Collectors.toList());
 *          System.out.println(listParesMaioresQue2);
 */
/*================================Simplificando método map===============================
 *         System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
 *         📖 adicionado a um objeto o resultado
 *         List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
 *         📖 transformando em inteiro simplificando o método map
 *                 .map(Integer::parseInt)
 *                 .filter(new Predicate<Integer>() {
 *                     @Override
 *                     public boolean test(Integer i) {
 *                         if (i %2 ==0 && i>2)  return true;
 *                         return false;
 *                     }
 *                 })
 *                 .collect(Collectors.toList());
 *         System.out.println(listParesMaioresQue2);
 */
/*================================Usando a simplificação lambida=============================
 *         System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
 *        📖 adicionado a um objeto o resultado
 *         List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
 *        📖 transformando em inteiro simplificado
 *                 .map(Integer::parseInt)
 *        📖 simplificando o filtro usando o lambida
 *                 .filter(i -> (i %2 ==0 && i>2))
 *                 .collect(Collectors.toList());
 *         System.out.println(listParesMaioresQue2);
 */
/*================================Utilizando o ForEach Exemplo 05================================*/
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);
/*================================Método completo================================
 *      System.out.println("Mostre a média dos números: ");
 *      numerosAleatorios.stream()
 *          📖 Método mapToInt pega cada elemento do fluxo para realizar manipulações no mesmo.
 *           .mapToInt(new ToIntFunction<String>() {
 *                 @Override
 *                 public int applyAsInt(String s) {
 *                      return Integer.parseInt(s);
 *                     }
 *                 });
 *           📖 Simplificação do método mapToInt com a lambida.
 *           .mapToInt(s -> Integer.parseInt(s));
 *           📖 simplificando para um referenciador de método.
 *           .mapToInt(Integer::parseInt)
 *           📖 Utilizamos o método avarage OptionalDouble para não termos um retorno nulo, já que vamos utilizar números inteiros.
 *           .average()
 *           📖 Ao realizar a média o ifPresent vai identificar se é um valor diferente de inteiro vai transformar em Double e adicionar a variável.
 *           .ifPresent(new DoubleConsumer() {
 *                @Override
 *                public void accept(double v) {
 *                System.out.println(v);
 *                     }
 *                 });
 *           📖 Simplificamos conforme a regra do lambida.
 *            .ifPresent(v -> System.out.println(v))
 *           📖 Simplificamos para um referencial de método.
 *           .ifPresent(System.out::println)
 *
 **/
/*================================Utilizando o ForEach Exemplo 06================================*/
        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger1 = numerosAleatorios
                .stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteger1.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger1);
/*================================Método completo================================
 *         List<Integer> numerosAleatoriosInteger1 = numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList());
 *         📖 Chamamos a variável com a lista de inteiros
 *         📖 Para removermos chamamos o método de list removeIf
 *         numerosAleatoriosInteger1.removeIf(new Predicate<Integer>() {
 *             @Override
 *             public boolean test(Integer integer) {
 *                 if (integer % 2 != 0) return true;
 *                 return false;
 *             }
 *         });
 *         System.out.println(numerosAleatoriosInteger1);
 */
/*================================Lambida================================
 *         List<Integer> numerosAleatoriosInteger1 = numerosAleatorios.stream()
 *                 .map(Integer::parseInt)
 *                 .collect(Collectors.toList());
 *         📖 chamos a variavel com a lista de inteiros
 *         📖 para removermos chamamos o método de list removeIf
 *         📖 Simplifica-se o método conforme a lambida
 *         numerosAleatoriosInteger1.removeIf(integer -> (integer % 2 != 0));
 *         System.out.println(numerosAleatoriosInteger1);
 */
/*================================Exemplos fora da aula para estudar================================
 *         System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
 *         numerosAleatoriosInteger.stream()
 *                 .skip(3)
 *                 .forEach(System.out::println);
 *
 *         long countNumerosUnicos = numerosAleatoriosInteger.stream()
 *                 .distinct()
 *                 .count();
 *         System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
 *
 *         System.out.print("Mostre o menor valor da lista: ");
 *         numerosAleatoriosInteger.stream()
 *                 .mapToInt(Integer::intValue)
 *                 .min()
 *                 .ifPresent(System.out::println);
 *
 *         System.out.print("Mostre o maior valor da lista: ");
 *         numerosAleatoriosInteger.stream()
 *                 .mapToInt(Integer::intValue)
 *                 .max()
 *                 .ifPresent(System.out::println);;
 *
 *         int somaDosNumerosPares = numerosAleatoriosInteger.stream()
 *                 .filter(i -> (i % 2 == 0))
 *                 .mapToInt(Integer::intValue)
 *                 .sum();
 *         System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);
 *
 *         System.out.println("Mostre a lista na ordem númerica: ");
 *         List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
 *                 .sorted(Comparator.naturalOrder())
 *                 .collect(Collectors.toList());
 *         System.out.println(numerosOrdemNatural);
 *
 *         System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
 * //        dica: collect(Collectors.groupingBy(new Function())
 *         Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
 *                 .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
 *         System.out.println(collectNumerosMultiplosDe3E5);
 *     }
 * }
 **/
    }}