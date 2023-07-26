package com.groupeisi.m2gl.mouhamadou_mane.request;

public class PalindromeRequest {

    private String motAverifier;

    public PalindromeRequest(){

    }

    public PalindromeRequest(String motAverifier){
        this.motAverifier = motAverifier;
    }

    public String getMotAverifier(){
        return  motAverifier;
    }

    public void setMotAverifier(String motAverifier) {
        this.motAverifier = motAverifier;
    }
}
