package BerlinClock;

import java.util.Scanner;

public class ArabicToRoman {

    public String convert(Integer arabic) {
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

    public static void main(String[] args){

        Integer arabic;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number in Arabic");
        String input = myObj.nextLine();
        arabic=Integer.valueOf(input);
        System.out.println("The roman equivalent is");
        ArabicToRoman n = new ArabicToRoman();
        String roman = n.convert(arabic);
        System.out.println("The outcome is: " + roman);

    }
}
