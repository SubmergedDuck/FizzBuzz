public class Reduce {

    public static void main(String[] args) {

        int n = 100;
        int c = 0;

        while(n != 0) {

            if(n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            c++;
        }
        System.out.println(c);
    }
}
