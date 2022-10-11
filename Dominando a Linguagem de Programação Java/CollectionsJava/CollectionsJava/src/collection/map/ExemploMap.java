package collection.map;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

//        Map carrosPopulares2020 = new HashMap(); //antes do java 5
//        Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//        HashMap<String, Double> carrosPopulares = new HashMap<>();
//        Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        //criando um mep colocamos o tipo da variavel chave e o tipo do seu valor  encapsulamos um objeto
        //adicionamos uma seguencia de identificação ao objeto com o HashMap
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            //para adicionar no map usamos o metodo put conforme identificamos o seu tipo
            //lembrando que a chave deve ser de valor unico
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        //como a chave já existe no sistema faremos a reescrita da chave e adicionaremos outro valor a mesma com o metodo put
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        //para realizar a pesquisa devemos passar o objeto depois containsKey o metodo de pesquisa e a chave que estamos procurando
        // retornando se a chave é verdadeira ou falsa
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //para retornar o valor de uma chave usamos o metodo get
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

//        não se tem modelo para verificar a ordem que foi adicionado as chave porem as mesmas são unicas
//        System.out.println("Exiba o terceiro modelo adicionado: ");


        System.out.println("Exiba os modelos: ");
        //metodo KeySet retorna um set
        //como retornar um set vamos adicionar a uma variavel temporaria para chamar os modelos do tipo String
        //o tipo de variavel deve ser de acordo com o tipo da chave
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //metodo values retorna uma collection
        //adicionamos uma variavel temporaria
        //atribuimos os valores das chaves
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        //crias-se uma variavel  utiliza-se a Classe Collections utiliza o metodo max incapsula o objeto junto do metodo values
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        //Para puxar o modelo mais eficiente utiliza-se o entrySet
        //retorna-se um Set
        //adiciona uma variavel temporaria
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        //Cria-se uma variavel de controle
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        //devido o retorno ser uma collection podemos utilizar o metodo interator podendo somar
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        //
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
