package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by root on 2/10/17.
 */

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;
    private int mImgResourceId;
    private boolean mIsImageVisible = false;
    private int mAudioResourceId;

    public Word(String eng, String miwok) {
        this.mEnglishWord = eng;
        this.mMiwokWord = miwok;
    }

    public Word(String eng, String miwok, int audioResourceId) {
        this.mEnglishWord = eng;
        this.mMiwokWord = miwok;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String eng, String miwok, int imgRsourceId, int audioResourceId) {
        this.mEnglishWord = eng;
        this.mMiwokWord = miwok;
        this.mImgResourceId = imgRsourceId;
        this.mAudioResourceId = audioResourceId;
        this.mIsImageVisible = true;
    }

    public String getDefaultWord() {
        return mEnglishWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public Integer getImgResourceId() {
        return mImgResourceId;
    }

    public boolean isImageViewVisible() {
        return mIsImageVisible;
    }

    public Integer getAudioResourceId() {
        return  mAudioResourceId;
    }
}
