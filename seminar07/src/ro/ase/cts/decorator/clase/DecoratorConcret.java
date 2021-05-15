package ro.ase.cts.decorator.clase;

public class DecoratorConcret extends DecoratorAbstract{

    public DecoratorConcret(CardBancar cardBancar) {
        super(cardBancar);
    }

    @Override
    public void platesteContactless() {
        System.out.println( ((Card)super.getCardBancar()).getTitular() + " a platit contactless.");
    }
}
