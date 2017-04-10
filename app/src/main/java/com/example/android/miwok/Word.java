package com.example.android.miwok;

import android.graphics.drawable.DrawableWrapper;
import android.media.Image;

/**
 * Created by swlaforest on 4/9/2017.
 */

public class Word {
    private String mEnglishWord;

    private String mMiwokWord;
    private int mImg = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String englishWord, String miwokWord){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;

    }
    public Word(String englishWord, String miwokWord, int img){
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mImg = img;

    }
    public boolean hasImage() {
        return mImg != NO_IMAGE_PROVIDED;
    }


    public String getEnglishWord(){
        return mEnglishWord;
    }

    public String getMiwokWord(){
        return mMiwokWord;
    }

    public int getImg(){
        return mImg;
    }
    public void setEnglishWord(String englishWord){
        mEnglishWord = englishWord;
    }
    public void setMiwokWord(String miwokWord){
        mMiwokWord = miwokWord;
    }
}
