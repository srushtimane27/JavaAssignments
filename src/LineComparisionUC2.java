import static java.lang.Math.sqrt;

public class LineComparisionUC2 {
    public static void main(String[] args) {

        int x1 = 10;
        int y1 = 4;
        int x2 = 20;
        int y2 = 8;
        int a1 = 10;
        int b1 = 20;
        int a2 = 5;
        int b2 = 10;


        int length1 = (int) sqrt((x2 - x1)^2 +(y2-y1)^2);
        int length2 = (int) sqrt((a2 - a1)^2 +(b2-b1)^2);

        if(length1 == length2){
            System.out.println("Two lines are equal");
        }else{
            System.out.println("Two lines are not equal");
        }





    }
}