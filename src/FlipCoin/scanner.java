package FlipCoin;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        int head=0;
        int tail=0;
        int count=1;
        double random=0.0;

        System.out.println("Please enter the number: ");
        scanner n = new Scanner(System.in);
        int flips = n.nextInt();

        while(count <= flips){

            random=Math.random();
            System.out.println(count+ "+ random");

            if (random<0.5){
                head++;
                System.out.println(" head ");
            }else{
                tail++;
                System.out.println(" tails ");
            }
            count++;
        }
        System.out.println();
        System.out.println("Number of heads : " +head);
        System.out.println("Number of tails : " +tail);

        double headpercent = (double)head/flips*100;
        double tailpercent = (double)tail/flips*100;

        System.out.println("Percentage of heads : " +headpercent);
        System.out.println("Percentage of tails : " +tailpercent);

    }

    private int nextInt() {


    }
}
