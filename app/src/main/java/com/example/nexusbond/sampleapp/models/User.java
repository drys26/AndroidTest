package com.example.nexusbond.sampleapp.models;

/**
 * Created by nexusbond on 31/05/2017.
 */

public class User {

    private String mUserUID;
    private String mEmailAddress;
    private String mUserFullName;
    private String mPhotoUrl;

    public User(String mUserUID, String mEmailAddress, String mUserFullName, String mPhotoUrl) {
        this.mUserUID = mUserUID;
        this.mEmailAddress = mEmailAddress;
        this.mUserFullName = mUserFullName;
        this.mPhotoUrl = mPhotoUrl;
    }

    public String getmUserUID() {
        return mUserUID;
    }

    public void setmUserUID(String mUserUID) {
        this.mUserUID = mUserUID;
    }

    public String getmEmailAddress() {
        return mEmailAddress;
    }

    public void setmEmailAddress(String mEmailAddress) {
        this.mEmailAddress = mEmailAddress;
    }

    public String getmUserFullName() {
        return mUserFullName;
    }

    public void setmUserFullName(String mUserFullName) {
        this.mUserFullName = mUserFullName;
    }

    public String getmPhotoUrl() {
        return mPhotoUrl;
    }

    public void setmPhotoUrl(String mPhotoUrl) {
        this.mPhotoUrl = mPhotoUrl;
    }
}
