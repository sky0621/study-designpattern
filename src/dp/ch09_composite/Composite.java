package dp.ch09_composite;

import dp.Z;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/17.
 */
public class Composite implements Component {

    private String name;

    private List<Component> componentList;

    public Composite(String name) {
        this.name = name;
        componentList = new ArrayList<>();
    }

    @Override
    public void operation() {
        Z.p("Node[" + name + "]");
        componentList.parallelStream().forEach( Component::operation );
    }

    @Override
    public List<Component> add(Component component) {
        componentList.add(component);
        return componentList;
    }

    @Override
    public List<Component> remove(Component component) {
        componentList.remove(component);
        return componentList;
    }

    @Override
    public Component getChild(int index) {
        return componentList.get(index);
    }
}
