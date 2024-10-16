import java.util.Random;
/**
 * a Driver class to initialise, populate , and perform actions within the driver clas
 */

public class Driver {
    public static void main(String[] args) {
         final int VALUES = 10;

        Stats stats = new Stats(VALUES);
        Random random = new Random();

        // generates a random list of values that cannot exceed 100, the list length is determined by the constant VALUES
        for (int i = 0; i < VALUES; i++) {
            stats.addValue(random.nextInt(100));
        }

        System.out.println("Numbers stored : ");
        System.out.println(stats);
        System.out.println("Average = " + stats.getAverage());
        System.out.println("Count = " + stats.getCount());
        System.out.println("Total = " + stats.getTotal());
        System.out.println("Minimum value = " + stats.getMin());
        System.out.println("Maximum value = " + stats.getMax());
    }
}