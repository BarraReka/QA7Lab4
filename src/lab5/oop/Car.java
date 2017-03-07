package lab5.oop;

/**
 * @author flo
 * @since 07/03/2017.
 */

public class Car extends Vehicle {

    private int speed = 0;
    private String name;

    @Override
    public void moves() {
        System.out.println("Car moves with speed " + speed);
        super.stops();
    }

    @Override
    public void stops() {
        System.out.println("Car stops! had speed " + speed);
    }

    @Override
    public void accelerate() {
        speed++;
    }

    public static void main(String[] args) {
        Car dacia = new Car();
        dacia.moves();
        dacia.accelerate();
        dacia.stops();

        Car tanc = new Car();
        tanc.stops();
    }
}
