package navjot.sgpaCalculator.subject;

import navjot.sgpaCalculator.grade.Grade;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * This class can be used to store a list of subject {@link Grade} along with the credits they weigh
 *
 * @author Navjot Singh Rakhra
 * @version 1.0
 */
public class SubjectGradeList implements Serializable {
    private final List<Grade> subjectGradeList;
    private final List<Integer> subjectCredits;

    public SubjectGradeList() {
        subjectGradeList = new ArrayList<>();
        subjectCredits = new ArrayList<>();
    }

    /**
     * Method used for testing.
     *
     * @return internally stored list of credits.
     */
    List<Integer> getSubjectCreditList() {
        return subjectCredits;
    }

    /**
     * Method used for testing
     *
     * @return internally stored list of {@link Grade}
     */
    List<Grade> getSubjectGradeList() {
        return subjectGradeList;
    }

    /**
     * This method adds grade and corresponding credits to this list
     *
     * @param grade   This parameter accepts the {@link Grade} of this subject
     * @param credits This parameter accepts credits of this subject
     */
    public void add(Grade grade, int credits) {
        subjectGradeList.add(grade);
        subjectCredits.add(credits);
    }

    /**
     * Removes the subject {@link Grade} and corresponding credits from the list
     *
     * @param i index of the element to be removed
     */
    public void removeAt(int i) {
        subjectCredits.remove(i);
        subjectGradeList.remove(i);
    }

    /**
     * Updates the {@link Grade} and credit value of the subject at index i in the list
     *
     * @param i          index of the subject to be updated
     * @param newGrade   new {@link Grade} value of the subject
     * @param newCredits new credit value of the subject
     */
    public void set(int i, Grade newGrade, int newCredits) {
        subjectCredits.set(i, newCredits);
        subjectGradeList.set(i, newGrade);
    }

    /**
     * returns the pre-defined score value of the Grade, internally calls {@link Grade#getScore()}
     *
     * @param index index of the subject whose score is to be returned
     * @return the pre-defined score value of the Grade at the given index
     */
    public int getScoreAt(int index) {
        return subjectGradeList.get(index).getScore();
    }

    /**
     * This methods returns the string equivalent of {@link Grade}
     *
     * @param i index of the subject whose grade string has to be returned
     * @return the string equivalent of {@link Grade}
     */
    public String getDisplayStringAt(int i) {
        return subjectGradeList.get(i).getUserFriendlyString();
    }

    /**
     * Gets the number of elements in this list
     *
     * @return returns the size of this list
     */
    public int size() {
        return subjectGradeList.size();
    }

    /**
     * returns the credits of subject at the given index
     *
     * @param i index of the subject whose credits value is to be returned
     * @return the value of credits of the subjects at the given index
     */
    public int getCreditsAt(int i) {
        return subjectCredits.get(i);
    }

    /**
     * returns the {@link Grade} enum value set at index i
     *
     * @param i index of the subject whose grade value is to be returned
     * @return the {@link Grade} enum value set at index i
     */
    public Grade getGradeAt(int i) {
        return subjectGradeList.get(i);
    }
}
