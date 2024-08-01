package DoubleDispatch;

import java.util.Collection;

public interface Explorer {

    void visitMercury (Mercury mercury);
    void visitVenus (Venus venus);
    void visitMars (Mars mars);
    void visitSaturn(Saturn saturn);

    default void visit(Planet planet) {
        System.out.println("landing on generic planet");
    }
}

