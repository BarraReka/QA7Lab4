package lab5.oop.exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author flo
 * @since 07/03/2017.
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Ana");
        l.add("5");
        for(String o : l) {
            System.out.println(o.toString());
        }
        System.out.println(l.size());
        for(int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        l.add("6");
        System.out.println(l.size());
        l.remove("6");
        System.out.println(l.size());
    }
}
