import java.util.*;
public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coupon");
        String s = sc.nextLine();

        if (s.matches("[0-9]")) {
            System.out.println(s + " " + "is a invalid input");
            return;
        }
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch > '0' && ch <= '9') {
                out = out + ch;
            }
        }
        int n = Integer.parseInt(out);
        int sum = 0, prod = 1;
        int temp = n;
        do {
            int rem = temp % 10;
            sum = sum + rem;
            prod = prod * rem;
            temp = temp / 10;
        } while (temp != 0);
        if (sum + prod == n) {
            System.out.println(n + " " + "is a lucky coupon");
            return;
        } else {
            System.out.println(n + " " + "is not a lucky coupon");
        }


    }
}