public class PrintOddNumbers {
    public static void main(String[] args) {
        // Counter for odd numbers
        int count = 0;
        
        // Loop to find and print the first 100 odd numbers
        for (int i = 1; count < 100; i += 2) {
            System.out.print(i + " ");
            count++;
        }
    }
}

