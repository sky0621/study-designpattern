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
        quackableList.add(new QuackCountDecorator(new MallardDuck()));
        quackableList.add(new QuackCountDecorator(new RedheadDuck()));
        quackableList.add(new QuackCountDecorator(new DuckCall()));
        quackableList.add(new QuackCountDecorator(new RubberDuck()));
        quackableList.add(new GooseAdapter(new Goose()));   // ガチョウの鳴き声は不要

        System.out.println("\nDuck Simulater");

        quackableList.stream().forEach(quacker -> quacker.quack());
        Z.p(QuackCountDecorator.getQuacks());
    }

}
