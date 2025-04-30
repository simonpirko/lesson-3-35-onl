public class Main {
    public static void main(String[] args) {
        long number = 1230467089;

        System.out.print("reversed number is: ");

        do {
            System.out.print(number % 10);
            number /= 10;
        } while (number / 10 != 0);

        System.out.println(number);
    }
}