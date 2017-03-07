package lab5.oop;

/**
 * @author flo
 * @since 07/03/2017.
 */

public class Car extends Vehicle {


    private String name;

    @Override
    public void moves() {
        System.out.println("Car moves");
        super.stops();
    }

    @Override
    public void stops() {
        System.out.println("Car stops!");
    }

    public static void main(String[] args) {
        Car dacia = new Car();

        dacia.moves();
    }
}
