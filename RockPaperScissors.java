package BerlinClock;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

    public String findWinner(String player1, String player2) {
        String winner;
        if (player1.equals("R")) {
            if (player2.equals("R")) {
                winner = "It's a draw!";
            } else if (player2.equals("P")) {
                winner = "Winner = Player 2";
            } else {
                winner = "Winner = Player 1";
            }
        } else if (player1.equals("P")) {
            if (player2.equals("R")) {
                winner = "Winner = Player 1";
            } else if (player2.equals("P")) {
                winner = "It's a draw!";
            } else {
                winner = "Winner = Player 2";
            }

        } else {
            if (player2.equals("R")) {
                winner = "Winner = Player 2";
            } else if (player2.equals("P")) {
                winner = "Winner = Player 1";
            } else {
                winner = "It's a draw!";
            }

        }
        return winner;
    }

    public ArrayList<String> rock_paper_scrissors_test() {
        ArrayList<String> ar = new ArrayList<String>();
        if (findWinner("R", "S").equals("Winner = Player 1"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if (findWinner("S", "R").equals("Winner = Player 2"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if (findWinner("S", "P").equals("Winner = Player 1"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");
        if (findWinner("P", "S").equals("Winner = Player 2"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if (findWinner("P", "R").equals("Winner = Player 1"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");
        if (findWinner("R", "P").equals("Winner = Player 2"))
            ar.add("6th test succeeded");
        else
            ar.add("6th test not succeeded");
        if (findWinner("R", "R").equals("It's a draw!"))
            ar.add("7th test succeeded");
        else
            ar.add("7th test not succeeded");
        if (findWinner("P", "P").equals("It's a draw!"))
            ar.add("8th test succeeded");
        else
            ar.add("8th test not succeeded");

        if (findWinner("S", "S").equals("It's a draw!"))
            ar.add("9th test succeeded");
        else
            ar.add("9th test not succeeded");
        return ar;
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Player 1: Enter your move (R,P,S)");
        String player1 = myObj.nextLine().toUpperCase();
        while (!(player1.equals("P") || player1.equals("R") || player1.equals("S"))) {
            System.out.println("Please enter P, Q or S");
            player1 = myObj.nextLine().toUpperCase();
        }
        System.out.println("Player 2: Enter your move (R,P,S)");
        String player2 = myObj.nextLine().toUpperCase();
        while (!(player2.equals("P") || player2.equals("R") || player2.equals("S"))) {
            System.out.println("Please enter P, Q or S");
            player2 = myObj.nextLine().toUpperCase();
        }

        RockPaperScissors rps = new RockPaperScissors();
        System.out.println("1st Test for RPS is :  " + rps.rock_paper_scrissors_test().get(0));
        System.out.println("2nd Test for RPS is :  " + rps.rock_paper_scrissors_test().get(1));
        System.out.println("3rd Test for RPS is :  " + rps.rock_paper_scrissors_test().get(2));
        System.out.println("4th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(3));
        System.out.println("5th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(4));
        System.out.println("6th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(5));
        System.out.println("7th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(6));
        System.out.println("8th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(7));
        System.out.println("9th Test for RPS is :  " + rps.rock_paper_scrissors_test().get(8));
        String winner = rps.findWinner(player1, player2);
        System.out.println("The outcome is: " + winner);

    }
}
