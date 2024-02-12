public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "what is your favourite language", "java", "Cpp", "python", "c#", "java");
        questions[1] = new Question(2, "which of this is primitive type", "int", "Double", "String", "Integer", "int");
        questions[2] = new Question(3, "Final keyword can be used with", "object", "variable", "java", "casting",
                "variable");
        questions[3] = new Question(4, "Default variables can be accessible in", "In Same package",
                "different package subclass", "different package other class", "Only in same class", "In Same package");
        questions[4] = new Question(5, "hich of the following is not a access modifier", "default", "private", "public",
                "import", "import");
    }

    public void display() {

        for (Question q : questions) {
            System.out.println(q);

        }

    }
}
