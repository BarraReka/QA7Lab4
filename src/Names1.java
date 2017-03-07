import lab5.oop.exceptions.SkeletonJava;

/**
 * @author flo
 * @since 28/02/2017.
 */
public class Names1 {

    public static void main(String[] args) {

        int n = SkeletonJava.readIntConsole("Cate persoane sa fie?");

        Person[] persoane = new Person[n];

        for(int i=0; i < n; i++) {
            String name = SkeletonJava.readStringConsole("Nume?");
            String prenume = SkeletonJava.readStringConsole("Prenume?");
            int ziDeNaster = SkeletonJava.readIntConsole("Ziua de nastere?Luni=0");
            Person r = new Person(prenume, name, ziDeNaster);
            persoane[i] = r;
            SkeletonJava.printConsole(Person.persoaneCreate);
        }

        for(int i=0; i< n;i++) {
            // Popescu+Victoria 8
            // Maria+Vasile 7
            Person perso = persoane[i];
            SkeletonJava.printConsole(perso.getId());
            SkeletonJava.printConsole(perso.getName() + "+" + perso.getPrenume() + perso.getName().length() + "nas" + perso.getZiNastere());
            SkeletonJava.printConsole(Person.persoaneCreate);
        }
    }
}
