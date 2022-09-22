package condicionalComposto;
//Fluxo de controle composto
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;
        if ( nota >= 7 ){//esta condição precisa retornar true ou false
            System.out.println("aprovado");
        }else if (nota >=5 && nota < 7){
            System.out.println("Prova de Recuperação");
        }else
            System.out.println("Reprovado");
    }
}