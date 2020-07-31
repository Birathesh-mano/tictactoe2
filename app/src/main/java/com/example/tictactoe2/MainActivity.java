package com.example.tictactoe2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button[][] buttons = new Button[4][4];

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
        textViewPlayer2 = findViewById(R.id.text_view_p2);

        buttons[0][0] = findViewById(R.id.button_00);
        buttons[0][1] = findViewById(R.id.button_01);
        buttons[0][2] = findViewById(R.id.button_02);
        buttons[0][3] = findViewById(R.id.button_03);

        buttons[1][0] = findViewById(R.id.button_10);
        buttons[1][1] = findViewById(R.id.button_11);
        buttons[1][2] = findViewById(R.id.button_12);
        buttons[1][3] = findViewById(R.id.button_13);

        buttons[2][0] = findViewById(R.id.button_20);
        buttons[2][1] = findViewById(R.id.button_21);
        buttons[2][2] = findViewById(R.id.button_22);
        buttons[2][3] = findViewById(R.id.button_23);

        buttons[3][0] = findViewById(R.id.button_30);
        buttons[3][1] = findViewById(R.id.button_31);
        buttons[3][2] = findViewById(R.id.button_32);
        buttons[3][3] = findViewById(R.id.button_33);

        buttons[0][0].setOnClickListener(this);
        buttons[0][1].setOnClickListener(this);
        buttons[0][2].setOnClickListener(this);
        buttons[0][3].setOnClickListener(this);

        buttons[1][0].setOnClickListener(this);
        buttons[1][1].setOnClickListener(this);
        buttons[1][2].setOnClickListener(this);
        buttons[1][3].setOnClickListener(this);

        buttons[2][0].setOnClickListener(this);
        buttons[2][1].setOnClickListener(this);
        buttons[2][2].setOnClickListener(this);
        buttons[2][3].setOnClickListener(this);

        buttons[3][0].setOnClickListener(this);
        buttons[3][1].setOnClickListener(this);
        buttons[3][2].setOnClickListener(this);
        buttons[3][3].setOnClickListener(this);







        //reset will not work the same as the other buttons, so we must view it differently
        Button buttonReset = findViewById(R.id.button_reset);
        buttonReset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){}

        });

    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View view) {
        if (!((Button) view).getText().toString().equals("")) {
            return;
        }
//filling in the board
        if (player1Turn) {
            ((Button) view).setText("X");
        } else {
            ((Button) view).setText("O");
        }

        roundCount++;

        if (checkWin()) {
            if (player1Turn) {
                p1Win();

            } else {
                p2Win();
            }

        } else if (roundCount == 16) {
            tie();
        } else {
            player1Turn = !player1Turn;
        }
    }

    private boolean checkWin() {
        String[][] board = new String[4][4];
        int i = 0;
        int j = 0;

        while (i < 4) {
            while (j < 4) {
                board[i][j] = buttons[i][j].getText().toString();
                j++;
            }
            i++;
        }
        //We must decide how to get the win condition given that the board is 5x5 and we need 4 in a row
        i = 0;
        while (i < 4) {
            if ((board[i][0].equals(board[i][3])
                    && board[i][0].equals(board[i][1])
                    && board[i][0].equals(board[i][2])

                    && !board[i][0].equals(""))){
                return true;
            }
            i++;
        }
        i = 0;
        while (i < 4) {
            if ((board[0][i].equals(board[3][i])
                    && board[0][i].equals(board[1][i])
                    && board[0][i].equals(board[2][i])

                    && !board[0][i].equals(""))){
                return true;
            }
            i++;
        }
//both diagonal win positions
        if ((board[0][0].equals(board[3][3])
                && board[0][0].equals(board[1][1])
                && board[0][0].equals(board[2][2])

                && !board[0][0].equals(""))){
            return true;
        }

        if ((board[0][3].equals(board[3][0])
                && board[0][3].equals(board[1][2])
                && board[0][3].equals(board[2][3])
                && !board[0][3].equals(""))){
            return true;
        }

        return false;





    }

        private void p1Win() {
            player1score++;
            Toast.makeText(this,"Player 1 is da winner", Toast.LENGTH_SHORT).show();;
            updatePointText();
            resetBoard();
        }
        private void p2Win() {
            player2score++;
            Toast.makeText(this,"Player 2 is da winner", Toast.LENGTH_SHORT).show();
            updatePointText();
            resetBoard();
        }
        private void tie() {
            Toast.makeText(this, "Yall tied", Toast.LENGTH_SHORT).show();
        }
        private void updatePointText() {
            textViewPlayer1.setText("P1: " + player1score);
            textViewPlayer2.setText("P2: " + player2score);
        }
        private void resetBoard() {
            int i = 0;
            int j = 0;
        while (i < 4) {
                while (j < 4) {
                    buttons[i][j].setText("");
                    j++;
                }
                i++;
            }
        roundCount = 0;
        player1Turn = true;
    }
}