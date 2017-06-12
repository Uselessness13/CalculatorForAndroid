package com.example.uselesss.myapplication;

import android.widget.Button;

/**
 * Created by Useless on 12.06.2017.
 */

public class Piece {
    int number;
    double price;
    double summ;

    Piece(double price){
        this.number = 0;
        this.price = price;
        this.summ = this.number*this.price;
    }

    public void recount(){
        summ = price*number;
    }

    public void add(){
        number++;
        recount();
    }

    public void remove(){
        number--;
        recount();
    }

    public double getSumm() {
        return summ;
    }
}
