package com.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class atozcapital extends AppCompatActivity {
 Button A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atozcapital);
       A=findViewById(R.id.btn_A_Z);
       A.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(getApplicationContext(), MainActivity.class);
               startActivity(i);
           }
       });
    }
}