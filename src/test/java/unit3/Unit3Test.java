package unit3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Unit3Test {

    private final Unit3 unit3 = new Unit3();

    @Test
    public void testIsPositive() {
        assertTrue(unit3.isPositive(5), "5 is positive");
        assertFalse(unit3.isPositive(-1), "-1 is not positive");
        assertFalse(unit3.isPositive(0), "0 is not positive");
    }

    @Test
    public void testIsWithinRange() {
        assertTrue(unit3.isWithinRange(5, 1, 10), "5 is within range 1 to 10");
        assertFalse(unit3.isWithinRange(0, 1, 10), "0 is not within range 1 to 10");
        assertTrue(unit3.isWithinRange(10, 1, 10), "10 is within range 1 to 10");
    }

    @Test
    public void testIsLeapYear() {
        assertTrue(unit3.isLeapYear(2024), "2024 is a leap year");
        assertFalse(unit3.isLeapYear(1900), "1900 is not a leap year");
        assertTrue(unit3.isLeapYear(2000), "2000 is a leap year");
        assertFalse(unit3.isLeapYear(2023), "2023 is not a leap year");
    }

    @Test
    public void testAreBothSameSign() {
        assertTrue(unit3.areBothSameSign(3, 7), "Both 3 and 7 are positive");
        assertTrue(unit3.areBothSameSign(-2, -8), "Both -2 and -8 are negative");
        assertFalse(unit3.areBothSameSign(-2, 5), "-2 is negative and 5 is positive");
    }

    @Test
    public void testContainsSubstring() {
        assertTrue(unit3.containsSubstring("hello world", "world"), "Main string contains substring 'world'");
        assertFalse(unit3.containsSubstring("hello world", "java"), "Main string does not contain substring 'java'");
        assertFalse(unit3.containsSubstring("", "test"), "Main string is empty");
        assertFalse(unit3.containsSubstring("test", ""), "Substring is empty");
    }

    @Test
    public void testReversePhoneNumber() {
        assertEquals(4321, unit3.reversePhoneNumber(1234), "1234 reversed is 4321");
        assertEquals(98765, unit3.reversePhoneNumber(56789), "56789 reversed is 98765");
        assertEquals(1, unit3.reversePhoneNumber(1000), "1000 reversed is 1");
        assertEquals(0, unit3.reversePhoneNumber(0), "0 reversed is 0");
        assertEquals(987654321, unit3.reversePhoneNumber(123456789), "123456789 reversed is 987654321");
    }
}
