package com.example.projectprm392.View;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.prm392project8.R;
import com.example.projectprm392.Presenter.ProfilePresenter;

public class ProfileActivity extends AppCompatActivity implements ProfileView {

    private ImageView profileImage;
    private TextView tvPremium, tvTaiKhoan, tvCuaHangCuaBan, tvQuyenRiengTu, tvTroGiup, tvDangXuat;

    private ProfilePresenter profilePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        // Initialize the views
        profileImage = findViewById(R.id.profileImage);
        tvPremium = findViewById(R.id.tvPremium);
        tvTaiKhoan = findViewById(R.id.tvTaiKhoan);
        tvCuaHangCuaBan = findViewById(R.id.tvCuaHangCuaBan);
        tvQuyenRiengTu = findViewById(R.id.tvQuyenRiengTu);
        tvTroGiup = findViewById(R.id.tvTroGiup);
        tvDangXuat = findViewById(R.id.tvDangXuat);

        // Set up your presenter (if needed)
        profilePresenter = new ProfilePresenter(this);
        profilePresenter.loadProfileData();

        // Handle click events
        tvDangXuat.setOnClickListener(v -> {
            // Handle logout logic (UI interaction only)
        });
    }

    // ProfileView interface methods (just the UI part)
    @Override
    public void setProfileImage(String imageUrl) {
        // You can update the profile image here if needed
    }

    @Override
    public void setAccountName(String accountName) {
        tvTaiKhoan.setText(accountName);
    }
}
