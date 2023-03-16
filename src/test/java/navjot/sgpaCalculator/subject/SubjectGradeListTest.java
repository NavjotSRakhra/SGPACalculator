package navjot.sgpaCalculator.subject;

import junit.framework.TestCase;
import navjot.sgpaCalculator.CalculateSGPA;
import navjot.sgpaCalculator.grade.Grade;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static navjot.sgpaCalculator.grade.Grade.*;

public class SubjectGradeListTest extends TestCase {

    private List<Grade> initializeList() {
        return new ArrayList<>(Arrays.asList(A_PLUS, B, B_PLUS, C, F, D, A_PLUS));
    }

    private List<Integer> initializeCreditsList() {
        return new ArrayList<>(Arrays.asList(1, 2, 3, 2, 2, 1, 9));
    }

    @Test
    public void testAddSubjectGrade() {
        SubjectGradeList subjectGradeList = new SubjectGradeList();
        List<Integer> creditsList = initializeCreditsList();
        List<Grade> subjectGradeListData = initializeList();

        for (int i = 0; i < subjectGradeListData.size(); i++) {
            subjectGradeList.add(subjectGradeListData.get(i), creditsList.get(i));

            assertEquals(creditsList.subList(0, i + 1), subjectGradeList.getSubjectCreditList());
            assertEquals(subjectGradeListData.subList(0, i + 1), subjectGradeList.getSubjectGradeList());
        }

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(subjectGradeListData, subjectGradeList.getSubjectGradeList());
    }

    @Test
    public void testRemoveSubjectGradeAt() {
        SubjectGradeList subjectGradeList = new SubjectGradeList();
        List<Integer> creditsList = initializeCreditsList();
        List<Grade> gradeList = initializeList();

        for (int i = 0; i < gradeList.size(); i++) {
            subjectGradeList.add(gradeList.get(i), creditsList.get(i));
        }

        gradeList.remove(2);
        creditsList.remove(2);
        subjectGradeList.removeAt(2);

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());

        gradeList.remove(3);
        creditsList.remove(3);
        subjectGradeList.removeAt(3);

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());

        gradeList.remove(0);
        creditsList.remove(0);
        subjectGradeList.removeAt(0);

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());
    }

    @Test
    public void testCalculateSGPA() {
        List<Grade> gradeList = initializeList();
        List<Integer> creditsList = initializeCreditsList();
        SubjectGradeList subjectGradeList = new SubjectGradeList();

        double sum = 0.0d;
        int creditsSum = 0;


        assertEquals(0.0d, CalculateSGPA.compute(subjectGradeList));

        for (int i = 0; i < gradeList.size(); i++) {
            subjectGradeList.add(gradeList.get(i), creditsList.get(i)); // here

            sum += gradeList.get(i).getScore() * creditsList.get(i);
            creditsSum += creditsList.get(i);

            assertEquals(sum / creditsSum, CalculateSGPA.compute(subjectGradeList));
        }

        assertEquals(sum / creditsSum, CalculateSGPA.compute(subjectGradeList));
    }

    @Test
    public void testSetGradeAtIndex() {
        List<Grade> gradeList = initializeList();
        List<Integer> creditsList = initializeCreditsList();
        SubjectGradeList subjectGradeList = new SubjectGradeList();

        for (int i = 0; i < gradeList.size(); i++) {
            subjectGradeList.add(gradeList.get(i), creditsList.get(i));
        }

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());

        gradeList.set(0, A);
        creditsList.set(0, 2);
        subjectGradeList.set(0, A, 2);

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());

        gradeList.set(2, C_PLUS);
        creditsList.set(2, 3);
        subjectGradeList.set(2, C_PLUS, 3);

        assertEquals(creditsList, subjectGradeList.getSubjectCreditList());
        assertEquals(gradeList, subjectGradeList.getSubjectGradeList());
    }

    @Test
    public void testScoreCorrectlyReturned() {
        List<Grade> gradeList = initializeList();
        SubjectGradeList subjectGradeList = new SubjectGradeList();

        for (Grade grade : gradeList) {
            subjectGradeList.add(grade, 1);
        }

        assertEquals(gradeList.get(2).getScore(), subjectGradeList.getScoreAt(2));
        assertEquals(gradeList.get(0).getScore(), subjectGradeList.getScoreAt(0));
        assertEquals(gradeList.get(1).getScore(), subjectGradeList.getScoreAt(1));
    }

    @Test
    public void testDisplayStringCorrectlyReturned() {
        List<Grade> gradeList = initializeList();
        SubjectGradeList subjectGradeList = new SubjectGradeList();

        for (Grade grade : gradeList) {
            subjectGradeList.add(grade, 1);
        }

        assertEquals(gradeList.get(2).getUserFriendlyString(), subjectGradeList.getDisplayStringAt(2));
        assertEquals(gradeList.get(0).getUserFriendlyString(), subjectGradeList.getDisplayStringAt(0));
        assertEquals(gradeList.get(1).getUserFriendlyString(), subjectGradeList.getDisplayStringAt(1));
    }
}