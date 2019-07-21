package com.example.day_15_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.day_15_homework.Class.StoreClass;
import com.example.day_15_homework.Class.Student;

import java.util.List;

public class InputActivity extends AppCompatActivity {

    private EditText seIdEt, nameEt, phoneEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        seIdEt = findViewById(R.id.seidEt);
        nameEt = findViewById(R.id.nameEt);
        phoneEt = findViewById(R.id.phoneEt);



    }

    public void saveInfo(View view) {

        if (isValid(seIdEt,nameEt,phoneEt)){
            String seid = seIdEt.getText().toString();
            String name = nameEt.getText().toString();
            String phone = phoneEt.getText().toString();

            Student student = new Student(seid,name,phone);
            StoreClass.addStudent(student);

            goToMain();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        goToMain();
    }

    private void goToMain(){
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }

    public static boolean isValid(EditText... editTexts){
        boolean b = true;

        for (EditText editText: editTexts){
            String value = editText.getText().toString();
            if (value.isEmpty()){
                b = false;
                editText.setError("Please fill up");
            }

        }

        return b;

    }
}
