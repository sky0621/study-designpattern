package dp.ch11_compound;

import dp.Z;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SS on 2016/05/23.
 */
// ダックシミュレーター
public class Main {
    public static void main(String... args) {
        Main m = new Main();
        m.simulate();
    }

    void simulate() {
        List<Quackable> quackableList = new ArrayList<>();

        AbstractQuackFactory countFactory = new CountQuackFactory();
        quackableList.add(countFactory.createMallardDuck());
        quackableList.add(countFactory.createRedheadDuck());
        quackableList.add(countFactory.createDuckCall());
        quackableList.add(countFactory.createRubberDuck());

        AbstractQuackFactory quackFactory = new QuackFactory();
        quackableList.add(quackFactory.createGoose());

        System.out.println("\nDuck Simulater");

        quackableList.stream().forEach(quacker -> quacker.quack());
        Z.p(QuackCountDecorator.getQuacks());
    }

}
