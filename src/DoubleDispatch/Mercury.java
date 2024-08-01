package DoubleDispatch;

public class Mercury implements Planet {

    @Override
    public void accept(Explorer e) {
        e.visitMercury(this);
    }
}
