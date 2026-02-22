/**
 * Represents a single quiz question.
 * Stores question text, 4 options, and the correct answer.
 */
public class Question {

    private String questionText;
    private String[] options;      // 4 options: A, B, C, D
    private char correctAnswer;    // 'A', 'B', 'C', or 'D'

    // Constructor
    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText  = questionText;
        this.options       = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    // Getters
    public String   getQuestionText()  { return questionText;  }
    public String[] getOptions()       { return options;        }
    public char     getCorrectAnswer() { return correctAnswer;  }

    // Check if the user's answer is correct
    public boolean isCorrect(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}
