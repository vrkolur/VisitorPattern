package DoubleDispatch;

public class Mars implements Planet {

    @Override
    public void accept(Explorer e) {
        e.visitMars(this);
    }
}
