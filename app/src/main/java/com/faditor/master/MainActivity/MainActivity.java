package com.faditor.master.MainActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.ImageButton;

import com.faditor.master.HomeActivity.HomeActivity;
import com.faditor.master.NoticeActivity.NoticeActivity;
import com.faditor.master.ProfileActivity.ProfileActivity;
import com.faditor.master.R;
import com.faditor.master.SearchActivity.SearchActivity;
import com.faditor.master.SettingActivity.SettingActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeActivity fragmentHome = new HomeActivity();
    private SearchActivity fragmentSearch = new SearchActivity();
    private NoticeActivity fragmentNotice = new NoticeActivity();
    private ProfileActivity fragmentProfile = new ProfileActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();

        BottomNavigationView bottomNavigationView = findViewById(R.id.navigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new ItemSelectedListener());

    }
        class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();

                switch(menuItem.getItemId())
                {
                    case R.id.homeItem:
                        transaction.replace(R.id.frameLayout, fragmentHome).commitAllowingStateLoss();
                        break;
                    case R.id.searchItem:
                        transaction.replace(R.id.frameLayout, fragmentSearch).commitAllowingStateLoss();
                        break;
                    case R.id.noticeItem:
                        transaction.replace(R.id.frameLayout, fragmentNotice).commitAllowingStateLoss();
                        break;
                    case R.id.paperItem:
                        transaction.replace(R.id.frameLayout, fragmentNotice).commitAllowingStateLoss();
                        break;
                }
                return true;
            }
    }
}
