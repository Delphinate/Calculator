import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner digit = new Scanner(System.in);
        System.out.println("Hello:)\nchoose a digit: +, -, *, /");
        String digit0 = digit.nextLine();
        System.out.println("Okay choose a two number");
        int digit1 = digit.nextInt();
        int digit2 = digit.nextInt();
        switch (digit0) {
            case "+" -> System.out.println(digit1 + digit2);
            case "-" -> System.out.println(digit1 - digit2);
            case "*" -> System.out.println(digit1 * digit2);
            case "/" -> System.out.println(digit1 / digit2);
            default -> System.out.println("This doesn't exist");
        }
    }
}

