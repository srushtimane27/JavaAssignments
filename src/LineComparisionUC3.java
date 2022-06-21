import static java.lang.Math.sqrt;
private static void compare(){

public class LineComparisionUC3 {
    public static void main(String[] args) {
        int x1 = 10;
        int y1 = 4;
        int x2 = 20;
        int y2 = 8;
        int a1 = 10;
        int b1 = 20;
        int a2 = 5;
        int b2 = 10;


        int length1 = (int) sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        int length2 = (int) sqrt((a2 - a1) ^ 2 + (b2 - b1) ^ 2);
        compare(length1 && length2)

        if (length1<length2) {
            System.out.println("length2 is greater than length1");
        } else (length1>length2) {
            System.out.println("length1 is greater than length 2");
        }
            
        


    }

    private static void compare(boolean b) {
    }
}
