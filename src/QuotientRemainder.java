import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Quotient = a / b;
        int Remainder = a % b;

        System.out.println("Quotient is: " +Quotient);
        System.out.println("Remainder is: " +Remainder);

    }
}
