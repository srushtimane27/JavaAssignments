import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n,p,result=1;
        System.out.println("Enter Number ");
        n = r.nextInt();
        System.out.println("Enter Power 2");
        p = r.nextInt();

        for(int i=1; i<=31; i++){
            result=n*result;
        }
        System.out.println("Power of 2 is " +result);
    }
}
