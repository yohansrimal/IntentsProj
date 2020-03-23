package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText number1 = (EditText) findViewById(R.id.num1);
        EditText number2 = (EditText) findViewById(R.id.num2);

        String no1 = number1.getText().toString();
        String no2 = number2.getText().toString();

        if(no1.isEmpty() || no2.isEmpty()){
            Context context = getApplicationContext();
            CharSequence message = "Number fields cannot be empty";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, message, duration);
            toast.show();
        }
        else {
            try {
                Float.parseFloat(no1);
                Float.parseFloat(no2);

                intent.putExtra("Number1", no1);
                intent.putExtra("Number2", no2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "Sending numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            } catch (Exception e) {
                Context context = getApplicationContext();
                CharSequence message = "Invalid numbers";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
            }
        }



    }
}
