package relacaoHerancaAssociacaoInterface.heranca03;

public class Aplicacao {
    public static void main(String[] args) {
        //Quando validado que o método possui o mesmo nome porem processamento diferente realiza-se o polimorfismo.
        Mae[] classe = new Mae[]{new Filha01(), new Filha02(), new Mae()};
        //Para filho01 e 02 vai ocorrer o polimorfismo devido: os métodos se diferem, mas permanecem com o mesmo nome.
        for (Mae classes: classe){
            classes.metodo01();
        }
        System.out.println(" ");
        //No caso a baixo devido o Filho01 não ter o método pedido vai ser enviado da classe Mãe, não ocorrendo o polimorfismo.
        for (Mae classes: classe){
            classes.metodo02();
        }
        System.out.println(" ");
        //sobrescrita direta do método
        Filha02 filha02 = new Filha02();
        filha02.metodo02();
    }
}
