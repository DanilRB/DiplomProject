package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);

        ConstraintLayout courseBg = findViewById(R.id.coursePageBg);
        ImageView courseImage = findViewById(R.id.coursePageImage);
        TextView courseTitle = findViewById(R.id.coursePageTitle);
        TextView courseDate = findViewById(R.id.coursePageDate);
        TextView courseLevel = findViewById(R.id.coursePageLevel);
        TextView courseText = findViewById(R.id.CoursePageText);

        courseBg.setBackgroundColor(getIntent().getIntExtra("courseBg", 0));
        courseImage.setImageResource(getIntent().getIntExtra("courseImage", 0));
        courseTitle.setText(getIntent().getStringExtra("courseTitle"));
        courseDate.setText(getIntent().getStringExtra("courseDate"));
        courseLevel.setText(getIntent().getStringExtra("courseLevel"));
        courseText.setText(getIntent().getStringExtra("courseText"));
    }
    public void openMaps(View view){
        Intent intent1 = new Intent();
        intent1.setAction(Intent.ACTION_VIEW);
        intent1.setData(Uri.parse("geo: 55.107669, 82.933644?z=15"));
        startActivity(intent1);
    }

    public void openMe(View view){
        Intent intent2 = new Intent(this, ButtonMe.class);
        startActivity(intent2);
    }

    public void openContact(View view){
        Intent intent3 = new Intent(this, Button_contact.class);
        startActivity(intent3);
    }
    public void openHome(View view){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
    public void openAnketa(View view){
        Intent intent5 = new Intent(this, activity_anketa.class);
        startActivity(intent5);
    }
}