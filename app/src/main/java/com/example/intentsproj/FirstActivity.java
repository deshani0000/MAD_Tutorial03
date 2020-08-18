package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText enum1;
    EditText enum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        enum1 = findViewById(R.id.etnum1);
        enum2 = findViewById(R.id.etnum2);


        }

        public void openSecond(View view){
            Intent intent = new Intent(this,SecondActivity.class);
            intent.putExtra("n1",enum1.getText().toString());
            intent.putExtra("n2",enum2.getText().toString());

            //Toast.makeText(this, "Sending message...", Toast.LENGTH_SHORT).show();
             LayoutInflater li = getLayoutInflater();

             View layout = li.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout));
             Toast toast = new Toast(getApplicationContext());
             toast.setDuration(Toast.LENGTH_SHORT);  toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
             toast.setView(layout);
             toast.show();

            startActivity(intent);

        }

}
