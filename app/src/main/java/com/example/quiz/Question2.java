package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent intent=getIntent();
        rg=(RadioGroup)findViewById(R.id.radiogroup);
    }

    public void rbclick (View v){
        int radiobuttonid=rg.getCheckedRadioButtonId();
        rb=(RadioButton)findViewById(radiobuttonid);
        Toast.makeText(getBaseContext(),rb.getText(),Toast.LENGTH_SHORT).show();
    }
    public void Start(View view){
        Intent intent=new Intent(this,Question3.class);
        startActivity(intent);
    }
}