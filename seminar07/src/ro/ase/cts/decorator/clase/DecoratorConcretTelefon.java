package ro.ase.cts.decorator.clase;

public class DecoratorConcretTelefon extends DecoratorAbstract{
    public DecoratorConcretTelefon(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardBancar()).getTitular() + " a platit contactless cu telefonul.");
    }
}
