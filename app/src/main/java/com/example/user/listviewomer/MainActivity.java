package com.example.user.listviewomer;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1;
    RadioButton rb2;
    EditText et1;
    EditText et2;
    Button btn1;
    int a;
    boolean bo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn1 = (Button) findViewById(R.id.btn1);
        int a = 0;

        if (rb1.isChecked()){

            bo=true;

            String st1 = et1.getText().toString();
            int b = Integer.parseInt(st1);
            String st2 = et2.getText().toString();
            int c = Integer.parseInt(st2);

            Intent t=new Intent(this, Main2Activity.class);
            t.putExtra("n",bo);
            t.putExtra("nn",b);
            t.putExtra("nnn",c);
        }

        else if (rb2.isChecked()){

            bo=false;

            String st1 = et1.getText().toString();
            int b = Integer.parseInt(st1);
            String st2 = et2.getText().toString();
            int c = Integer.parseInt(st2);

            Intent t=new Intent(this, Main2Activity.class);
            t.putExtra("n",bo);
            t.putExtra("nn",b);
            t.putExtra("nnn",c);
        }


    }

    public void ome1(View view){
        Intent t=new Intent(this, Main2Activity.class);
        startActivity(t);
        finish();
    }

    public void ome2(View view) {
        Intent t = new Intent(this, Main3Activity.class);
        startActivity(t);
        finish();
    }


}





