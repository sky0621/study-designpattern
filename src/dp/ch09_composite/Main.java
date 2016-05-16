package dp.ch09_composite;

/**
 * Created by SS on 2016/05/17.
 */
public class Main {
    public static void main(String... args) {

        Composite menuComponent = new Composite("Menu Component");
        Composite menuItem = new Composite("Menu Item");
        menuItem.add(new Leaf("Item A"));
        menuItem.add(new Leaf("Item B"));
        menuComponent.add(new Leaf("Central Item 1"));
        menuComponent.add(new Leaf("Central Item 2"));
        menuComponent.add(new Leaf("Central Item 3"));
        menuComponent.add(menuItem);

        menuComponent.operation();
    }
}
