
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i != n) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.print(n * (n + 1) / 2);

    }
}