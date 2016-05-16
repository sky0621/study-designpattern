package dp.ch09_composite;

import dp.Z;

import java.util.List;

/**
 * Created by SS on 2016/05/17.
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        Z.p("Leaf[" + name + "]");
    }

    @Override
    public List<Component> add(Component component) {
        return null;
    }

    @Override
    public List<Component> remove(Component component) {
        return null;
    }

    @Override
    public Component getChild(int index) {
        return null;
    }
}
