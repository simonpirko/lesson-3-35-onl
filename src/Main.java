public class Main {
    public static void main(String[] args) {
        long num = 1230467089;

        System.out.print("reversed number is: ");

        do {
            System.out.print(num % 10);
            num /= 10;
        } while (num / 10 != 0);

        System.out.println(num);
    }
}