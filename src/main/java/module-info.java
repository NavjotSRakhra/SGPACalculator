/**
 * This module primarily is used to calculate SGPA of a list of subjects with their grades and credits stored in
 * {@link navjot.sgpaCalculator.subject.SubjectGradeList}. It can also be used just to store subject grade and the
 * corresponding credits. This also has 11 enums which represents grades.
 */
module SGPACalculator {
    exports navjot.sgpaCalculator;
    exports navjot.sgpaCalculator.grade;
    exports navjot.sgpaCalculator.subject;
    requires java.base;
}