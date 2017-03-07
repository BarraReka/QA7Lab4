package lab5.oop.exceptions;

import java.util.InputMismatchException;

/**
 * @author flo
 * @since 07/03/2017.
 */
public class ExceptionExample extends Exception {

    public void someMethod(int value) throws ExceptionExample {
        if(value == 13){
            throw new ExceptionExample();
        }

    }

    public static void main(String[] args) throws ExceptionExample{
        int[] sir = new int[3];

        int i = 0;
        boolean readMore = true;
        do {
            try {
                sir[i] = SkeletonJava.readIntConsole("Give me an int");
                ExceptionExample ex = new ExceptionExample();
                ex.someMethod(sir[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sirul e plin!");
                System.out.println(e);
                readMore = false;
            } catch (InputMismatchException e) {
                System.out.println("Doar intregi te rog!" + i);
            } finally {
                System.out.println("Oare sa mai citesc?" + readMore);
            }
        } while(readMore);
    }
}
