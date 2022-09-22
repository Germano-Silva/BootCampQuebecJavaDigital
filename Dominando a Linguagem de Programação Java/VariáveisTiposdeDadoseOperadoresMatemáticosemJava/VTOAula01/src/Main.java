public class Main {
    //Aula 1 Variáveis, Tipos de Dados e Operadores Matemáticos em Java
    public static void main(String[] args) {
        int i;
        //int i; não deve ter variavel repitidas.
        //int 1; variaveis não podem começar com numeros
        int I;
        //para boas praticas é melhor não inicializar com _ ou $
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 11;
        //j = 15; variavel não pode ser mudada quando tiver em final
        int asrn24678;
        //int asr246 78; não permitido adicionar espaço em nome de variaveis
        int asr$246_78;
        //int asr$246_78%; não pode ser utilizado caracteres especias
        asrn24678 = 100;
        asr$246_78 = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; fora da boas praticas com primeira letra em maiusculos
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; fora de boas praticas
        int QUANTIDADE_OPCOES = 25;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678);
        System.out.println(asr$246_78);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}