
import java.util.*;

class Question {
    String text;
    String option1;
    String option2;
    String option3;
    int correct;

    public Question(String text, String option1, String option2, String option3, int correct) {
        this.text = text;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.correct = correct;
    }

    public void ask() {
        System.out.println(text);
        System.out.println("1) " + option1);
        System.out.println("2) " + option2);
        System.out.println("3) " + option3);
        System.out.print("Ваш ответ (1-3): ");
    }

    public boolean check(int answer) {
        return answer == correct;
    }
}

public class Task5_Krivokviz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Question q1 = new Question("1. Столица Франции?", "Париж", "Берлин", "Мадрид", 1);
        Question q2 = new Question("2. Сколько будет 2+2?", "3", "4", "22", 2);
        Question q3 = new Question("3. Самая большая планета?", "Марс", "Юпитер", "Земля", 2);
        Question q4 = new Question("4. Кто написал 'Войну и мир'?", "Толстой", "Достоевский", "Пушкин", 1);
        Question q5 = new Question("5. Какой металл жидкий при комнатной температуре?", "Медь", "Ртуть", "Алюминий", 2);
        Question q6 = new Question("6. Цвет неба днём?", "Синий", "Зелёный", "Серый", 1);
        Question q7 = new Question("7. Как зовут создателя языка Java?", "Джеймс Гослинг", "Илон Маск", "Гуидо ван Россум", 1);
        Question q8 = new Question("8. Самая быстрая наземная животина?", "Гепард", "Слон", "Черепаха", 1);
        Question q9 = new Question("9. Что делает метод main в Java?", "Украшает код", "Запускает программу", "Ничего", 2);
        Question q10 = new Question("10. Что такое JVM?", "Виртуальная машина Java", "Велосипед", "Игра", 1);

        List<Question> questions = Arrays.asList(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10);

        int score = 0;

        for (Question q : questions) {
            q.ask();
            int ans;
            try {
                ans = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                ans = 0;
            }

            if (q.check(ans)) {
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
