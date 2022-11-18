package BerlinClock;

import java.util.Scanner;

public class RockPaperScissors {

    public String findWinner(String player1, String player2){
        String winner;
        if(player1.equals("R")){
            if(player2.equals("R")){
                winner = "It's a draw!";
            }
            else if(player2.equals("P")){
                winner = "Winner = Player 2";
            }
            else{
                winner = "Winner = Player 1";
            }
        }
        else if (player1.equals("P")){
            if(player2.equals("R")){
                winner = "Winner = Player 1";
            }
            else if(player2.equals("P")){
                winner = "It's a draw!";
            }
            else{
                winner = "Winner = Player 2";
            }

        }
        else{
            if(player2.equals("R")){
                winner = "Winner = Player 2";
            }
            else if(player2.equals("P")){
                winner = "Winner = Player 1";
            }
            else{
                winner = "It's a draw!";
            }

        }
        return winner;
    }

    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Player 1: Enter your move (R,P,S)");
        String player1 = myObj.nextLine().toUpperCase();
        while(!(player1.equals("P") || player1.equals("R") || player1.equals("S"))){
            System.out.println("Please enter P, Q or S");
            player1 = myObj.nextLine().toUpperCase();
        }
        System.out.println("Player 2: Enter your move (R,P,S)");
        String player2 = myObj.nextLine().toUpperCase();
        while(!(player2.equals("P") || player2.equals("R") || player2.equals("S"))){
            System.out.println("Please enter P, Q or S");
            player2 = myObj.nextLine().toUpperCase();
        }

        RockPaperScissors rps = new RockPaperScissors();
        String winner = rps.findWinner(player1,player2);
        System.out.println("The outcome is: " + winner);

    }
}
