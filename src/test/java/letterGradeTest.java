import org.junit.Test;

import static org.junit.Assert.*;

public class letterGradeTest {

    @Test
    public void letterGradeInImpossibleByBoundariesTest() {
        char gradeAInHeighestBoundary = LetterGrade.letterGrade(100);
        assertEquals(gradeAInHeighestBoundary, 'A');
        char gradeAInLowestBoundary =  LetterGrade.letterGrade(90);
        assertEquals(gradeAInLowestBoundary, 'A');
        
        char gradeBInHeighestBoundary =  LetterGrade.letterGrade(89);
        assertEquals(gradeBInHeighestBoundary, 'B');
        char gradeBInLowestBoundary =  LetterGrade.letterGrade(80);
        assertEquals(gradeBInLowestBoundary, 'B');
        
        char gradeCInHeighestBoundary =  LetterGrade.letterGrade(79);
        assertEquals(gradeCInHeighestBoundary, 'C');
        char gradeCInLowestBoundary =  LetterGrade.letterGrade(70);
        assertEquals(gradeCInLowestBoundary, 'C');
        
        char gradeDInHeighestBoundary =  LetterGrade.letterGrade(69);
        assertEquals(gradeDInHeighestBoundary, 'D');
        char gradeDInLowestBoundary =  LetterGrade.letterGrade(60);
        assertEquals(gradeDInLowestBoundary, 'D');
        
        char gradeFInHeighestBoundary =  LetterGrade.letterGrade(59);
        assertEquals(gradeFInHeighestBoundary, 'F');
        char gradeFInLowestBoundary =  LetterGrade.letterGrade(0);
        assertEquals(gradeFInLowestBoundary, 'F');
        
        char gradeXInLowestBoundary = LetterGrade.letterGrade(-1);
        assertEquals(gradeXInLowestBoundary, 88);
        assertEquals(gradeXInLowestBoundary, 'X');
        char gradeXInHeighestBoundary = LetterGrade.letterGrade(101);
        assertEquals(gradeXInHeighestBoundary, 88);
        
    }
    @Test
    public void letterGradeByPartitioningTest() {
        char gradeA =  LetterGrade.letterGrade(95);
        assertEquals(gradeA, 'A');
        char gradeB =  LetterGrade.letterGrade(85);
        assertEquals(gradeB, 'B');
        char gradeC =  LetterGrade.letterGrade(75);
        assertEquals(gradeC, 'C');
        char gradeD =  LetterGrade.letterGrade(65);
        assertEquals(gradeD, 'D');
        char gradeF =  LetterGrade.letterGrade(25);
        assertEquals(gradeF, 'F');
        char gradeLessZero = LetterGrade.letterGrade(-1);
        assertEquals(gradeLessZero, 88);
        assertEquals(gradeLessZero, 'X');
        char gradeOverHundred = LetterGrade.letterGrade(101);
        assertEquals(gradeOverHundred, 88);
    }
}
