package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardBancar{
    private CardBancar cardBancar;

    public DecoratorAbstract(CardBancar cardBancar) {
        this.cardBancar = cardBancar;
    }


    public CardBancar getCardBancar() {
        return cardBancar;
    }

    @Override
    public void platestePOS() {
        this.cardBancar.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.cardBancar.platesteOnline();
    }

    public abstract void platesteContactless();
}
