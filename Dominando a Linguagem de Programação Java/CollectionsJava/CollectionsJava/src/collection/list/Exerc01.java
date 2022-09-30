package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 *      Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
 *      System.out.println("Crie uma lista chamada notas2 " +
 *      "e coloque todos os elementos da list Arraylist nessa nova lista: ");
 *      System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
 *      System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
**/
public class Exerc01 {
    public static void main(String[] args) {
        List<Double> notas2 = new ArrayList<Double>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println("Crie uma lista chamada notas2 " + notas2 + "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
    }
}
