package com.example.kcruz.tennismatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn_reset;
    private TextView txtF, txtM,txtD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtD = findViewById(R.id.deuce);
        btn1 = findViewById(R.id.btnF);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btnM);
        btn2.setOnClickListener(this);
        btn_reset = findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(this);

        txtF = findViewById(R.id.scoreFederer);
        txtF.setOnClickListener(this);
        txtM = findViewById(R.id.scoreMurray);
        txtM.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnF:
                scoringSystem(1);
                break;
            case R.id.btnM:
                scoringSystem(2);
                break;
            case R.id.btn_reset:
                txtF.setText("0");
                txtM.setText("0");
                txtD.setText("");
            default:
                break;
        }
    }

    public void scoringSystem (int scored){
        int pointsF = Integer.parseInt(txtF.getText().toString());
        int pointsM = Integer.parseInt(txtM.getText().toString());
        if(pointsF>=40&&pointsM>=40){
            if(scored==1)pointsF+=5;
            else if(scored==2)pointsM+=5;
            if(pointsF-pointsM==10){
                txtF.setText("wins");
                txtM.setText("lose");
            }
            else if(pointsM-pointsF==10) {
                txtM.setText("wins");
                txtF.setText("lose");
            }
            else {
                txtF.setText(pointsF+"");
                txtM.setText(pointsM+"");
            }
        }
        else{
            if(scored==1){
                if(pointsF==40)pointsF+=5;
                else if(pointsF==30)pointsF+=10;
                else pointsF+=15;
            }
            else if(scored==2){
                if(pointsM==40)pointsM+=5;
                else if(pointsM==30)pointsM+=10;
                else pointsM+=15;
            }
            txtF.setText(pointsF+"");
            txtM.setText(pointsM+"");
        }
        if (pointsF == pointsM && pointsF >= 40) txtD.setText("DEUCE");
        else txtD.setText("");

    }
}
