package com.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class festival_name extends AppCompatActivity {
Button fest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_name);
        fest=findViewById(R.id.btfestival);
        fest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(g);
                finish();
            }
        });
    }
}