package dp.ch11_compound;

/**
 * Created by SS on 2016/05/29.
 */
public class CountQuackFactory extends AbstractQuackFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackCountDecorator(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCountDecorator(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCountDecorator(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCountDecorator(new RubberDuck());
    }

    @Override
    public Quackable createGoose() {
        return null;
    }

}
