import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число ");
        int number = scanner.nextInt();
        if (number % 2 == 0 )
        System.out.println(" Число чётное  ");
        else
            System.out.println(" Число нечётное ");

    }
}
