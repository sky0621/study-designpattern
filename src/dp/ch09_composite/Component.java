package dp.ch09_composite;

import java.util.List;

/**
 * Created by SS on 2016/05/17.
 */
public interface Component {

    void operation();

    List<Component> add(Component component);

    List<Component> remove(Component component);

    Component getChild(int index);

}