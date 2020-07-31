package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] buttons = new Button[5][5];

    private boolean player1Turn = true;

    private int roundCount;

    private int player1score;
    private int player2score;

    private TextView textViewPlayer1;
    private TextView textViewPlayer2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 // initialize all the buttons and textviews.
        textViewPlayer1 = findViewById(R.id.text_view_p1);
        textViewPlayer2 = findViewById(R.id.text_view_p1);

        buttons[0][0] = findViewById(R.id.button_00);
        buttons[0][1] = findViewById(R.id.button_01);
        buttons[0][2] = findViewById(R.id.button_02);
        buttons[0][3] = findViewById(R.id.button_03);
        buttons[0][4] = findViewById(R.id.button_04);

        buttons[1][0] = findViewById(R.id.button_00);
        buttons[1][1] = findViewById(R.id.button_01);
        buttons[1][2] = findViewById(R.id.button_02);
        buttons[1][3] = findViewById(R.id.button_03);
        buttons[1][4] = findViewById(R.id.button_04);

        buttons[2][0] = findViewById(R.id.button_20);
        buttons[2][1] = findViewById(R.id.button_21);
        buttons[2][2] = findViewById(R.id.button_22);
        buttons[2][3] = findViewById(R.id.button_23);
        buttons[2][4] = findViewById(R.id.button_24);

        buttons[3][0] = findViewById(R.id.button_30);
        buttons[3][1] = findViewById(R.id.button_31);
        buttons[3][2] = findViewById(R.id.button_32);
        buttons[3][3] = findViewById(R.id.button_33);
        buttons[3][4] = findViewById(R.id.button_34);

        buttons[4][0] = findViewById(R.id.button_40);
        buttons[4][1] = findViewById(R.id.button_41);
        buttons[4][2] = findViewById(R.id.button_42);
        buttons[4][3] = findViewById(R.id.button_43);
        buttons[4][4] = findViewById(R.id.button_44);




        //reset will not work the same as the other buttons, so we must view it differently
        Button buttonReset = findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){}

        });

    }

    @Override
    public void onClick(View view) {
        if (!((Button) view).getText().toString().equals("")){
            return;
        }

        if (player1Turn){
            ((Button) view).setText("X");
        } else {
            ((Button) view).setText("O");
        }


    }
}