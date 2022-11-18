package BerlinClock;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bingo {

    public List<Integer> keys = new ArrayList<Integer>();

    public int rand(int m) {
        int n = (int) (Math.random() * m + 1);
        if (!keys.contains(n)) {
            keys.add(n);
            return n;
        } else {
            return rand(m);
        }
    }

    public static void main(String[] args){



        //Scanner myObj = new Scanner(System.in);
        //System.out.println("Enter the digital time");
        //String time = myObj.nextLine();
        int m = 75;
        Bingo bingo = new Bingo();
        for (int i = 0; i < 75; i++) {
            System.out.println(bingo.rand(m));
        }
        //System.out.println("list: " + bingo.keys);
    }

}
