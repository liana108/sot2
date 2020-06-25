public class Main {
    public static void main(String[] args) {
        long balance = 1200;
        long bonus = 0;
        if (balance > 1000)
            bonus = balance / 100 * 1;
        System.out.println(bonus);
    }
}