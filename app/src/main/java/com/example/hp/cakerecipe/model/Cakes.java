package com.example.hp.cakerecipe.model;

public class Cakes {
    private final String DRAWALE = "drawable/";
    private String cakeTitle;
    private String imgUri;

    public Cakes(String cakeTitle, String imgUri) {
        this.cakeTitle = cakeTitle;
        this.imgUri = imgUri;
    }

    public String getCakeTitle() {
        return cakeTitle;
    }



    public String getImgUri() {
        return DRAWALE + imgUri;
    }


}
