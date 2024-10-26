import java.util.ArrayList;
import java.util.List;

public class QuestionService {
    public List<Question> questions = new ArrayList<>();
    private int score = 0;

    public void DisplayQuestions() {
        questions.stream().filter(question -> !question.isDone()).forEach(question ->
                System.out.println(question.getId() + ": " + question.getQuestion())
        );
    }

    public void checkAnswer(Question question, int userAnswer) {
        String selectedAnswer = switch (userAnswer) {
            case 1 -> question.getOpt1();
            case 2 -> question.getOpt2();
            case 3 -> question.getOpt3();
            case 4 -> question.getOpt4();
            default -> null;
        };

        if (selectedAnswer != null && selectedAnswer.equals(question.getAnswer())) {
            System.out.println("Correto!\n");
            score++;
        } else {
            System.out.println("Errado! A resposta correta era: " + question.getAnswer() + "\n");
        }
        question.setDone(true);
    }

    public void showResults() {
        System.out.println("Quiz finalizado! Você acertou " + score + " de " + questions.size() + " perguntas.");
    }
}
