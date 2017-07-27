package com.example.uselesss.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity {

    ArrayList<Piece> pieces;
    TextView summ;
    Button plus;
    Button minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieces = new ArrayList<>();
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        summ = (TextView) findViewById(R.id.summ);
        Piece piece = new Piece(2.35);
        pieces.add(piece);
        summ.setText(getSumm());
    }

    public void showToastSumm(){
        Toast toast = Toast.makeText(MainActivity.this, getSumm(), Toast.LENGTH_SHORT);
        toast.show();

    }

    public String getSumm(){
        return String.valueOf(pieces.get(0).getSumm());
    }

    public void  plusButtonClick(View view){
        Log.e("E", "PLUS pressed");
        pieces.get(0).add();
        summ.setText(getSumm());
        showToastSumm();
    }

    public void  minusButtonClick(View view){
        pieces.get(0).remove();
        summ.setText(getSumm());
        showToastSumm();
    }
}
