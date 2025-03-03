import java.util.Scanner;

public class vocone{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = scanner.nextDouble();

                double volume = (1.0 / 3) * Math.PI * radius * radius * height;

               System.out.println("The volume of the cone is: " + volume);

        scanner.close();
    }
}