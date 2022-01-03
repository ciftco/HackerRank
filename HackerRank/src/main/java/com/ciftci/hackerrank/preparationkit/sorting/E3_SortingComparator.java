package com.ciftci.hackerrank.preparationkit.sorting;

import java.util.Arrays;
import java.util.Comparator;

//https://www.hackerrank.com/challenges/ctci-comparator-sorting/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

public class E3_SortingComparator {
    public static void main(String[] args) {

        Player[] players = new Player[5];

        Player p1 = new Player("aleksa", 150);
        players[0] = p1;
        Player p2 = new  Player("amy", 100);
        players[1] = p2;
        Player p3 = new Player("david", 100);
        players[2] = p3;
        Player p4 = new Player("aakansha", 75);
        players[3] = p4;
        Player p5 = new Player("heraldo", 50);
        players[4] = p5;

        Checker comparator = new Checker();
        Arrays.sort(players, comparator);
        System.out.println(players.toString());

        int i = 0;
        /*
            aleksa 150
            amy 100
            david 100
            aakansha 75
            heraldo 50
         */
    }




}

class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {



        if(a.score > b.score ){
            return -1;
        }

        if(a.score < b.score){
            return 1;
        }

        return a.name.compareTo(b.name);

    }
}

