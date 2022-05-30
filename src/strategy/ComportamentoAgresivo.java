package strategy;

public class ComportamentoAgresivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Move-se agressivamente...");
    }
}
