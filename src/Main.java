public class Main {
    public static void main(String[] args) {
        long number = 1230467089;

        do {
            System.out.print(number % 10);
            number /= 10;
        } while (number / 10 != 0);

        System.out.println(number);
        System.out.println(number);

        //git init
        //git add .
        //git commit -m "first commit"
        //git add remote origin https://github.com/Vladimir-Krylov/Java-Basics.git
        //git push origin main

        // test
    }
}