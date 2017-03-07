import lab5.oop.exceptions.SkeletonJava;

/**
 * @author flo
 * @since 28/02/2017.
 */
public class Victoria1 {

    public static void main(String[] args) {

        String nume;
        do {
            nume = SkeletonJava.readStringConsole("Nume?");
        } while(!"Victoria".equals(nume));

    }
}
