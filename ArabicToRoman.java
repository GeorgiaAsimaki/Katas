package BerlinClock;

import java.util.ArrayList;
import java.util.Scanner;

public class ArabicToRoman {

    public String convertAtoR(Integer arabic) {
        String roman = "";

        while (arabic > 0)
            if ((arabic/1000) != 0) {
                roman = roman + "M";
                arabic = arabic - 1000;
                //System.out.println("1000");

            } else if ((arabic / 500) != 0 ) {
                if ((arabic/900)!=0) {
                    roman = roman + "CM";
                    arabic = arabic - 900;
                    //System.out.println("900");
                } else {
                    roman = roman + "D";
                    arabic = arabic - 500;
                    //System.out.println("500");
                }
            } else if ((arabic / 100) != 0 ) {
                roman = roman + "C";
                arabic = arabic - 100;
                //System.out.println("100");
            } else if ((arabic / 50) != 0 ) {
                if ((arabic/90)!=0) {
                    roman = roman + "XC";
                    arabic = arabic - 90;
                } else {
                    roman = roman + "L";
                    arabic = arabic - 50;
                    //System.out.println("50");
                }
            } else if ((arabic / 10) != 0) {
                roman = roman + "X";
                arabic = arabic - 10;
                //System.out.println("10");
            } else if ((arabic / 5) != 0) {
                if ((arabic/9)!=0) {
                    roman = roman + "IX";
                    arabic = arabic - 9;
                } else {
                    roman = roman + "V";
                    arabic = arabic - 5;
                    //System.out.println("5");
                }
            } else {
                if ((arabic/4)!=0) {
                    roman = roman + "IV";
                    arabic = arabic - 4;
                } else {
                    roman = roman + "I";
                    arabic = arabic - 1;
                    //System.out.println("1");
                }
            }
        return roman;
    }
    public ArrayList<String> arabicToRomanTests(){
        ArrayList<String> ar = new ArrayList<String>();
        if(convertAtoR(1000).equals("M"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(convertAtoR(500).equals("D"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(convertAtoR(100).equals("C"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");
        if(convertAtoR(50).equals("L"))
            ar.add("4th test succeeded");
        else
            ar.add("4th test not succeeded");
        if(convertAtoR(10).equals("X"))
            ar.add("5th test succeeded");
        else
            ar.add("5th test not succeeded");
        if(convertAtoR(4).equals("IV"))
            ar.add("6th test succeeded");
        else
            ar.add("6th test not succeeded");
        if(convertAtoR(9).equals("IX"))
            ar.add("7th test succeeded");
        else
            ar.add("7th test not succeeded");
        if(convertAtoR(1).equals("I"))
            ar.add("8th test succeeded");
        else
            ar.add("8th test not succeeded");
        if(convertAtoR(5).equals("V"))
            ar.add("9th test succeeded");
        else
            ar.add("9th test not succeeded");

        return ar;
    }

    public Integer convertRtoA (String roman){
        Integer arabic=0;
        char prev = 'M';
        char[] chars = roman.toCharArray();
        for (char ch: chars){
            if(ch=='M'){
                if (prev=='C'){
                    arabic = arabic + 800;
                }
                else {
                    arabic = arabic + 1000;

                }
                prev = ch;
                //System.out.println(arabic);
            }
            else if(ch=='D'){
                if (prev=='C'){
                    arabic = arabic + 300;
                }
                else{
                    arabic = arabic + 500;
                }
                prev=ch;
                //System.out.println(arabic);
            }
            else if(ch=='C'){
                if (prev=='X'){
                    arabic = arabic + 80;
                }
                else{
                    arabic = arabic + 100;
                }
                prev=ch;
                //System.out.println(arabic);
            }
            else if(ch=='L'){
                if (prev=='X'){
                    arabic = arabic + 30;
                }
                else{
                    arabic = arabic + 50;
                }
                prev=ch;
                //System.out.println(arabic);
            }
            else if(ch=='X'){
                if (prev =='I'){
                    arabic = arabic + 8;
                }
                else{
                    arabic = arabic + 10;
                }
                prev=ch;
                //System.out.println(arabic);
            }
            else if(ch=='V'){
                if (prev=='I'){
                    arabic = arabic + 3;
                }
                else{
                    arabic = arabic + 5;
                }
                prev=ch;
                //System.out.println(arabic);
            }
            else if(ch=='I'){
                arabic = arabic + 1;
                prev=ch;
                //System.out.println(arabic);
            }
        }
        return arabic;
    }

    public static void main(String[] args){

        Scanner myObjChoose = new Scanner(System.in);
        System.out.println("Enter 1 if you are going to enter arabic number or 2 for roman numerical");
        String choose = myObjChoose.nextLine();
        while (!(choose.equals("1") || choose.equals("2"))){
            System.out.println("Enter only 1 or 2!");
            choose = myObjChoose.nextLine();
        }

        if (choose.equals("1")) {

            Integer arabic;
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter number in Arabic");
            String input = myObj.nextLine();
            arabic = Integer.valueOf(input);
            System.out.println("The roman equivalent is");
            ArabicToRoman n = new ArabicToRoman();
            System.out.println("Test 1 for Arabic to Roman : " + n.arabicToRomanTests().get(0) );
            System.out.println("Test 2 for Arabic to Roman : " + n.arabicToRomanTests().get(1) );
            System.out.println("Test 3 for Arabic to Roman : " + n.arabicToRomanTests().get(2) );
            System.out.println("Test 4 for Arabic to Roman : " + n.arabicToRomanTests().get(3) );
            System.out.println("Test 5 for Arabic to Roman : " + n.arabicToRomanTests().get(4) );
            System.out.println("Test 6 for Arabic to Roman : " + n.arabicToRomanTests().get(5) );
            System.out.println("Test 7 for Arabic to Roman : " + n.arabicToRomanTests().get(6) );
            System.out.println("Test 8 for Arabic to Roman : " + n.arabicToRomanTests().get(7) );
            System.out.println("Test 9 for Arabic to Roman : " + n.arabicToRomanTests().get(8) );


            String roman = n.convertAtoR(arabic);
            System.out.println("The outcome is: " + roman);
        }
        else{
            String roman;
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter number in Arabic");
            String input = myObj2.nextLine();
            roman = input.toUpperCase();
            System.out.println("The arabic equivalent is");
            ArabicToRoman n = new ArabicToRoman();
            Integer arabic = n.convertRtoA(roman);
            System.out.println("The outcome is: " + roman);
        }

    }
}
