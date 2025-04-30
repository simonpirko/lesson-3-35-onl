public class Main {
    public static void main(String[] args) {
        long number1 = 1230467089;

        System.out.print("reversed number is: ");

        do {
            System.out.print(number1 % 10);
            number1 /= 10;
        } while (number1 / 10 != 0);

        System.out.println(number1);
    }
}