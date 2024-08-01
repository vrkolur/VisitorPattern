package DoubleDispatch;

public class LifeExplorer implements Explorer{
    @Override
    public void visitMercury(Mercury mercury) {
        System.out.println("Deploying tools specific to Mercury");
    }

    @Override
    public void visitVenus(Venus venus) {
        System.out.println("Deploying tools specific to Venus");
    }

    @Override
    public void visitMars(Mars mars) {
        System.out.println("Deploying tools specific to mars");
    }

    @Override
    public void visitSaturn(Saturn saturn) {
        System.out.println("Deploying tools specific to saturn");
    }

}
