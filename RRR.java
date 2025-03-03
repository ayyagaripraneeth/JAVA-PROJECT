import java.util.Scanner;

public class RRR{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print hashtags
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}