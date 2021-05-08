package ro.ase.cts.Command.Clase;

public class ComandaRetragere extends ComandaAbstracta{

    public ComandaRetragere(Executant executant, float suma) {
        super(executant, suma);
    }

    @Override
    public void executa() {
        super.getExecutant().retrageSuma(super.getSuma());
    }
}
