package navjot.sgpaCalculator;

import navjot.sgpaCalculator.subject.SubjectGradeList;

/**
 * Provides {@link #compute(SubjectGradeList)} method to compute the SGPA of list of subjects with their credits and
 * grades stored in {@link SubjectGradeList}.
 */
public class CalculateSGPA {
    /**
     * method to compute the SGPA of list of subjects with their credits and
     * grades stored in {@link SubjectGradeList}.
     *
     * @param subjectGradeList list that holds credits and grades of the subjects
     * @return the SGPA value of the list of given subjects
     */
    public static double compute(SubjectGradeList subjectGradeList) {
        if (subjectGradeList.size() == 0)
            return 0;

        double sum = 0;
        int credits = 0;

        for (int i = 0; i < subjectGradeList.size(); i++) {
            sum += subjectGradeList.getScoreAt(i) * subjectGradeList.getCreditsAt(i);
            credits += subjectGradeList.getCreditsAt(i);
        }

        return sum / credits;
    }
}
