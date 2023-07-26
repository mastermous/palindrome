package com.groupeisi.m2gl.mouhamadou_mane.response;

public class PalindromeResponse {
    private boolean isPalindrome;

    public PalindromeResponse(){

    }

    public PalindromeResponse(boolean isPalindrome){
        this.isPalindrome = isPalindrome;
    }

    public boolean getIsPalindrome(){
        return isPalindrome;
    }

    public void setIsPalindrome(boolean isPalindrome) {
        this.isPalindrome = isPalindrome;
    }
}
