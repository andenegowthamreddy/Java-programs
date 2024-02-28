import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));
    }
}