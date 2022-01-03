package com.ciftci.hackerrank.preparationkit.sorting;


public class Player{
    public String name;
    public int score;

    public Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " "+ score;
    }
}
