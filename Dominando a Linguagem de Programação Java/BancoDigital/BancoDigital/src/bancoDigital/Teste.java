package bancoDigital;

public class Teste {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Germano");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(1200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

