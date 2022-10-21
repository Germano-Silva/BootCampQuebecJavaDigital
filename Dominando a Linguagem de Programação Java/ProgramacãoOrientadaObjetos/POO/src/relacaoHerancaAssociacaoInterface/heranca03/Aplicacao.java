package relacaoHerancaAssociacaoInterface.heranca03;

public class Aplicacao {
    public static void main(String[] args) {
        //Quando validado que o metodo possue o mesmo nome porem processamento diferente realiza-se o polimorfismo.
        Mae[] classe = new Mae[]{new Filha01(), new Filha02(), new Mae()};

        for (Mae classes: classe){
            classes.metodo01();
        }
        System.out.println(" ");
        for (Mae classes: classe){
            classes.metodo02();
        }
        System.out.println(" ");
        Filha02 filha02 = new Filha02();
        filha02.metodo02();
    }
}
