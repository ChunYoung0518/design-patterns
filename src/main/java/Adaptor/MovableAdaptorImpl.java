package Adaptor;

public class MovableAdaptorImpl implements Adaptor.MovableAdaptor {

    private Adaptor.Movable luxuryCars;

    public MovableAdaptorImpl(Adaptor.Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
