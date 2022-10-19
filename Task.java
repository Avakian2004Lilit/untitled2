package homwork;

import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(50);
        Scanner scanner = new Scanner(System.in);
        do {
            int sumNumber = scanner.nextInt();
       if(number > sumNumber){

        }

        } while (sumNumber != number) ;
        System.out.println(number);



    }
}
