import java.util.Scanner;

public class Assignment1Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("The number is zero.");
        } else {
            String sign = n > 0 ? "positive" : "negative";
            String type = n % 2 == 0 ? "even" : "odd";

            System.out.println("The number is " + sign + " and " + type + ".");
        }

    }
}