package com.example.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btn_roll;
    TextView tv_rollNumber;
    ImageView iv_die1;
    ImageView iv_die2;
    Random rng = new Random();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_roll = (Button) findViewById(R.id.btn_roll);
        tv_rollNumber = (TextView) findViewById(R.id.tv_rollNumber);
        iv_die1 = (ImageView) findViewById(R.id.iv_die );
        iv_die2 = (ImageView) findViewById(R.id.iv_die2);

        btn_roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theRoll;
                int theSecondRoll;


                theRoll = rng.nextInt(6) + 1;
                theSecondRoll = rng.nextInt(6) +1;

                switch (theRoll){
                    case 1:
                        iv_die1.setImageResource(R.drawable.die1);
                        break;
                    case 2:
                        iv_die1.setImageResource(R.drawable.die2);
                        break;
                    case 3:
                        iv_die1.setImageResource(R.drawable.die3);
                        break;
                    case 4:
                        iv_die1.setImageResource(R.drawable.die4);
                        break;
                    case 5:
                        iv_die1.setImageResource(R.drawable.die5);
                        break;
                    case 6:
                        iv_die1.setImageResource(R.drawable.die6);
                        break;
                }
                switch (theSecondRoll){
                    case 1:
                        iv_die2.setImageResource(R.drawable.die1);
                        break;
                    case 2:
                        iv_die2.setImageResource(R.drawable.die2);
                        break;
                    case 3:
                        iv_die2.setImageResource(R.drawable.die3);
                        break;
                    case 4:
                        iv_die2.setImageResource(R.drawable.die4);
                        break;
                    case 5:
                        iv_die2.setImageResource(R.drawable.die5);
                        break;
                    case 6:
                        iv_die2.setImageResource(R.drawable.die6);
                        break;
                }
                int finalValue = theRoll +theSecondRoll;
                tv_rollNumber.setText("You rolled a " + finalValue);

            }
        });

    }
}
