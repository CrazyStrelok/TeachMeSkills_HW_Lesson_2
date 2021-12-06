import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ввести номер цвета радуги ");
        int number = scanner.nextInt();
        switch (number){
            case 1 :
                System.out.println(" Красный ");
                break;
            case 2 :
                System.out.println(" Оранжевый ");
                break;
            case 3 :
                System.out.println(" Жёлтый ");
                break;
            case 4 :
                System.out.println(" Зелёный ");
                break;
            case 5 :
                System.out.println(" Голубой ");
                break;
            case 6 :
                System.out.println(" Синий ");
                break;
            case 7 :
                System.out.println(" Фиолетовый ");
                break;
        }
    }
}
