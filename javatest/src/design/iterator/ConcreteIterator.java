package design.iterator;

/**
 * Created by Administrator on 2016/5/8 0008.
 * 具体迭代器
 */
public class ConcreteIterator<T> implements MyIterator<T> {

    private Aggregate<T> aggregate;
    private int cursor = 0;

    public ConcreteIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return cursor != aggregate.count();
    }

    @Override
    public T next() {
        T obj = null;
        if(this.hasNext()){
            obj = aggregate.get(cursor++);
        }
        return obj;
    }
}

