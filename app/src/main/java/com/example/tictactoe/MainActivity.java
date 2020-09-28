package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String turn;
    private Button[][] board;
    private TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn="X";
        board=new Button[3][3];
        board[0][0]=(Button) findViewById(R.id.b1);
        board[0][1]=(Button)findViewById(R.id.b2);
        board[0][2]=(Button)findViewById(R.id.b3);
        board[1][0]=(Button) findViewById(R.id.b4);
        board[1][1]=(Button)findViewById(R.id.b5);
        board[1][2]=(Button)findViewById(R.id.b6);
        board[2][0]=(Button) findViewById(R.id.b7);
        board[2][1]=(Button)findViewById(R.id.b8);
        board[2][2]=(Button)findViewById(R.id.b9);
        label=(TextView)findViewById(R.id.textView);
    }
    private boolean check_winner(String player){
        if (board[0][0].getText()==player && board[0][1].getText()==player && board[0][2].getText()==player){
            return true;
        }

        if (board[1][0].getText()==player && board[1][1].getText()==player && board[1][2].getText()==player){
            return true;
        }

        if (board[2][0].getText()==player && board[2][1].getText()==player && board[2][2].getText()==player){
            return true;
        }

        if (board[0][0].getText()==player && board[1][1].getText()==player && board[2][2].getText()==player){
            return true;
        }

        if (board[0][2].getText()==player && board[1][1].getText()==player && board[2][0].getText()==player){
            return true;
        }
        if (board[0][0].getText()==player && board[1][0].getText()==player && board[2][0].getText()==player){
            return true;
        }
        if (board[0][1].getText()==player && board[1][1].getText()==player && board[2][1].getText()==player){
            return true;
        }

        if (board[0][2].getText()==player && board[1][2].getText()==player && board[2][2].getText()==player){
            return true;
        }

        return false;
    }

    public void buttonClickHandler(View v) {
        Button b = (Button) v;
        b.setText(turn);

        if (check_winner(turn)) {
            label.setText("Winner is " + turn);
            label.setTextSize(30);
        }

        if (turn == "X") {
            turn = "O";
        } else {
            turn = "X";
        }
    }

}