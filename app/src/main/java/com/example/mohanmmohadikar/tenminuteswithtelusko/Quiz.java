package com.example.mohanmmohadikar.tenminuteswithtelusko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz extends AppCompatActivity {


    Button b1;
    int score=0;
    RadioButton rb11,rb22,rb31,rb43,rb51,rb63,rb73,rb83,rb94,rb102;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);



        b1 = (Button)findViewById(R.id.b1);


        rb11 = (RadioButton)findViewById(R.id.rb11);
        rb22 = (RadioButton)findViewById(R.id.rb22);
        rb31 = (RadioButton)findViewById(R.id.rb31);
        rb43 = (RadioButton)findViewById(R.id.rb43);
        rb51 = (RadioButton)findViewById(R.id.rb51);
        rb63 = (RadioButton)findViewById(R.id.rb63);
        rb73 = (RadioButton)findViewById(R.id.rb73);
        rb83 = (RadioButton)findViewById(R.id.rb83);
        rb94 = (RadioButton)findViewById(R.id.rb94);
        rb102 = (RadioButton)findViewById(R.id.rb102);








        b1.setOnClickListener(v->{

            q1();
            q2();
            q3();
            q4();
            q5();
            q6();
            q7();
            q8();
            q9();
            q10();
            sendTo();

        });


    }

    private void sendTo() {

        Intent i = new Intent(Quiz.this, Result.class);
        i.putExtra("score", score);
        startActivity(i);
        finish();

    }


    private void q1() {

        if (rb11.isChecked()) {
            score++;
        }
    }


    private void q2() {

        if (rb22.isChecked()) {
            score++;
        }
    }

    private void q3() {

        if (rb31.isChecked()) {
            score++;
        }
    }

    private void q4() {

        if (rb43.isChecked()) {
            score++;
        }
    }

    private void q5() {

        if (rb51.isChecked()) {
            score++;
        }
    }

    private void q6() {

        if (rb63.isChecked()) {
            score++;
        }
    }

    private void q7() {

        if (rb73.isChecked()) {
            score++;
        }
    }

    private void q8() {

        if (rb83.isChecked()) {
            score++;
        }
    }

    private void q9() {

        if (rb94.isChecked()) {
            score++;
        }
    }

    private void q10() {

        if (rb102.isChecked()) {
            score++;
        }
    }


}

//<string name="ansr">a1,b2, a3,c4,a5, c6,c7, b8, d9,b10</string>