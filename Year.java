package Homwork13okt;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstYear = scanner.nextInt();
        int secondYYear = scanner.nextInt();
        for (int i = firstYear; i <= secondYYear; i++){
            if( i % 4 == 0 ){
                System.out.println(i);
            }

                for (int i = 10; i < 100; i++){
                    if(i % 4 == 0 && i % 6 !=0){
                        System.out.println(i);
                    }
                int sum = 0;
                    for (int i = 0; i < 100; i++){
                        sum = sum + i;
                        System.out.println(sum);

                }
                    int c = -10;
                    int d = -40;
                    for (int i = c; i >= d; i--){
                        System.out.println(i);
                    }

                    for (int i = 10; i < 100; i++){
                        if (i % 4 == 0 && i % 6 != 0){
                            System.out.println(i);
                        }

                        for (int i = 13; i < 100; i++){
                            if (i % 2 !=0 && i % 13 == 0){
                                System.out.println(i);
                            }
                        }
                    }
            }
        }
    }
}
