package com.example.projectprm392.Model;

public class ProfileModel {
    private String profileImageUrl;
    private String accountName;

    public ProfileModel(String profileImageUrl, String accountName) {
        this.profileImageUrl = profileImageUrl;
        this.accountName = accountName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getAccountName() {
        return accountName;
    }
}
