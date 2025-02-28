import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter operator (+, -, *, /, ^, sqrt): ");
        String operator = input.next();

        if (!(operator.equals("+") || operator.equals("-") || operator.equals("*") ||
                operator.equals("/") || operator.equals("^") || operator.equals("sqrt"))) {
            System.out.println("Error: Invalid operator.");
            return;
        }

        if (operator.equals("sqrt")) {
            System.out.print("Enter the number: ");
            double number = input.nextDouble();
            if (number < 0) {
                System.out.println("Error: Cannot compute negative number");
            }
            else {
                double result = Math.sqrt(number);
                if (result == (int) result) {
                    System.out.println("The square root of " + (int) number + " is " + (int) result);
                }
                else if (result == (double) result && number == (int) number) {
                    System.out.println("The square root of " + (int) number + " is " + result);
                }
                else {
                    System.out.println("The square root of " + number + " is " + result);
                }
            }
        }
        else {
            System.out.print("Enter the first number: ");
            double a = input.nextDouble();
            System.out.print("Enter the second number: ");
            double b = input.nextDouble();

            double result = 0.0;
            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                        return;
                    }
                    break;
                case "^":
                    result = Math.pow(a, b);
                    break;
            }

            if (result == (int) result) {
                System.out.println("The result is " + (int) result);
            } else {
                System.out.println("The result is " +  result);
            }
        }
    }
}