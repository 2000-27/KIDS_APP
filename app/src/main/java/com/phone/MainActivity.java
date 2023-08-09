package com.phone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
       ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9;
       int[] a={R.id.daybtn,R.id.monthbtn,R.id.shapebtn,R.id.fambtn,R.id.housebtn,R.id.vegbtn,R.id.tajbtn,R.id.fesbtn,R.id.anibtn};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.A);
        b2=findViewById(R.id.a);
        b3=findViewById(R.id.one);
        b4=findViewById(R.id.aanar);
        b5=findViewById(R.id.kabutar);
        b6=findViewById(R.id.fruits);
        b7=findViewById(R.id.trans);

        b8=findViewById(R.id.flower);
        b9=findViewById(R.id.colour);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),atozcapital.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),smallabcd.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), onetofifty.class);
                startActivity(i);
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), aaseaanarr.class);
                startActivity(i);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), kabutarr.class);
                startActivity(i);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),fruit.class);
                startActivity(i);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(), transport.class);
                startActivity(i);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),flowering.class);
                startActivity(i);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),COLOURRR.class);
                startActivity(i);
            }
        });

       for(int x:a){
           findViewById(x).setOnClickListener(this);
       }

    }

    @Override
    public void onClick(View view) {
      if(view.getId()==R.id.daybtn) {
          Intent i =new Intent(getApplicationContext(),days_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.monthbtn){
          Intent i =new Intent(getApplicationContext(),month_name.class);
          startActivity(i);

      }
      else if(view.getId()==R.id.shapebtn){
          Intent i =new Intent(getApplicationContext(),shape_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.fambtn){
          Intent i =new Intent(getApplicationContext(),family_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.housebtn){
          Intent i =new Intent(getApplicationContext(),house_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.vegbtn){
          Intent i =new Intent(getApplicationContext(),veg_name.class);
          startActivity(i);
      }

      else if(view.getId()==R.id.tajbtn){
          Intent i =new Intent(getApplicationContext(),monument_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.anibtn){
          Intent i =new Intent(getApplicationContext(),animal_name.class);
          startActivity(i);
      }
      else if(view.getId()==R.id.fesbtn){
          Intent i =new Intent(getApplicationContext(),festival_name.class);
          startActivity(i);
      }
    }
}