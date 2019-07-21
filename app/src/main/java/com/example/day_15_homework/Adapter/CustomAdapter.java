package com.example.day_15_homework.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.day_15_homework.Class.Student;
import com.example.day_15_homework.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Student> students;

    public CustomAdapter(Context context, ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Student student = students.get(position);
        holder.seIdTV.setText(student.getSeId());
        holder.nameTV.setText(student.getName());
        holder.phoneTV.setText(student.getPhone());

    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView seIdTV, nameTV, phoneTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            seIdTV = itemView.findViewById(R.id.studentSeId);
            nameTV = itemView.findViewById(R.id.studentName);
            phoneTV = itemView.findViewById(R.id.studentPhone);
        }
    }
}
