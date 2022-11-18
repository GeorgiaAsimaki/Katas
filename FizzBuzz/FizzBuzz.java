package BerlinClock.FizzBuzz;

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


    public static void main(String[] args){

        Integer number;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");
        String input = myObj.nextLine();
        number = Integer.valueOf(input);
        FizzBuzz fizzBuzz = new FizzBuzz();
        //System.out.println(fizzBuzz.multipleOfThree(number) + " " + fizzBuzz.multipleOfFive(number));
        System.out.println(fizzBuzz.multipleOf(number));

    }
}
