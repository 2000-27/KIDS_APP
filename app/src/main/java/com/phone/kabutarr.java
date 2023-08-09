package com.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kabutarr extends AppCompatActivity {
  Button kab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabutarr);
        kab=findViewById(R.id.btkabu);
        kab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}