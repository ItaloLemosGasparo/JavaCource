import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        AddQuestions(service);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Quiz! Write the right answer for each question.");

        for (Question question : service.questions) {
            if (!question.isDone()) {
                System.out.println(question.getId() + ": " + question.getQuestion());
                System.out.println("1) " + question.getOpt1());
                System.out.println("2) " + question.getOpt2());
                System.out.println("3) " + question.getOpt3());
                System.out.println("4) " + question.getOpt4());

                System.out.print("Your answer (enter option number): ");
                int userAnswer = sc.nextInt();
                service.checkAnswer(question, userAnswer);
            }
        }

        service.showResults();
        sc.close();
    }

    public static void AddQuestions(QuestionService _service) {
        _service.questions.add(new Question(1,
                "Which came first, the chicken or the egg?",
                "The egg",
                "The chicken",
                "I don't know",
                "All answers",
                "I don't know")
        );

        _service.questions.add(new Question(2,
                "Why did the chicken cross the road?",
                "To get to the other side",
                "To be radical",
                "To drink water",
                "All answers",
                "To get to the other side")
        );
    }
}
