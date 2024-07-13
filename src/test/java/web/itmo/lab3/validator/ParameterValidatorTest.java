package web.itmo.lab3.validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParameterValidatorTest {

    @Test
    public void checkRanges() {
        assertTrue(ParameterValidator.checkRanges(1, 2, 3).getValid());
        assertFalse(ParameterValidator.checkRanges(-3, 2, 3).getValid());
        assertFalse(ParameterValidator.checkRanges(1, -5, 3).getValid());
        assertFalse(ParameterValidator.checkRanges(1, 2, 6).getValid());
        assertFalse(ParameterValidator.checkRanges(-2.1f, 3, -3).getValid());
    }
}