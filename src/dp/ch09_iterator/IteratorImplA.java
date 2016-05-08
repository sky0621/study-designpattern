package dp.ch09_iterator;

import java.util.List;

/**
 * 2016/05/08.
 */
public class IteratorImplA implements Iterator {

    private List<String> target;
    private int idx = 0;

    public IteratorImplA(List<String> target) {
        this.target = target;
    }

    @Override
    public boolean hasNext() {
        return idx < target.size();
    }

    @Override
    public Object next() {
        Object item = target.get(idx);
        idx++;
        return item;
    }

}
