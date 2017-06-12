package com.example.uselesss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Piece> pieces;
    TextView summ;
    Button plus;
    Button minus;
    Piece piece;
    int s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s = 0;
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        summ = (TextView) findViewById(R.id.summ);
        piece = new Piece(2.3);
//        pieces.add(new Piece(1.1));
        summ.setText("" + piece.getSumm());
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                piece.add();
                summ.setText("" + piece.getSumm());
            }
        });
    }

    public void onClick(View view) {
        piece.remove();
        summ.setText("" + piece.getSumm());
    }
}
