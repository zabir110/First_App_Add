package com.example.user.first_app_add;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b;
    TextView ans;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        ans=(TextView) findViewById(R.id.ans);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        b.setOnClickListener((View v)-> {
                int i =Integer.parseInt(et1.getText().toString());
               int j =Integer.parseInt(et2.getText().toString());
                int k=i+j;
               ans.setText("Answer is : "+k);
            }
        );

    }
 //  public  void add(View v){
   //     int i =Integer.parseInt(et1.getText().toString());
   //     int j =Integer.parseInt(et2.getText().toString());
   //     int k=i+j;
   //     ans.setText("Answer is : "+k);

    //}
}
