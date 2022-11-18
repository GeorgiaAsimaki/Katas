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

    public ArrayList<String>  five_hours_row_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(five_hours_row(0).equals("OOOO"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(five_hours_row(23).equals("RRRR"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(five_hours_row(2).equals("OOOO"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");
        if(five_hours_row(8).equals("ROOO"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if(five_hours_row(16).equals("RRRO"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");
        return ar;
    }
    public ArrayList<String> every_second_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(every_second(00) == "Y")
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(every_second(59) == "O")
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        return ar;
    }
    public ArrayList<String> single_hours_row_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(single_hours_row(0).equals("OOOO"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(single_hours_row(23).equals("RRRO"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(single_hours_row(2).equals("RROO"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        if(single_hours_row(8).equals("RRRO"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if(single_hours_row(14).equals("RRRR"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");

        return ar;
    }
    public ArrayList<String> five_minutes_row_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(five_minutes_row(0).equals("OOOOOOOOOOO"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(five_minutes_row(59).equals("YYRYYRYYRYY"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(five_minutes_row(4).equals("OOOOOOOOOOO"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        if(five_minutes_row(23).equals("YYRYOOOOOOO"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if(five_minutes_row(35).equals("YYRYYRYOOOO"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");

        return ar;
    }
    public ArrayList<String> single_minutes_row_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(single_minutes_row(0).equals("OOOO"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(single_minutes_row(59).equals("YYYY"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(single_minutes_row(32).equals("YYOO"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        if(single_minutes_row(34).equals("YYYY"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if(single_minutes_row(35).equals("OOOO"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");

        return ar;
    }
    public ArrayList<String> entire_berlin_clock_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if((every_second(0) + five_hours_row(0)
                + single_hours_row(0) + five_minutes_row(0)
                + single_minutes_row(0)).equals("YOOOOOOOOOOOOOOOOOOOOOOO"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if((every_second(59) + five_hours_row(23)
                + single_hours_row(23) + five_minutes_row(59)
                + single_minutes_row(59)).equals("ORRRRRRROYYRYYRYYRYYYYYY"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if((every_second(6) + five_hours_row(16)
                + single_hours_row(16) + five_minutes_row(50)
                + single_minutes_row(50)).equals("YRRROROOOYYRYYRYYRYOOOOO"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        if((every_second(1) + five_hours_row(11)
                + single_hours_row(11) + five_minutes_row(37)
                + single_minutes_row(37)).equals("ORROOROOOYYRYYRYOOOOYYOO"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");


        return ar;
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


        System.out.println("1st Test for Every Second is :  " + berlinClock.every_second_test().get(0));
        System.out.println("2nd Test for Every Second is :  " + berlinClock.every_second_test().get(1));
        System.out.println("////////////////");
        System.out.println("1st Test for Five Hours Row is :  " + berlinClock.five_hours_row_test().get(0));
        System.out.println("2nd Test for Five Hours Row is :  " + berlinClock.five_hours_row_test().get(1));
        System.out.println("3rd Test for Five Hours Row is :  " + berlinClock.five_hours_row_test().get(2));
        System.out.println("4th Test for Five Hours Row is :  " + berlinClock.five_hours_row_test().get(3));
        System.out.println("5th Test for Five Hours Row is :  " + berlinClock.five_hours_row_test().get(4));
        System.out.println("////////////////");
        System.out.println("1st Test for Single Hours Row is :  " + berlinClock.single_hours_row_test().get(0));
        System.out.println("2nd Test for Single Hours Row is :  " + berlinClock.single_hours_row_test().get(1));
        System.out.println("3rd Test for Single Hours Row is :  " + berlinClock.single_hours_row_test().get(2));
        System.out.println("4th Test for Single Hours Row is :  " + berlinClock.single_hours_row_test().get(3));
        System.out.println("5th Test for Single Hours Row is :  " + berlinClock.single_hours_row_test().get(4));
        System.out.println("////////////////");
        System.out.println("1st Test for Five Minutes Row is :  " + berlinClock.five_minutes_row_test().get(0));
        System.out.println("2nd Test for Five Minutes Row is :  " + berlinClock.five_minutes_row_test().get(1));
        System.out.println("3rd Test for Five Minutes Row is :  " + berlinClock.five_minutes_row_test().get(2));
        System.out.println("4th Test for Five Minutes Row is :  " + berlinClock.five_minutes_row_test().get(3));
        System.out.println("5th Test for Five Minutes Row is :  " + berlinClock.five_minutes_row_test().get(4));
        System.out.println("////////////////");
        System.out.println("1st Test for Single Minutes Row is :  " + berlinClock.five_minutes_row_test().get(0));
        System.out.println("2nd Test for Single Minutes Row is :  " + berlinClock.five_minutes_row_test().get(1));
        System.out.println("3rd Test for Single Minutes Row is :  " + berlinClock.five_minutes_row_test().get(2));
        System.out.println("4th Test for Single Minutes Row is :  " + berlinClock.five_minutes_row_test().get(3));
        System.out.println("5th Test for Single Minutes Row is :  " + berlinClock.five_minutes_row_test().get(4));
        System.out.println("////////////////");
        System.out.println("1st Test for Entire Berlin Clock is  :  " + berlinClock.entire_berlin_clock_test().get(0));
        System.out.println("2nd Test for Entire Berlin Clock is  :  " + berlinClock.entire_berlin_clock_test().get(1));
        System.out.println("3rd Test for Entire Berlin Clock is  :  " + berlinClock.entire_berlin_clock_test().get(2));
        System.out.println("4th Test for Entire Berlin Clock is  :  " + berlinClock.entire_berlin_clock_test().get(3));



        String entireBerlinClock = berlinClock.every_second(seconds) + berlinClock.five_hours_row(hours)
                + berlinClock.single_hours_row(hours) + berlinClock.five_minutes_row(minutes) + berlinClock.single_minutes_row(minutes);
        System.out.println(entireBerlinClock);





    }
}