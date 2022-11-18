package BerlinClock;

import java.util.*;

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
    public HashMap<String, List<Integer>> bingoCard(){
        Random rand = new Random();
        List<Integer> keys1 = new ArrayList<Integer>();

        HashMap<String, List<Integer>> bingoCard = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        List<Integer> list5 = new ArrayList<>();

        for(int i =0; i<5;i++){
            int random = rand.nextInt(1,15);
            while (!list1.contains(random) && random!=0 ){
                list1.add(random);

            }
        }
        bingoCard.put("B",list1);
        for(int i =0; i<5;i++){
            int random = rand.nextInt(16,30);
            while (!list2.contains(random) && random!=0 ){
                list2.add(random);

            }
        }
        bingoCard.put("I",list2);
        for(int i =0; i<3;i++){
            int random = rand.nextInt(31,45);
            while (!list3.contains(random) && random!=0 ){
                list3.add(random);

            }
        }
        list3.add(0);
        for(int i =3; i<5;i++){
            int random = rand.nextInt(31,45);
            while (!list3.contains(random) && random!=0 ){
                list3.add(random);

            }
        }
        bingoCard.put("N",list3);
        for(int i =0; i<5;i++){
            int random = rand.nextInt(46,60);
            while (!list4.contains(random) && random!=0 ){
                list4.add(random);

            }
        }
        bingoCard.put("G",list4);
        for(int i =0; i<5;i++){
            int random = rand.nextInt(61,75);
            while (!list5.contains(random) && random!=0 ){
                list5.add(random);

            }
        }
        bingoCard.put("O",list5);
        return bingoCard;



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
        bingo.bingoCard().entrySet().forEach(entry -> {
            entry.getValue().forEach(value ->{
                System.out.println(entry.getKey() + " " + value);
            });

        });
        //System.out.println("list: " + bingo.keys);
    }

}
