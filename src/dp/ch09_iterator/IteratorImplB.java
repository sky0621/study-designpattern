package dp.ch09_iterator;

/**
 * 2016/05/08.
 */
public class IteratorImplB implements Iterator {

    private String[] target;
    private int idx;

    public IteratorImplB(String[] target) {
        this.target = target;
    }

    @Override
    public boolean hasNext() {
        return idx < target.length;
    }

    @Override
    public Object next() {
        Object item = target[idx];
        idx++;
        return item;
    }
}
