package com.example.ipshamohanty.myfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1, et2;
    Button b;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //You need to reference your editText in java to the editText in xml

        et1 = (EditText) findViewById(R.id.et1_id);
        et2 = (EditText) findViewById(R.id.et2_id);
        b = (Button) findViewById(R.id.btnadd);
        ans = (TextView) findViewById(R.id.textView);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int i = Integer.parseInt(et1.getText().toString());
                int j = Integer.parseInt(et2.getText().toString());

                int k = i + j;

                ans.setText(String.valueOf(k));
            }

        });

    }
}