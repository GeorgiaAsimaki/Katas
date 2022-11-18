package BerlinClock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BerlinClock {

    public String single_minutes_row(Integer minutes) {
        String row = "";
        int yellows = minutes % 5;
        Integer zeros = 4-yellows;
        while(yellows>0){

            row = row + 'Y';
            yellows = yellows - 1;
        }
        while(zeros>0){
            row = row +"O";
            zeros = zeros -1;
        }
        return row;
    }
    public String five_minutes_row(Integer minutes){
        String row = "";
        Integer up = minutes/5;
        Integer k=0;
        Integer zeros= 11-up;
        while(up>0){
            if(k!=2){
                row = row + 'Y';
                up = up - 1;
                k=k+1;
            }
            else {
                row = row + 'R';
                up = up-1;
                k=0;
            }
        }
        while(zeros>0){
            row = row +"O";
            zeros = zeros -1;
        }
        return row;
    }
    public String single_hours_row(Integer hours) {
        String row = "";
        int reds = hours % 5;
        Integer zeros = 4-reds;
        while(reds>0){

            row = row + 'R';
            reds = reds - 1;
        }
        while(zeros>0){
            row = row +"O";
            zeros = zeros -1;
        }
        return row;
    }


    public String five_hours_row(Integer hours){
        String row = "";
        Integer up = hours/5;
        Integer zeros= 4-up;
        while(up>0){

            row = row + 'R';
            up = up - 1;

        }
        while(zeros>0){
            row = row +"O";
            zeros = zeros -1;
        }
        return row;
    }
    public String every_second(Integer seconds){

        Integer up = seconds % 2;
        if(up == 0)
            return "Y";
        else
            return "O";

    }





    public static void main(String[] args){

        Integer hours;
        Integer minutes;
        Integer seconds;


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the digital time");
        String time = myObj.nextLine();
        System.out.println("Digital time is : " + time);

        String[] newTime = time.split(":");
        hours = Integer.valueOf(newTime[0]);
        minutes = Integer.valueOf(newTime[1]);
        seconds = Integer.valueOf(newTime[2]);
        BerlinClock berlinClock = new BerlinClock();
        String entireBerlinClock = berlinClock.every_second(seconds) + berlinClock.five_hours_row(hours)
                + berlinClock.single_hours_row(hours) + berlinClock.five_minutes_row(minutes) + berlinClock.single_minutes_row(minutes);
        System.out.println(entireBerlinClock);





    }
}
