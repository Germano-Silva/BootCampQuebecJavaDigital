package gof.strategy;

public class ComportamentoNormal extends Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}
