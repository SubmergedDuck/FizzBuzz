public class Multiples {

    public static void main(String[] args) {

        int total = 0;
        for (int i = 1; i < 1000; i++) {

            boolean multiple3 = i % 3 == 0;
            boolean multiple5 = i % 5 == 0;

            if (multiple3 || multiple5) {
                total += 1;
            }
        }

        System.out.println(total);
    }
}
