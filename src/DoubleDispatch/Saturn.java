package DoubleDispatch;

public class Saturn implements Planet{

    @Override
    public void accept(Explorer e) {
        e.visitSaturn(this);
    }
}
