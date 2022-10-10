package classwork7;

import java.util.Random;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Random rand = new Random();

        boolean Eagle = true;
        boolean Tails = false;
        System.out.println(rand.nextBoolean());

    }

    static boolean fellout(){
        Random random= new Random();
        boolean Eagle = random.nextBoolean();
        boolean Tails = random.nextBoolean();
        return Eagle && Tails;


    }

    public static void main(String[] args) {
        Random random = new Random();
          random.nextInt(2024);


    }

    }
