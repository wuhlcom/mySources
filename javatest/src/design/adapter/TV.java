package design.adapter;

public class TV implements DoublePin {
    @Override
    public void electrify(int l, int m) {
        System.out.println("电视机接上 l线和m线通电");
    }
}
