package io.practice.reverse;

import io.practice.util.ReverseLetter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {

    @Test
    void reversesOnlyLetters() {
        assertEquals("dcba", ReverseLetter.reverse("abcd"));
    }
    @Test
    void reversesLettersInMixedString() {
        assertEquals("t@eb eht av$J!123",
                ReverseLetter.reverse("J@va the be$t!123"));
    }
    @Test
    void returnsEmptyString() {
        assertEquals("", ReverseLetter.reverse(""));
    }
    @Test
    void keepsSingleLetter() {
        assertEquals("a", ReverseLetter.reverse("a"));
    }
    @Test
    void keepsStringWithoutLetters() {
        assertEquals("123-!", ReverseLetter.reverse("123-!"));
    }
    @Test
    void keepsNonLettersAtEdgesAndInMiddle() {
        assertEquals("!dc-ba?", ReverseLetter.reverse("!ab-cd?"));
    }
    @Test
    void preservesLetterCase() {
        assertEquals("Dc-Ba", ReverseLetter.reverse("aB-cD"));
    }
    @Test
    void throwsExceptionForNull() {
        assertThrows(NullPointerException.class, () -> ReverseLetter.reverse(null));
    }
}