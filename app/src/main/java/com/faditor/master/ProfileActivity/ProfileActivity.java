package com.faditor.master.ProfileActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.faditor.master.MainActivity.MainActivity;
import com.faditor.master.ProfileEditActivity.ProfileEditActivity;
import com.faditor.master.R;
import com.faditor.master.SettingActivity.SettingActivity;

public class ProfileActivity extends AppCompatActivity {
    ImageButton back;
    ImageButton edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        back = (ImageButton)findViewById(R.id.back);
        edit = (ImageButton)findViewById(R.id.setting);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}