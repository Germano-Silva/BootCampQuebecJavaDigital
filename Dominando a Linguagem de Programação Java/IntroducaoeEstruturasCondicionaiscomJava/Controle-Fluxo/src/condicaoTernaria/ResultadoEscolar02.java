package condicaoTernaria;
public class ResultadoEscolar02 {
    public static void main(String[] args) {
        /* condição 01 simples if e else
        int nota02 = 7;
        String resultado = nota02 >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
         */
        //condição composta if - else if - else
        int nota02 = 7;
        String resultado = nota02 >=7 ? "Aprovado" : nota02 >=5 && nota02 <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}