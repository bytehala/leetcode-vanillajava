package leetcode.longestpalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution s = new Solution();

    @Test
    public void shouldReturnBab() {
        assertEquals("aba", s.longestPalindrome("babad"));
        assertTrue("aba".equals(s.longestPalindrome("babad")) || "bab".equals(s.longestPalindrome("babad")));
    }

    @Test
    public void shouldReturnBb() {
        assertEquals("bb", s.longestPalindrome("cbbd"));
    }

    @Test
    public void shouldReturnCcc() {
        assertEquals("ccc", s.longestPalindrome("ccc"));
    }

    @Test
    public void shouldReturnBacab() {
        assertEquals("bacab", s.longestPalindrome("abacab"));
    }
}