package design.adapter;

public class TVSimpleAdapter extends TV implements TriplePin {
    @Override
    public void electrify(int l, int m, int n) {
        super.electrify(l,m);
    }
}
