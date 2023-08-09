package com.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monument_name extends AppCompatActivity {
Button monu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monument_name);
        monu=findViewById(R.id.btmonument);
        monu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}