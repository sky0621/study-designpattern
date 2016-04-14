package dp.ch07_adaptor;

/**
 *  2016/03/27.
 */
public class Adaptee implements AdapteeIF {
    @Override
    public String doAnything() {
        return "Adaptee!";
    }
}
