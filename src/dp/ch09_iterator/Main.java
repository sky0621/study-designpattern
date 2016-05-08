package dp.ch09_iterator;

import dp.Z;

import java.util.ArrayList;
import java.util.List;

/**
 * 2016/05/08.
 */
public class Main {
    public static void main(String... args) {
        Iterator iteA = new IteratorImplA(createLst());
        while(iteA.hasNext()){
            String item = (String)iteA.next();
            Z.p(item);
        }
        Iterator iteB = new IteratorImplB(createArray());
        while(iteB.hasNext()){
            String item = (String)iteB.next();
            Z.p(item);
        }
    }

    private static List<String> createLst() {
        List<String> lst = new ArrayList<String>();
        lst.add("Java");
        lst.add("Scala");
        lst.add("Go");
        lst.add("C");
        lst.add("C++");
        lst.add("C#");
        return lst;
    }

    private static String[] createArray() {
        String[] ary = new String[]{"JavaScript", "Ruby", "PHP", "Python", "Perl"};
        return ary;
    }
}
