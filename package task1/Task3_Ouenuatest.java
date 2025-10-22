import java.util.Random;

public class Task3_Ouenuatest {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(100) + 1; // случайное число от 1 до 100

        String grade;
        if (score >= 90) {
            grade = "отлично";
        } else if (score >= 60) {
            grade = "хорошо";
        } else if (score >= 40) {
            grade = "удовлетворительно";
        } else {
            grade = "неудовлетворительно";
        }

        System.out.println("Баллы: " + score + " - оценка: " + grade);
    }
}
