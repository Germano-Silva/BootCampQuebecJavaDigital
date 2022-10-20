package relacaoHerancaAssociacaoInterface.heranca02;

public class Empresa {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente_ = new Funcionario();
        //downcasts não se devem ser trabalhados em Orientação a Objeto evitando erro
        //evitando erro de compilação
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
