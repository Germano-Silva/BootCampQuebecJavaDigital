/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 * Método deve conter as operações aritimeticas essenciais.
 * Os Métodos utilizados não vão ter retorno por causa do public static void = publico statico vazio.
 * Visibilidade = public
 * Tipo/modificador = static
 * Retorno = void
 * Nome = soma
 * Parametros = numero1 e numero2
 */
public class Calculadora {
    //Método soma atribuir duas variaveis a seu parametros e as utiliza para realizar a somatorias das duas variaveis.
    public static void soma(double numero1, double numero2) {
        //é realizado a soma dos paramentros e armazinado em uma variavel temporaria chamada resultado.
        double resultado = numero1 + numero2;
        //utilizado como método de saida dos parametros e a variavel temporaria.
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }
    //Método subtração atribuir duas variaveis a seu parametros e as utiliza para realizar a subtração das duas variaveis
    public static void subtracao(double numero1, double numero2) {
        //é realizado a subtração dos paramentros e armazinado em uma variavel temporaria chamada resultado.
        double resultado = numero1 - numero2;
        //utilizado como método de saida dos parametros e a variavel temporaria.
        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }
    //Método multiplicação é atribuido duis parametros e as utiliza para realizar a multiplicação das duas variaveis
    public static void multiplicacao(double numero1, double numero2) {
        //é realizado a multiplicação dos paramentros e armazinado em uma variavel temporaria chamada resultado.
        double resultado = numero1 * numero2;
        //utilizado como método de saida dos parametros e a variavel temporaria.
        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }
    //Método divisão atribuir duas variaveis a seu parametros e as utiliza para realizar a divisão das duas variaveis
    public static void  divisao(double numero1, double numero2) {
        //é realizado a divisão dos paramentros e armazinado em uma variavel temporaria chamada resultado.
        double resultado = numero1 / numero2;
        //utilizado como método de saida dos parametros e a variavel temporaria.
        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}
