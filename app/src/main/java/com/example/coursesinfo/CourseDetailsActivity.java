package com.example.coursesinfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CourseDetailsActivity extends AppCompatActivity {
    ImageView courseImv;
    TextView courseDetailsTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_course_details);
        courseImv = findViewById(R.id.imv_course);
        courseDetailsTv = findViewById(R.id.tv_course_details);
        Intent intent = getIntent();
        if (intent == null)
            return;
        String courseName = intent.getStringExtra(Constants.COURSE);
        switch (courseName) {
            case Constants.ANDROID_COURSE: {
                courseDetailsTv.setText(Constants.ANDROID_DETAILS);
                courseImv.setImageResource(R.drawable.android_pic);
                break;
            }
            case Constants.IOS_COURSE: {
                courseDetailsTv.setText(Constants.IOS_DETAILS);
                courseImv.setImageResource(R.drawable.ios_pic);
                break;
            }
            case Constants.FULLSTACK_COURSE: {
                courseDetailsTv.setText(Constants.FULLSTACK_DETAILS);
                courseImv.setImageResource(R.drawable.fullstack_pic);
                break;
            }
        }
    }
}