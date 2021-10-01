package com.example.miwok;

/**
* {@Link Word} represents a vocabulary word that the user wants to learn.
* It contains a default translation and miwok translation for that word.
*/

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private Integer mImageResourceId = NO_IMAGE_PROVIDED;

    private Integer mAudioResourceId;

    public static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTranslation,String MiwokTranslation,Integer AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId = AudioResourceId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, Integer ImageResourceId,Integer AudioResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    public Integer getImageResourceId() { return mImageResourceId; }

    public String getDefaultTranslation(){ return mDefaultTranslation; }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Integer getAudioResourceId() { return mAudioResourceId; };

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
