package day1;
/* 
 * The newly-improved calibration document consists of lines of text; 
 * each line originally contained a specific calibration value that 
 * the Elves now need to recover. On each line, the calibration value 
 * can be found by combining the first digit and the last digit (in that order)
 *  to form a single two-digit number.
 *
 * For example:
 * 1abc2
 * pqr3stu8vwx
 * a1b2c3d4e5f
 * treb7uchet
 * In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.
 * Consider your entire calibration document. What is the sum of all of the calibration values? 
 */


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
        for(int i = str.length() - 1; i >=0; i--) {
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
            String num = firstDigit(line) + "" + lastDigit(line);
            sum = sum + Integer.parseInt(num);
        }
        sc.close();
        } catch (IOException ie) {
            ie.printStackTrace(); 
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        System.out.println(sum); // 54304
    }
}
