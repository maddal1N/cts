package cts.sirbu.madalin.g1086.Factory.clase;

public class Factory {
    public IClip create(TipVideo tipVideo, String denumire, int durata){
        switch (tipVideo){
            case TUTORIAL:{
                Tutorial tutorial = new Tutorial(denumire,durata);
                return tutorial;
            }
            case LIVE:{
                Live live = new Live(denumire,durata);
                return live;
            }
            default: throw new IllegalArgumentException("Tipul nu este corect.");
        }
    }
}
