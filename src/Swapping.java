import java.util.Scanner;
public class Swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }

}
