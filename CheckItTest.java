import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CheckItTest {

    // Predicate Coverage
    @Test
    public void testPredicateTrue() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testPredicateFalse() {
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    // Clause Coverage
    @Test
    public void testClauseA() {
        assertTrue(CheckIt.checkIt(true, false, false));
        assertTrue(CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testClauseB() {
        assertFalse(CheckIt.checkIt(false, false, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    @Test
    public void testClauseC() {
        assertFalse(CheckIt.checkIt(false, true, false));
        assertTrue(CheckIt.checkIt(true, true, true));
    }

    // CACC
    @Test
    public void testCACC() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, false, true));
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

    // RACC
    @Test
    public void testRACC_1() {
        assertTrue(CheckIt.checkIt(true, false, true));
        assertFalse(CheckIt.checkIt(false, false, true));
    }

    @Test
    public void testRACC_2(){
        assertTrue(CheckIt.checkIt(true, true, true));
        assertFalse(CheckIt.checkIt(false, true, true));
    }

    @Test
    public void testRACC_3(){
        assertTrue(CheckIt.checkIt(true, true, false));
        assertFalse(CheckIt.checkIt(false, true, false));
    }

}
