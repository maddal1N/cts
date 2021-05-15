package cts.sirbu.madalin.g1086.Decorator.clase;

import cts.sirbu.madalin.g1086.Factory.clase.IClip;

public abstract class DecoratorAbstract implements IClip {
    private IClip clip;

    public DecoratorAbstract(IClip clip) {
        this.clip = clip;
    }

    public IClip getClip() {
        return clip;
    }

    @Override
    public void pause() {
        this.clip.pause();
    }
    @Override
    public void stop() {
        this.clip.stop();
    }
    @Override
    public void resume() {
        this.clip.resume();
    }

    @Override
    public void start() {
        this.clip.start();
    }

    public abstract void rulareReclama();
}
