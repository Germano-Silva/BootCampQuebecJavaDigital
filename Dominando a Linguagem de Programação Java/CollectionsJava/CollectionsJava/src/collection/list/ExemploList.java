package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); //antes do java 5
//      List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        //Generics(jdk 5) - Diamond Operator(jdk 7)
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        //para imprimir pode ser de dois metodos somente a variavel ou variavel e o metodo toString
        System.out.println(notas.toString());

        // para mostrar a posição utiliza-se indexOf
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //para asicionar um elemento em uma posição especifica utiliza-se o metodo add onde ve-se passar a posição e o que deseja ser alterado
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        //metodo de subistituição é utilizado o set que recebe a posição pelo metodo indexOf e o elemento
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //para verificação se existe um objeto na lista deve utilizar o metodo contains retornando false ou true
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //para impremir a lista em sua posição em ordem de incerção, toda lista e apresentada dessa maneira
        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);*/

        //para passar uma posição e retorne o elemento exite o metodo  get passamos a posição e recebemos o elemento, lembrando que os itens de uma lista inicia-se com zero
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //para exibir a menor nota não exite um metodo nativo, porem utilizamos a classe e o metodo Collectuons.min(variavel)
        //essa classe utiliza-se da interface de comparação informando quem vem primeiro e quem vem em segundo
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //para exibir a menor nota não exite um metodo nativo, porem utilizamos a classe e o metodo Collectuons.max(variavel)
        //essa classe utiliza-se da interface de comparação informando quem vem primeiro e quem vem em segundo
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //para exibir a menor nota não exite um metodo nativo, mas podemos utilizar do metodo iterator para interar a nossa lista
        //apartir dessa iteração ir somando os valores da lista
        //Cria-se um obejeto, adiciona a lista a esse objeto
        Iterator<Double> iterator = notas.iterator();
        //cria-se uma variavel temporaria
        Double soma = 0d;
        //utiliza-se um laço de repetição, onde vai ser chamado cada item da lista do objeto
        while(iterator.hasNext()){
            Double next = iterator.next();
            //vai ser somado e adicionado a variavel até a finalização da lista
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //media seria o total dos elementos dividido pela quantidade de elementos ja temos o total na variavel soma e utilizamos o
        //metodo size onde ele vai trazer a quantidade de elementos da lista
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        //para remover de um elemnto da lista utilizamos o metodo remove podendo ser removido do index (posição) caso declare o valor deve mesclar apara elemento
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        //ustiliza-se o metodo iterator e o metodo remove
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /**
         * para apagar toda a lista devemos utilizar o metodo clear
         * System.out.println("Apague toda a lista");
         *         notas.clear();
         *         System.out.println(notas);
        **/

        //o metodo isEmpty vai informar se possui elementos na lista retornando false se possue elemnetos e true se não possi elementos
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}
