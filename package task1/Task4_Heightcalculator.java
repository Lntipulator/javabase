import java.util.Scanner;

public class Task4_Heightcalculator {
    public static void main(String[] args) {

        double v0 = 20.0;     // начальная скорость, м/с
        final double g = 9.8; // ускорение свободного падения
        double t;             

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите время полёта (в секундах): ");
        t = sc.nextDouble();

        double h = v0 * t - 0.5 * g * t * t;
        if (h < 0) h = 0; // тело не может быть ниже земли

        System.out.println("\n=== Результаты расчёта ===");
        System.out.println("Начальная скорость: " + v0 + " м/с");
        System.out.println("Время полёта: " + t + " с");
        System.out.println("Ускорение свободного падения: " + g + " м/с²");
        System.out.printf("Высота тела: %.2f метров\n", h);

        sc.close();
    }
}

