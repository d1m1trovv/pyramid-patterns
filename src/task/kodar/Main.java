package task.kodar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("How many rows do you want in your pyramid?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Which pattern do you want");
        int patternNumber = Integer.parseInt(bufferedReader.readLine());

        if(patternNumber > 0 && 7 > patternNumber) {
            switch (patternNumber) {
                case 1:
                    firstPyramid(rows);
                    break;
                case 2:
                    secondPyramid(rows);
                    break;
                case 3:
                    thirdPyramid(rows);
                    break;
                case 4:
                    forthPyramid(rows);
                    break;
                case 5:
                    fifthPyramid(rows);
                    break;
                case 6:
                    sixthPyramid(rows);
                    break;
            }
        }
        else{
            System.out.println("Pattern doesn't exist");
        }
    }

    static void firstPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int m = rows - i; 0 < m; m--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    static void secondPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int m = rows - i; 0 < m; m--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
    }
    static void thirdPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int m = rows - i; 0 < m; m--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void forthPyramid(int rows){
        for(int i = 1; i < rows + 1; i++){
            for(int m = 0; m < rows - i; m++){
                System.out.print("  ");
            }
            for(int j = 0; j < i + 1; j++){
                if(j <= i - 1){
                    System.out.print((j+1) + " ");
                }
                else{
                    for(int n = i - 1; 0 < n; n--){
                        System.out.print(n + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void fifthPyramid(int rows){
        for(int i = rows; 0 < i; i--){
            for(int m = 0; m < rows - i; m++){
                System.out.print("  ");
            }
            for(int j = 0; j < i + 1; j++){
                if(j <= i - 1){
                    System.out.print((j+1) + " ");
                }
                else{
                    for(int n = i - 1; 0 < n; n--){
                        System.out.print(n + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    static void sixthPyramid(int rows){
        for(int i = 0; i < rows; i++){
            for(int m = 0; m < rows - i; m++){
                System.out.print("  ");
            }
            for(int j = rows - i; j <= rows + i; j++){
                if(j <= rows){
                    System.out.print(j + " ");
                }
                else{
                    for(int n = rows - 1; rows - i <= n; n--){
                        System.out.print(n + " ");
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
}
