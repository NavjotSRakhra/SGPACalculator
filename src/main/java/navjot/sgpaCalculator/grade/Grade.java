package navjot.sgpaCalculator.grade;

/**
 * Pre-defined Grades with their score and display strings
 */
public enum Grade {
    A_PLUS(10, "A+"),
    A(9, "A"),
    B_PLUS(8, "B+"),
    B(7, "B"),
    C_PLUS(6, "C+"),
    C(5, "C"),
    D(4, "D"),
    E(0, "E"),
    F(0, "F"),
    I(0, "I"),
    X(0, "X");

    private final int score;
    private final String appearAsString;

    Grade(int score, String appearAsString) {
        this.score = score;
        this.appearAsString = appearAsString;
    }

    public int getScore() {
        return score;
    }

    public String getUserFriendlyString() {
        return appearAsString;
    }
}
