package homwork2_13okt;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        int sum = 0;
        int index = 0;
        for (int i = 1; i < 100; i++){
            if (i % 2 != 0){
                sum = (sum + i);
                index++;
                System.out.println(sum/index);
            }

            int a = 5;
            int b = 3;
            int result = 0;
            for (int i = 1; i <= b; i++){
                System.out.println(result = b + result);
            }

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(factorial(a));
        }
        public static int factorial(int b){
            if(b==1)return 1;
            return b * factorial(b - 1);

        }

    }

    }
