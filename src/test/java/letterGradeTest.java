import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest {

    @Test
    public void letterGradeInPossibleDomainBoundariesTest() {
        char gradeA =  LetterGrade.letterGrade(91);
        assertEquals(gradeA, 'A');
        char gradeB =  LetterGrade.letterGrade(89);
        assertEquals(gradeB, 'B');
        char gradeC =  LetterGrade.letterGrade(79);
        assertEquals(gradeC, 'C');
        char gradeD =  LetterGrade.letterGrade(69);
        assertEquals(gradeD, 'D');
        char gradeF =  LetterGrade.letterGrade(29);
        assertEquals(gradeD, 'D');
    }

    @Test
    public void letterGradeInImpossibleDoaminBoundariesTest() {
        char gradeLessZero = LetterGrade.letterGrade(-1);
        assertEquals(gradeLessZero, 88);
        assertEquals(gradeLessZero, 'X');
        char gradeOverHundred = LetterGrade.letterGrade(101);
        assertEquals(gradeLessZero, 88);
    }
}
