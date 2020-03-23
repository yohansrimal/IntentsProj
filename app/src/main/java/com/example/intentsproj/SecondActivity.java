package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static String no1, no2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
         no1 = intent.getStringExtra("Number1");
         no2 = intent.getStringExtra("Number2");

        EditText editno1 = findViewById(R.id.calnum1);
        EditText editno2 = findViewById(R.id.calnum2);

        editno1.setText(no1);
        editno2.setText(no2);

    }

    public void addition(View view){
        float no1, no2, ans;
        String finalAnswer;

        no1 = Float.parseFloat(this.no1);
        no2 = Float.parseFloat(this.no2);

        ans = no1 + no2;

        finalAnswer = Float.toString(ans);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " + "  + no2 + " = " + finalAnswer);
    }

    public void substraction(View view){
        float no1, no2, ans;
        String finalAnswer;

        no1 = Float.parseFloat(this.no1);
        no2 = Float.parseFloat(this.no2);

        ans = no1 - no2;

        finalAnswer = Float.toString(ans);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " + "  + no2 + " = " + finalAnswer);
    }

    public void multiplication(View view){
        float no1, no2, ans;
        String finalAnswer;

        no1 = Float.parseFloat(this.no1);
        no2 = Float.parseFloat(this.no2);

        ans = no1 * no2;

        finalAnswer = Float.toString(ans);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " + "  + no2 + " = " + finalAnswer);
    }

    public void devision(View view){
        float no1, no2, ans;
        String finalAnswer;

        no1 = Float.parseFloat(this.no1);
        no2 = Float.parseFloat(this.no2);

        ans = no1 / no2;

        finalAnswer = Float.toString(ans);

        TextView Ans = findViewById(R.id.answer);

        Ans.setText(no1 + " + "  + no2 + " = " + finalAnswer);
    }
}
