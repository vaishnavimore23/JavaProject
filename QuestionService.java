import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "what is your favourite language", "java", "Cpp", "python", "c#", "java");
        questions[1] = new Question(2, "which of this is primitive type", "int", "Double", "String", "Integer", "int");
        questions[2] = new Question(3, "Final keyword can be used with", "object", "variable", "java", "casting",
                "variable");
        questions[3] = new Question(4, "Default variables can be accessible in", "In Same package",
                "different package subclass", "different package other class", "Only in same class", "In Same package");
        questions[4] = new Question(5, "Which of the following is not a access modifier", "default", "private",
                "public",
                "import", "import");
    }

    public void playQuiz() {
        int i = 0;

        for (Question q : questions) {

            System.out.println("Question No." + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                selection[i] = scanner.nextLine();
                System.err.println("your entered answer is  " + selection[i]);
                // Process the input line
            } else {
                // Handle the case where there is no input available
                System.out.println("No input available");
            }
            i++;
            System.out.println(i);

        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question question = questions[i];
            String actualAnswer = question.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equalsIgnoreCase(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is : " + score);
    }
}
