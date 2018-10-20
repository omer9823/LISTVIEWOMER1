package com.example.user.listviewomer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView LV1;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    String st1;
    String st2;
    int x,y;
    int i,j;
    String sum,sum1;
    boolean bo;
    String arr1[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LV1 = (ListView) findViewById(R.id.LV1);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);


        Intent g = getIntent();

        st1 = g.getStringExtra("n");
        st2 = g.getStringExtra("nn");
        bo = g.getBooleanExtra("nnn", bo);

        finish();


        x = Integer.parseInt(st1);
        y = Integer.parseInt(st2);


        if (bo == true) {
            for (i = 0; i < 20; i++) {

                x = x + y;

                sum = Integer.toString(x);

                arr1[i] = sum;

            }
            LV1.setOnItemClickListener((AdapterView.OnItemClickListener) this);
            LV1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

            LV1.setAdapter(adp);
        }
        else if (bo==false) {
            for (i = 0; i < 20; i++) {

                x = x * y;

                sum = Integer.toString(x);

                arr1[i] = sum;

            }
            LV1.setOnItemClickListener((AdapterView.OnItemClickListener) this);
            LV1.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

            ArrayAdapter<String> adp = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arr1);

           LV1.setAdapter(adp);

        }

    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        tv1.setText(x);

        tv2.setText(y);

        tv3.setText(i+1);

        for (j=0;j<1;j++) {

            sum1=sum1+x;

        }

        tv4.setText(sum1);
    }


}