package com.example.diplom_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class activity_anketa extends AppCompatActivity {
    private EditText edName, edPhone, edMail;
    private DatabaseReference mDateBase;
    private String USER_KEY = "User";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anketa);
        init();
    }
    private void init()
    {
        edName = findViewById(R.id.edName);
        edPhone = findViewById(R.id.edPhone);
        edMail = findViewById(R.id.edMail);
        mDateBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
    }

    public void onClickSave(View view)
    {
        String Id = mDateBase.getKey();
        String Name = edName.getText().toString();
        String Phone = edPhone.getText().toString();
        String Mail = edMail.getText().toString();
        User newUser = new User(Id, Name, Phone, Mail);
        if(!TextUtils.isEmpty(Name) && !TextUtils.isEmpty(Phone) && !TextUtils.isEmpty(Mail))
        {
            mDateBase.push().setValue(newUser);
            Toast.makeText(this, "Отправлено! Скоро мы с Вами свяжемся)", Toast.LENGTH_SHORT).show();
        }
        else
            {
                Toast.makeText(this, "Заполните пустые поля", Toast.LENGTH_SHORT).show();
        }
    }
}