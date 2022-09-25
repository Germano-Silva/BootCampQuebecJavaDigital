package estruturasExcepcionais;

public class CepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepException e) {
            System.out.println("O cep não corresponde as regras de negocio.");
        }
    }
    static String formatarCep(String cep) throws CepException {
        if(cep.length() != 8)
            throw new CepException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
