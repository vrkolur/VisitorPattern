package DoubleDispatch;

public class Venus implements Planet {

    @Override
    public void accept(Explorer e) {
        e.visitVenus(this);
    }
}
