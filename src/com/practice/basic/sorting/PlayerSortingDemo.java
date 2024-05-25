package com.practice.basic.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerSortingDemo {
    public static void main(String[] args) {
        List<Player> footballTeam = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67, "Anil", 22);
        Player player3 = new Player(45, "Steven", 24);
        footballTeam.add(player1);
        footballTeam.add(player2);
        footballTeam.add(player3);
        System.out.println("Before Sorting : " + footballTeam);
        Collections.sort(footballTeam);
        System.out.println("After Sorting : " + footballTeam);
        System.out.println("-----------------------------------");

//        Comparator in action
        PlayerRankingComparator playerRankingComparator = new PlayerRankingComparator();
        Collections.sort(footballTeam, playerRankingComparator);
        System.out.println("Comparator sorting based on ranking " + footballTeam);
        System.out.println("-----------------------------------");

        PlayerAgeComparator playerAgeComparator = new PlayerAgeComparator();
        Collections.sort(footballTeam, playerAgeComparator);
        System.out.println("Comparator sorting based on age " + footballTeam);
        System.out.println("-----------------------------------");


        PlayerNameComparator playerNameComparator = new PlayerNameComparator();
        Collections.sort(footballTeam, playerNameComparator);
        System.out.println("Comparator sorting based on name " + footballTeam);
        System.out.println("-----------------------------------");

//        Using java 8
        System.out.println("-----------------------------------");
    }
}
