package lab5.oop;

/**
 * @author flo
 * @since 07/03/2017.
 */
public class Vehicle {

    public void moves() {
        System.out.println("Vehicle moves!");
    }

    protected void stops() {
        System.out.println("Vechicle stops!");
    }

    public static void main(String[] args) {
        Car dacia = new Car();

        dacia.moves();
    }
}
