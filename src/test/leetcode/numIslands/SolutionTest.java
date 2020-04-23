package leetcode.numIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void mustReturn0ForNull() {
        assertEquals(0, new Solution().numIslands(null));
    }

    @Test
    public void mustReturn0ForEmpty() {
        assertEquals(0, new Solution().numIslands(new char[0][0]));
    }

    @Test
    public void mustReturn1ForTestcase() {
        char[][] test = {
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}
        };
        assertEquals(1, new Solution().numIslands(test));
    }

    @Test
    public void mustReturn3() {
        char[][] test = {
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,1}
        };
        assertEquals(3, new Solution().numIslands(test));
    }

}