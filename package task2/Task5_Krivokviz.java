
import java.util.*;

public class Task5_Krivokviz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] q = {
            "1. Столица Франции?",
            "2. Сколько будет 2+2?",
            "3. Самая большая планета?",
            "4. Кто написал 'Войну и мир'?",
            "5. Какой металл жидкий при комнатной температуре?",
            "6. Цвет неба днём?",
            "7. Как зовут создателя языка Java?",
            "8. Самая быстрая наземная животина?",
            "9. Что делает метод main в Java?",
            "10. Что такое JVM?"
        };

        String[][] a = {
            {"1) Париж", "2) Берлин", "3) Мадрид"},
            {"1) 3", "2) 4", "3) 22"},
            {"1) Марс", "2) Юпитер", "3) Земля"},
            {"1) Толстой", "2) Достоевский", "3) Пушкин"},
            {"1) Медь", "2) Ртуть", "3) Алюминий"},
            {"1) Синий", "2) Зелёный", "3) Серый"},
            {"1) Джеймс Гослинг", "2) Илон Маск", "3) Гуидо ван Россум"},
            {"1) Гепард", "2) Слон", "3) Черепаха"},
            {"1) Украшает код", "2) Запускает программу", "3) Ничего"},
            {"1) Виртуальная машина Java", "2) Велосипед", "3) Игра"}
        };

        int[] correct = {1, 2, 2, 1, 2, 1, 1, 1, 2, 1}; // правильные варианты

        int score = 0;

        for (int i = 0; i < q.length; i++) {
            System.out.println(q[i]);
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
            System.out.print("Ваш ответ (1-3): ");
            int ans;
            try {
                ans = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                ans = 0;
            }

            if (ans == correct[i]) {
                System.out.println("✅ Правильно!\n");
                score++;
            } else {
                System.out.println("❌ Неправильно!\n");
            }
        }

        System.out.println("Ваш результат: " + score + " из 10");
        if (score < 5) {
            System.out.println("Хмм... пора читать Википедию 🤓");
        } else if (score < 8) {
            System.out.println("Неплохо! 👍");
        } else {
            System.out.println("Ты гений! 💥 КривоКвиз покорён!");
        }

        sc.close();
    }
}
