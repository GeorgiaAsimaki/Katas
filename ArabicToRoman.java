package BerlinClock;

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

    public Integer convertRtoA (String roman){
        Integer arabic=0;
        char[] chars = roman.toCharArray();
        for (char ch: chars){
            if(){

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
            String roman = n.convertAtoR(arabic);
            System.out.println("The outcome is: " + roman);
        }
        else{
            String roman;
            Scanner myObj2 = new Scanner(System.in);
            System.out.println("Enter number in Arabic");
            String input = myObj2.nextLine();
            roman = Integer.valueOf(input);
            System.out.println("The arabic equivalent is");
            ArabicToRoman n = new ArabicToRoman();
            Integer arabic = n.convertRtoA(roman);
            System.out.println("The outcome is: " + roman);
        }

    }
}
