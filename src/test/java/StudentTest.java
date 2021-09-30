import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;

import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    Student jeff;

    @Before
    public void setUp(){
        jeff = new Student("jeff", 00000000001L);
    }

    @Test
    public void testNameGetter(){
        assertEquals("jeff", jeff.getName());
        assertNotNull(jeff.getName());
    }

    @Test
    public void testIDGetter(){
        assertEquals(00000000001L, jeff.getId());
        assertNotNull(jeff.getId());
    }

    @Test
    public void getGradesTest(){
        assertTrue(jeff.getGrades().isEmpty());
        jeff.addGrade(78);
        assertFalse(jeff.getGrades().isEmpty());
        assertSame(78,jeff.getGrades().get(0));
    }

    @Test
    public void addGradeTest(){
        assertTrue(jeff.getGrades().isEmpty());
        jeff.addGrade(78);
        assertSame(78, jeff.getGrades().get(0));
        jeff.addGrade(54);
        assertSame(54,jeff.getGrades().get(1));
    }

    @Test
    public void getGradeAverage(){
        jeff.addGrade(100);
        jeff.addGrade(50);
        assertEquals(75.00, jeff.getGradeAverage(), 0);
        jeff.addGrade(50);
        assertEquals(66.66, jeff.getGradeAverage(),0.01);
        jeff.addGrade(25);
        jeff.addGrade(0);
        jeff.addGrade(0);
        jeff.addGrade(0);
        jeff.addGrade(0);
        assertEquals(28.125,jeff.getGradeAverage(),0);
    }
}
