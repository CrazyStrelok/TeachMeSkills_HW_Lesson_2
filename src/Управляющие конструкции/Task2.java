import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи номер месяца");
        int month = scanner.nextInt();
        if(month > 11 || month < 3){
            System.out.println(" Зима ");
        }
        else if(month > 2 || month < 6){
            System.out.println(" Весна ");
        }
        else if (month > 5 || month < 9){
            System.out.println(" Лето ");
        }
        else if (month > 8 || month < 12  ){
            System.out.println(" Осень ");
        }
    }
}
