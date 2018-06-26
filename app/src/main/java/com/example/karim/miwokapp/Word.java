package com.example.karim.miwokapp;

public class Word {
    private String mMiwokWord, mEnglishWord;
    private int mImageResourceId;
    private int mAudioResourceId;

    public Word (String englishWord , String miwokWord , int imageResourceId, int audioResourceId){
        mMiwokWord = miwokWord;
        mEnglishWord = englishWord;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmMiwokWord() { return mMiwokWord; }

    public String getmEnglishWord() { return mEnglishWord; }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}
