package com.faditor.master.ProfileEditActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.faditor.master.MainActivity.MainActivity;
import com.faditor.master.ProfileActivity.ProfileActivity;
import com.faditor.master.R;
import com.faditor.master.SettingActivity.SettingActivity;

public class ProfileEditActivity extends AppCompatActivity {
    ImageButton back;
    ImageButton ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileedit);

        back = (ImageButton)findViewById(R.id.back);
        ok = (ImageButton)findViewById(R.id.ok);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        // 수정된 데이터가 저장되면서 설정 액티비티로 이동
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });
    }
}
