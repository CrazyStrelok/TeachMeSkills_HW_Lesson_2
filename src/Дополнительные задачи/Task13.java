import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите сумму ");
        float sum = scanner.nextFloat();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" Введите количевство месяцев ");
        int a = scanner1.nextInt();
        for (int i = 1;i <= a ; i++);{
        sum= (float) (sum + sum * 0.07);
            System.out.println(sum);
        }
    }
}

