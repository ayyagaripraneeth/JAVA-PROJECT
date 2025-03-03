import java.util.Scanner;

public class aohsp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the radius of the hemisphere: ");
        double radius = scanner.nextDouble();

        
        double totalSurfaceArea = 3 * Math.PI * radius * radius;

        
        System.out.println("The total surface area of the hemisphere is: " + totalSurfaceArea);

        scanner.close();
    }
}