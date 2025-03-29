import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /,%");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 +num2;
                break;
            case '-':
                result = num1 - num2 ;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error:Any one of the number should not be zero");
                    return;
                }
                break;
	        case '%':
		        if (num2>0) {
		            result = num1 % num2;
		        } else {
		             System.out.println("Denominator i.e numb2 should not be zero");
		             return;
		        }
		        break;	
	        default:
                  System.out.println("Invalid operation.");
                  return;
        }

        System.out.println("The result is: " + result);
    }
}
