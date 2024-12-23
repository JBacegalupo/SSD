import java.util.Arrays;

/**
 * a List of values that are generated by the driver class
 * this class carries the ability to perform analysis on this set of numbers
 */
public class Stats {

    int[] numbers;
    int count;


    public void addValue(int value) {
        numbers[count] = value;
        count++;
    }

    public int getCount() {
        return numbers.length;
    }

    /**
     * identifies the max value for a list of numbers
     *
     * @return the max value for a list of numbers
     */
    public int getMax() {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
    /**
     * produces the minimum value for a list of numbers
     * @return the minimum value for a list of numbers
     */
    public int getMin() {

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
    /**
     * produces the total value for a list of numbers
     * @return the total value for a list of numbers
     */
    public int getTotal() {

        int total = 0;

        // total all values within the array
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        return total;
    }
    /**
     * produces the average value for a list of numbers
     * @return the average value for a list of numbers
     */
    public double getAverage() {

        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        double average = total/(double)numbers.length;

        return average;

    }

    @Override
    public String toString() {
        return Arrays.toString(numbers);
    }

    /**
     * Constructor
     *
     * @param capacity accepts an integer value from Driver to initialise a blank list with the specified length
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
    }
}