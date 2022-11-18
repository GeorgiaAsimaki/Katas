package BerlinClock.FizzBuzz;

import BerlinClock.BerlinClock;

import java.util.Scanner;

public class FizzBuzz {

    public String multipleOf(Integer number) {
        String out = "";
        if (number%3==0){
            out = "fizz";

            if (number%5==0){
                out = "fizz buzz";

                if(number%7==0){
                    out = "fizz buzz pop";
                }
            }
            else if(number%7==0){
                out = "fizz pop";
            }
        }
        else if (number%5==0){
            out = "buzz";
            if(number%7==0){
                out = "buzz pop";
            }
        } else if (number%7==0) {
            out = "pop";
        }
        else
            out = Integer.toString(number);


        return out;
    }

    public String Custom(String nums, String names, Integer number) {
        String[] name = names.split(",");
        String[] num = nums.split(",");

        String out = "";

        Integer n;

        for(int i=0; i<name.length;i++) {
            n = Integer.valueOf(num[i]);
            if (number%n==0){
                out = out + " " + name[i];
            }
        }

        if (out==""){
            out = Integer.toString(number);
        }
        return out;
    }


    public static void main(String[] args){

        Integer number;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter 1 for Custom or 2 for not custom");
        String input = myObj.nextLine();
        if (input=="2") {
            Scanner myObjN = new Scanner(System.in);
            System.out.println("Enter Number");
            String inputN = myObjN.nextLine();
            number = Integer.valueOf(inputN);
            FizzBuzz fizzBuzz = new FizzBuzz();
            //System.out.println(fizzBuzz.multipleOfThree(number) + " " + fizzBuzz.multipleOfFive(number));
            System.out.println(fizzBuzz.multipleOf(number));
        }
        else{
            Scanner myObjC = new Scanner(System.in);
            System.out.println("Enter Numbers divided by commas that you want to check their multiples");
            String inputNumbers = myObjC.nextLine();
            System.out.println("Enter the outputs for each multiple divided by commas");
            String inputStrings = myObjC.nextLine();

            System.out.println("Enter Number");
            String inputC = myObjC.nextLine();
            number = Integer.valueOf(inputC);

            FizzBuzz fizzBuzz = new FizzBuzz();

            System.out.println(fizzBuzz.Custom(inputNumbers,inputStrings, number));
        }



    }
}
