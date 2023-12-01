package day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class part1 {
    
    private static char firstDigit(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                return str.charAt(i);
            }
        }
        return '0';
    }
    
    private static char lastDigit(String str) {
        for(int i = str.length() -1; i >=0; i--) {
            if(Character.isDigit(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        int sum = 0;
        try {
        File file = new File(".\\src\\day1\\input.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String num = firstDigit(line) + "" +  lastDigit(line);
            sum = sum + Integer.parseInt(num);
        }
        sc.close();
        } catch (IOException ie) {
            ie.printStackTrace(); 
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        System.out.println("Sum is : " + sum);
    }
}
