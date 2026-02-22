import java.util.ArrayList;
import java.util.Scanner;

/**
 * QuizApp.java
 * Handles all quiz logic: loading questions, displaying them,
 * accepting answers, tracking score, and showing results.
 */
public class QuizApp {

    private ArrayList<Question> questions = new ArrayList<>();
    private int score = 0;
    private Scanner scanner = new Scanner(System.in);

    // ── Load All Questions ────────────────────────────────────────────────────

    private void loadQuestions() {
        questions.add(new Question(
            "What does JVM stand for?",
            new String[]{"A) Java Very Much", "B) Java Virtual Machine", "C) Java Visual Manager", "D) Just a Virtual Module"},
            'B'
        ));

        questions.add(new Question(
            "Which keyword is used to create an object in Java?",
            new String[]{"A) create", "B) object", "C) new", "D) make"},
            'C'
        ));

        questions.add(new Question(
            "What is the default value of an int in Java?",
            new String[]{"A) null", "B) 1", "C) -1", "D) 0"},
            'D'
        ));

        questions.add(new Question(
            "Which of these is NOT a primitive type in Java?",
            new String[]{"A) int", "B) boolean", "C) String", "D) char"},
            'C'
        ));

        questions.add(new Question(
            "What does OOP stand for?",
            new String[]{"A) Object Oriented Programming", "B) Only One Program", "C) Object Order Processing", "D) Open Oriented Platform"},
            'A'
        ));

        questions.add(new Question(
            "Which method is the entry point of a Java program?",
            new String[]{"A) start()", "B) run()", "C) init()", "D) main()"},
            'D'
        ));

        questions.add(new Question(
            "Which collection allows duplicate elements?",
            new String[]{"A) HashSet", "B) TreeSet", "C) ArrayList", "D) LinkedHashSet"},
            'C'
        ));

        questions.add(new Question(
            "What symbol is used for single-line comments in Java?",
            new String[]{"A) ##", "B) //", "C) /* */", "D) --"},
            'B'
        ));

        questions.add(new Question(
            "Which keyword prevents a variable from being changed?",
            new String[]{"A) static", "B) private", "C) const", "D) final"},
            'D'
        ));

        questions.add(new Question(
            "What is the size of an int in Java?",
            new String[]{"A) 8 bytes", "B) 2 bytes", "C) 4 bytes", "D) 16 bytes"},
            'C'
        ));
    }

    // ── Display a Single Question ─────────────────────────────────────────────

    private void displayQuestion(Question q, int number) {
        System.out.println("\n--------------------------------------------------");
        System.out.println("Q" + number + ": " + q.getQuestionText());
        System.out.println("--------------------------------------------------");
        for (String option : q.getOptions()) {
            System.out.println("   " + option);
        }
        System.out.println("--------------------------------------------------");
    }

    // ── Read and Validate User Input ──────────────────────────────────────────

    private char getUserAnswer() {
        while (true) {
            System.out.print("Your answer (A/B/C/D): ");
            String input = scanner.nextLine().trim();

            // Check if input is empty or not a valid letter
            if (input.isEmpty()) {
                System.out.println("  Please enter A, B, C, or D.");
                continue;
            }

            char choice = Character.toUpperCase(input.charAt(0));
            if (choice == 'A' || choice == 'B' || choice == 'C' || choice == 'D') {
                return choice;
            }

            System.out.println("  Invalid input! Please enter A, B, C, or D.");
        }
    }

    // ── Show Final Results ────────────────────────────────────────────────────

    private void showResults() {
        int total      = questions.size();
        double percent = ((double) score / total) * 100;

        System.out.println("\n==================================================");
        System.out.println("                   QUIZ RESULTS                  ");
        System.out.println("==================================================");
        System.out.println("  Total Questions : " + total);
        System.out.println("  Correct Answers : " + score);
        System.out.println("  Wrong Answers   : " + (total - score));
        System.out.printf ("  Your Score      : %.0f%%%n", percent);
        System.out.println("--------------------------------------------------");

        // Performance message
        if      (percent == 100) System.out.println("  PERFECT SCORE! Outstanding!");
        else if (percent >= 80)  System.out.println("  Excellent! Keep it up!");
        else if (percent >= 60)  System.out.println("  Good job! Keep practicing!");
        else if (percent >= 40)  System.out.println("  Fair attempt. Review and retry!");
        else                     System.out.println("  Don't give up! Try again!");

        System.out.println("==================================================");
    }

    // ── Main Quiz Flow ────────────────────────────────────────────────────────

    public void startQuiz() {
        loadQuestions();

        System.out.println("==================================================");
        System.out.println("        WELCOME TO THE JAVA QUIZ APP!             ");
        System.out.println("==================================================");
        System.out.println("  Total Questions : " + questions.size());
        System.out.println("  Enter A, B, C or D for each question.");
        System.out.println("==================================================");
        System.out.print("\nPress ENTER to start...");
        scanner.nextLine();

        // Loop through each question
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            displayQuestion(q, i + 1);
            char userAnswer = getUserAnswer();

            if (q.isCorrect(userAnswer)) {
                System.out.println("  ✓ Correct!\n");
                score++;
            } else {
                System.out.println("  ✗ Wrong! Correct answer was: " + q.getCorrectAnswer() + "\n");
            }
        }

        showResults();

        // Ask to play again
        System.out.print("\nWould you like to play again? (y/n): ");
        String again = scanner.nextLine().trim().toLowerCase();
        if (again.equals("y") || again.equals("yes")) {
            score = 0;           // reset score
            questions.clear();   // clear questions
            startQuiz();         // restart
        } else {
            System.out.println("\nThanks for playing! Goodbye!\n");
            scanner.close();
        }
    }
}
