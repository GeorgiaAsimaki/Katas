package BerlinClock.FizzBuzz;

import java.util.ArrayList;
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
    public ArrayList<String>  normal_numbers_return_same_number_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(1).equals("1"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(2).equals("fuzz"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(8).equals("fuzz"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_three_return_fizz_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(3).equals("fizz"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(9).equals("fizz"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(123).equals("fizz"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_five_return_buzz_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(5).equals("buzz"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(20).equals("buzz"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(200).equals("buzz"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_three_and_five_return_fizz_buzz_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(15).equals("fizz buzz"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(45).equals("fizz buzz"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(315).equals("fizz buzz"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_seven_return_pop_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(7).equals("pop"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(28).equals("pop"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(77).equals("pop"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_three_and_seven_return_pop_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(21).equals("fizz pop"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(63).equals("fizz pop"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(126).equals("fizz pop"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_five_and_seven_return_buzz_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(35).equals("buzz pop"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(70).equals("buzz pop"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(140).equals("buzz pop"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
    }
    public ArrayList<String>  multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test(){
        ArrayList<String> ar = new ArrayList<String>();
        if(multipleOf(105).equals("buzz pop"))
            ar.add("1st test succeeded");
        else
            ar.add("1st test not succeeded");
        if(multipleOf(210).equals("buzz pop"))
            ar.add("2nd test succeeded");
        else
            ar.add("2nd test not succeeded");
        if(multipleOf(315).equals("buzz pop"))
            ar.add("3rd test succeeded");
        else
            ar.add("3rd test not succeeded");

        return ar;
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
        System.out.println("The 1st test result for normal_numbers_return_same_number_test is : " + fizzBuzz.normal_numbers_return_same_number_test().get(0));
        System.out.println("The 1st test result for normal_numbers_return_same_number_test is : " + fizzBuzz.normal_numbers_return_same_number_test().get(1));
        System.out.println("The 1st test result for normal_numbers_return_same_number_test is : " + fizzBuzz.normal_numbers_return_same_number_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_three_return_fizz_test is : " + fizzBuzz.multiples_of_three_return_fizz_test().get(0));
        System.out.println("The 1st test result for multiples_of_three_return_fizz_test is : " + fizzBuzz.multiples_of_three_return_fizz_test().get(1));
        System.out.println("The 1st test result for multiples_of_three_return_fizz_test is : " + fizzBuzz.multiples_of_three_return_fizz_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_five_return_buzz_test is : " + fizzBuzz.multiples_of_five_return_buzz_test().get(0));
        System.out.println("The 1st test result for multiples_of_five_return_buzz_test is : " + fizzBuzz.multiples_of_five_return_buzz_test().get(1));
        System.out.println("The 1st test result for multiples_of_five_return_buzz_test is : " + fizzBuzz.multiples_of_five_return_buzz_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_three_and_five_return_fizz_buzz_test is : " + fizzBuzz.multiples_of_three_and_five_return_fizz_buzz_test().get(0));
        System.out.println("The 1st test result for multiples_of_three_and_five_return_fizz_buzz_test is : " + fizzBuzz.multiples_of_three_and_five_return_fizz_buzz_test().get(1));
        System.out.println("The 1st test result for multiples_of_three_and_five_return_fizz_buzz_test is : " + fizzBuzz.multiples_of_three_and_five_return_fizz_buzz_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_seven_return_pop_test is : " + fizzBuzz.multiples_of_seven_return_pop_test().get(0));
        System.out.println("The 1st test result for multiples_of_seven_return_pop_test is : " + fizzBuzz.multiples_of_seven_return_pop_test().get(1));
        System.out.println("The 1st test result for multiples_of_seven_return_pop_test is : " + fizzBuzz.multiples_of_seven_return_pop_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_three_and_seven_return_pop_test is : " + fizzBuzz.multiples_of_three_and_seven_return_pop_test().get(0));
        System.out.println("The 1st test result for multiples_of_three_and_seven_return_pop_test is : " + fizzBuzz.multiples_of_three_and_seven_return_pop_test().get(1));
        System.out.println("The 1st test result for multiples_of_three_and_seven_return_pop_test is : " + fizzBuzz.multiples_of_three_and_seven_return_pop_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_five_and_seven_return_buzz_test is : " + fizzBuzz.multiples_of_five_and_seven_return_buzz_test().get(0));
        System.out.println("The 1st test result for multiples_of_five_and_seven_return_buzz_test is : " + fizzBuzz.multiples_of_five_and_seven_return_buzz_test().get(1));
        System.out.println("The 1st test result for multiples_of_five_and_seven_return_buzz_test is : " + fizzBuzz.multiples_of_five_and_seven_return_buzz_test().get(2));
        System.out.println("///////////////////////////////////////");
        System.out.println("The 1st test result for multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test is : " + fizzBuzz.multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test().get(0));
        System.out.println("The 1st test result for multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test is : " + fizzBuzz.multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test().get(1));
        System.out.println("The 1st test result for multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test is : " + fizzBuzz.multiples_of_three_and_five_and_seven_return_fizz_buzz_pop_test().get(2));
        System.out.println("///////////////////////////////////////");



    }
}
