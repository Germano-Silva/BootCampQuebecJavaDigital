package exemplos;
/**
 * O uso do for / each está fortemente relacionado, com um cenário onde contenha um array ou coleção,
 * e assim , a interação é baseada nos elementos da coleção.
 */
public class ExemploForArrays {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        //em Arrays sempre inicializa com 0 por isso a variavel de inicialização inicia-se com 0
        for (int x=0; x<alunos.length /* tamanho*/; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}