package condicionalSimples;
//Fluxo de controle simples
public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;
        //a estrutura condicional de 1 condição não é necessario criar um bloco ex: linha 13 a 14
        //a estutura condicional com mais e uma instrução é preciso criar um bloco ex: linha 10 a 13
        if (valorSolicitado<saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo Saldo : " + saldo);
        }else
            System.out.println("Saldo insuficiente");
            //System.out.println(saldo);

    }
}