package com.example.day_15_homework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.day_15_homework.Adapter.CustomAdapter;
import com.example.day_15_homework.Class.StoreClass;
import com.example.day_15_homework.Class.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ImageView contentIV;
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvID);
        contentIV = findViewById(R.id.contentIV);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        students = StoreClass.getStudentList();

        if (students.size() > 0){
            contentIV.setVisibility(View.GONE);
        }else {
            contentIV.setVisibility(View.VISIBLE);
        }

        adapter = new CustomAdapter(this,students);
        recyclerView.setAdapter(adapter);
    }

    public void fabBtnClick(View view) {
        startActivity(new Intent(this,InputActivity.class));
        finish();
    }
}
