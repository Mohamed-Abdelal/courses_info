package com.example.coursesinfo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        if (v.getId() == R.id.android_info || v.getId() == R.id.android_button) {
            startCourseDetailsActivity(Constants.ANDROID_COURSE);
            return;
        }
        if (v.getId() == R.id.ios_info || v.getId() == R.id.ios_button) {
            startCourseDetailsActivity(Constants.IOS_COURSE);
            return;
        }
        if (v.getId() == R.id.fullstack_info || v.getId() == R.id.fullstack_button) {
            startCourseDetailsActivity(Constants.FULLSTACK_COURSE);
            return;
        }
    }

        private void startCourseDetailsActivity (String courseName){
            Intent intent = new Intent(this, CourseDetailsActivity.class);
            intent.putExtra("course", courseName);
            startActivity(intent);
        }
}