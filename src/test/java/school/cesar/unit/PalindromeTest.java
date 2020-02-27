package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void check_stringLength1_true() {
        Assertions.assertTrue(Palindrome.check("a"));
    }

    @Test
    public void check_stringWithSameStartEnd_true() {
        Assertions.assertTrue(Palindrome.check("aa"));
    }

    @Test
    public void check_nonPalindromeWord_false() {
        Assertions.assertFalse(Palindrome.check("ab"));
    }
}
