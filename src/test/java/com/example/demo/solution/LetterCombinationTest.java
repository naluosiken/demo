package com.example.demo.solution;

import org.junit.jupiter.api.Test;

/**
 * @author luzy
 * @date 20/10/19 18:39
 */
class LetterCombinationTest {


    @Test
    void letterCombinations() {
        LetterCombination l = new LetterCombination();
        System.out.println(l.run("027423"));
    }

    @Test
    void letterCombinations2() {
        LetterCombination l = new LetterCombination();
        System.out.println(l.run(""));
    }
}