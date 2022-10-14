package homwork2;

import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number =  rand.nextInt(9_999) + 1;
        int lastDigit = number % 10;
        switch (lastDigit){
            case 1:
                System.out.println(number + "доллар");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(number + "доллара");
                break;
            default:
                System.out.println(number + "долларов");


        }

    }


    }

