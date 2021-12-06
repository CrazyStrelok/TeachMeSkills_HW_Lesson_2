import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ввести любое целое положительное число  ");
        int number = scanner.nextInt();
        int sum = 0;
        for(int i =1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
