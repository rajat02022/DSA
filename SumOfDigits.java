import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int firstDigit, int secondDigit){
        return firstDigit + secondDigit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumOfDigits(a,b));
    }
}
