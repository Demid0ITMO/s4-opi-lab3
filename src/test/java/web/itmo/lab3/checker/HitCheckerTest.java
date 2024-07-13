package web.itmo.lab3.checker;

import org.junit.Test;

import static org.junit.Assert.*;

public class HitCheckerTest {

    @Test
    public void test() {
        assertTrue(HitChecker.checkHit(-2, 2, 4));
        assertFalse(HitChecker.checkHit(2, 2, 3));
        assertTrue(HitChecker.checkHit(-1, -1, 5));
        assertFalse(HitChecker.checkHit(-2, 2, 2));
    }
}
