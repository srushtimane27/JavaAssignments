public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123;
        int rev = 0;
        while(num > 0){
            int temp = num%10;
            rev = rev*10+temp;
            num = num/10;
        }
        System.out.println(rev);

    }

}
