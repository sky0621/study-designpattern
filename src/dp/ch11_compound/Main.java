package dp.ch11_compound;

import dp.Z;

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
        FlockComposite flockComposite = new FlockComposite();

        AbstractQuackFactory countFactory = new CountQuackFactory();
        flockComposite.add(countFactory.createMallardDuck());
        flockComposite.add(countFactory.createRedheadDuck());
        flockComposite.add(countFactory.createDuckCall());
        flockComposite.add(countFactory.createRubberDuck());

        AbstractQuackFactory quackFactory = new QuackFactory();
        flockComposite.add(quackFactory.createGoose());

        Z.p("Duck Simulater with Observer");
        QuackObserver observer = new Quackologist();
        flockComposite.registerObserver(observer);

        flockComposite.quack();
        Z.p(QuackCountDecorator.getQuacks());
    }

}
