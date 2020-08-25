package com.faditor.master.MainActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.faditor.master.NoticeActivity.NoticeActivity;
import com.faditor.master.ProfileActivity.ProfileActivity;
import com.faditor.master.R;
import com.faditor.master.SearchActivity.SearchActivity;
import com.faditor.master.SettingActivity.SettingActivity;

public class MainActivity extends AppCompatActivity {
    // 상단바 메뉴 버튼
    ImageButton button_profile; //프로필
    ImageButton button_setting; //설정

    // 하단바 메뉴 버튼
    ImageButton button_home;    //홈
    ImageButton button_search;  //검색
    ImageButton button_add;     //게시글 추가
    ImageButton button_notice;  //활동
    ImageButton button_paper;   //패션 뉴스, 잡지

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 상단바 메뉴 버튼
        button_profile = (ImageButton)findViewById(R.id.profile_button);
        button_setting = (ImageButton)findViewById(R.id.setting_button);

        // 하단바 메뉴 버튼
        button_home = (ImageButton)findViewById(R.id.home);
        button_search = (ImageButton)findViewById(R.id.search);
        button_add = (ImageButton)findViewById(R.id.add);
        button_notice = (ImageButton)findViewById(R.id.notice);
        button_paper = (ImageButton)findViewById(R.id.paper);

        // 클릭 시 실행 //
        //프로필
        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        //설정
        button_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(intent);
            }
        });

        //홈
        button_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        //검색
        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        //게시글 올리기 //
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        //활동
        button_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NoticeActivity.class);
                startActivity(intent);
            }
        });
        //패션 뉴스, 잡지 //
        button_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
