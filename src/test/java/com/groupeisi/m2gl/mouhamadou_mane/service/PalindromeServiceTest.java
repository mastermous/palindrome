package com.groupeisi.m2gl.mouhamadou_mane.service;

import com.groupeisi.m2gl.mouhamadou_mane.request.PalindromeRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeServiceTest {

    private PalindromeService palindromeService = new PalindromeService();

    @Test
    public void testPalindromeOK(){
        assertTrue(palindromeService.checkPalindrome(new PalindromeRequest("kayak")).getIsPalindrome());
    }

    public void testPalindromeNOK(){
        assertFalse(palindromeService.checkPalindrome(new PalindromeRequest("kayaka")).getIsPalindrome());
    }
}
