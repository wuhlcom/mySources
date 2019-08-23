package design.adapter;

public class TVAdapter implements TriplePin {

    DoublePin doublePin;

    public TVAdapter(DoublePin doublePin) {
        this.doublePin = doublePin;
    }

    @Override
    public void electrify(int l, int m, int n) {
        doublePin.electrify(l,m);
    }
}
