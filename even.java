public class First100EvenNumbers {
    public static void main(String[] args) {
        int count = 0;  // Counter to keep track of the number of even numbers printed
        int number = 2; // Starting from the first even number

        System.out.println("The first 100 even numbers are:");

        // Loop to print the first 100 even numbers
        while (count < 100) {
            System.out.println(number);
            number += 2; // Move to the next even number
            count++;
        }
    }
}
