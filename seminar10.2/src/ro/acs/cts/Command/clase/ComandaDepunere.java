package ro.acs.cts.Command.clase;

public class ComandaDepunere extends ComandaAbstracta{
    public ComandaDepunere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().depunere(super.getSuma());
    }
}
