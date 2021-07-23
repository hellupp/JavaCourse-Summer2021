import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
    public static int[] array = {10, 0, 34, -2, 444, 123, 90, 7, 0, -96, -33};

    public double average() {
        return IntStream.of(array).average().getAsDouble();
    }

    public Map<Integer, Integer> minValue() {
        Map<Integer, Integer> res = new HashMap<>();
        int minVal = IntStream.of(array)
                .reduce(Integer::min)
                .getAsInt();

        res.put(minVal, IntStream.of(array)
                .boxed()
                .collect(Collectors.toList())
                .indexOf(minVal));
        return res;
    }

    public int numberOfZeroElements() {
        return (int) IntStream.of(array).filter(x -> x == 0).count();
    }

    public int numberOfPositiveElements() {
        return (int) IntStream.of(array).filter(x -> x > 0).count();
    }

    public int[] multiplyEachElement(int num) {
        return IntStream.of(array).map(x -> x * num).toArray();
    }

    public static void main(String[] args) {
        StreamTask streamTask = new StreamTask();
        System.out.println("Given array = " + Arrays.toString(array));
        System.out.println("---------------------------------------");

        System.out.println("Average = " + streamTask.average());
        System.out.println("---------------------------------------");

        System.out.println("Min value and its index: " + streamTask.minValue());
        System.out.println("---------------------------------------");

        System.out.println("Number of zero elements = "
                + streamTask.numberOfZeroElements());
        System.out.println("---------------------------------------");

        System.out.println("Number of positive elements = "
                + streamTask.numberOfPositiveElements());
        System.out.println("---------------------------------------");

        System.out.println("Array of multiplied elements by some num = "
                + Arrays.toString(streamTask.multiplyEachElement(3)));
        System.out.println("---------------------------------------");

    }
}
