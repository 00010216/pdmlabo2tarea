package com.example.kcruz.tennismatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn1_;
    private TextView txtF, txtM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnF_15);
        btn1.setOnClickListener(this);
        btn1_ = findViewById(R.id.btnM_15);
        btn1_.setOnClickListener(this);
        txtF = findViewById(R.id.scoreFederer);
        txtF.setOnClickListener(this);
        txtM = findViewById(R.id.scoreMurray);
        txtM.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnF_15:
                txtF.setText("15");
                break;

            case R.id.btnF_30:
                // do your code
                break;

            case R.id.btnF_40:
                // do your code
                break;

            case R.id.btnM_15:
                txtM.setText("15");
                break;

            /*case R.id.reset:
                txtF.setText("0") & txtM.setText("0");
                break;*/
            default:
                break;
        }

    }
}
