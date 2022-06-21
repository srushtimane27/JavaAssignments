import static java.lang.Math.sqrt;

public class LineComparisionUC1 {
    public static void main(String[] args) {
        int x1 = 10;
        int y1 = 4;
        int x2 = 20;
        int y2 = 8;

        int length = (int) sqrt((x2 - x1)^2 +(y2-y1)^2);

        System.out.println("length is " +length);

    }
}
