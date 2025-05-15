import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Добавьте машины для гонки. Для выхода введите 'стоп'.");

        while (true) {
            System.out.print("Введите название машины: ");
            String name = scanner.nextLine();

            if (name.equals("стоп")){
                break;
            }

            int speed = -1;

            while (speed < 0 || speed > 350) {
                System.out.print("Введите скорость машины (0-350 км/ч): ");
                try {
                    speed = scanner.nextInt();

                    if (speed < 0 || speed > 350) {
                        System.out.println("Ошибка: скорость должна быть от 0 до 350!");
                    }

                } catch (Exception e) {
                    System.out.println("Ошибка: введите число!");
                    scanner.nextLine(); // Очистка буфера
                }
            }
            scanner.nextLine();

            Car car = new Car(speed, name);
            String result = race.getLeaderName(car);
            System.out.println("Текущий лидер: " + result);
        }

        System.out.println("Финальный результат: " + race.getLeaderName());
        scanner.close();

    }
}