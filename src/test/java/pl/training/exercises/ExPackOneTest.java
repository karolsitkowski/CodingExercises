package pl.training.exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExPackOneTest {

    @Before
    public void prepare() {

    }

    @Test
    public void theSumOfTwoInputsTest() {
        ExPackOne ex = new ExPackOne();

        assertEquals(3,ex.theSumOfTwoInputs(1,2));
        assertEquals(900,ex.theSumOfTwoInputs(-100,1000));
        assertEquals(900,ex.theSumOfTwoInputs(1000,-100));
        assertEquals(1000,ex.theSumOfTwoInputs(0,1000));
        assertEquals(1000,ex.theSumOfTwoInputs(1000,0));
        assertEquals(1000,ex.theSumOfTwoInputs(0,1000));
        assertEquals(-100,ex.theSumOfTwoInputs(0,-100));
        assertEquals(-100,ex.theSumOfTwoInputs(-100,0));

    }
@Test
    public void centuryFromYearTest(){
        ExPackOne ex = new ExPackOne();

        assertEquals(1,ex.centuryFromYear(1));
        assertEquals(21,ex.centuryFromYear(2005));
        assertEquals(0,ex.centuryFromYear(3000));
        assertEquals(0,ex.centuryFromYear(-1000));
        assertEquals(11,ex.centuryFromYear(1001));
        assertEquals(20,ex.centuryFromYear(2000));



    }

}