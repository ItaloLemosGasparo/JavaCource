import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        AddQuestions(service);

        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Quiz! Digite a opção correta para cada pergunta.");

        for (Question question : service.questions) {
            if (!question.isDone()) {
                System.out.println(question.getId() + ": " + question.getQuestion());
                System.out.println("1) " + question.getOpt1());
                System.out.println("2) " + question.getOpt2());
                System.out.println("3) " + question.getOpt3());
                System.out.println("4) " + question.getOpt4());

                System.out.print("Sua resposta (digite o número da opção): ");
                int userAnswer = sc.nextInt();
                service.checkAnswer(question, userAnswer);
            }
        }

        service.showResults();
        sc.close();
    }

    public static void AddQuestions(QuestionService _service) {
        _service.questions.add(new Question(1,
                "Quem nasceu primeiro, o ovo ou a galinha?",
                "O ovo",
                "A galinha",
                "Não sei",
                "Todas as respostas",
                "Não sei")
        );

        _service.questions.add(new Question(2,
                "Por que a galinha atravessou a rua?",
                "Para chegar ao outro lado",
                "Para ser radical",
                "Para beber água",
                "Todas as respostas",
                "Para chegar ao outro lado")
        );
    }
}
