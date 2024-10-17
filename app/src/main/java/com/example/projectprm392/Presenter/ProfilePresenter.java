package com.example.projectprm392.Presenter;

import com.example.projectprm392.Model.ProfileModel;
import com.example.projectprm392.View.ProfileView;

public class ProfilePresenter {
    private ProfileView profileView;
    private ProfileModel profileModel;

    public ProfilePresenter(ProfileView view) {
        this.profileView = view;
        // Hardcoded for now, can be replaced with real data fetch
        this.profileModel = new ProfileModel("https://example.com/image.jpg", "User's Account");
    }

    public void loadProfileData() {
        profileView.setProfileImage(profileModel.getProfileImageUrl());
        profileView.setAccountName(profileModel.getAccountName());
    }
}

