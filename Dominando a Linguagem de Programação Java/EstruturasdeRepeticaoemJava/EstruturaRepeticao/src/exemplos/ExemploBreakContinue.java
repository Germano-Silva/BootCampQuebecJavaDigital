package exemplos;
public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            System.out.println(numero);
        }
        //Qual a saída no console ?
        //Quando chegou no número 3 foi interrompido
        //se alterar para continue ele vai continuar mas não vai imprimir quando número igual a 3
    }
}