import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        System.out.println("Задание №3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное:");
        System.out.println("1. Кошка");
        System.out.println("2. Собака");
// Добавляем еще животные в список
//...
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Кошка издает звук мяу-мяу");
                break;
            case 2:
                System.out.println("Собака издает звук гав-гав-гав");
                break;
            // Добавляем еще кейсы для других животных
            //...
            default:
                System.out.println("Выберите животное из списка");
                break;
        }
        System.out.println();

    }
}
