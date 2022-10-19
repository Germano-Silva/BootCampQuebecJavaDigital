package estruturaBasicaPOO;

//📖 Cria-se a Classe Carro
public class Carro {
    //📖 Cria-se os atributos da classe Carro
    //📖 Filtra-se o tipo de atributo
    String cor;
    String modelo;
    int capacidadeTanque;
/**================================⚙ Método Construtor================================
 * 📖 Cria-se o Método conforme seu retorno
 * ⚙ Método Construtor: possibilita a criação de objetos a partir da Classe
 *     Carro(){}
 */

/**================================💣 Método Destrutor================================
 * 💣 Método Destrutor: auxilia-se na destruição de um objeto,
 * deve sempre iniciar com a palavra "void" não possuindo retorno
 * A sua função é a liberação de memora/recurso ocioso, dispensável e não mais utilizado
 *     void finalise(){}
 */

/**================================🚛 Método Sobrecarga================================
 * 🚛 Método Sobrecarga: É a utilização de um único método com o mesmo nome
 * porem seus parâmetros diferentes modificando a sua assinatura = nome + parâmetros
 * |=========================|
 * |          Exemplo        |
 * |=========================|
 * | m1()                    |
 * | m1(int i)               |
 * | m1(float f)             |
 * | m1(String s, long l)    |
 * | m1(long l, String s)    |
 * |=========================|
 */

/**================================🟣 Método Set================================
 * Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
 */

/**================================🟠 Método Get================================
 * Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
 */

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


}
