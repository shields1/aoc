package day1;
/*
 * Your calculation isn't quite right. It looks like some of the digits are actually spelled out with letters: 
 * one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".
 * Equipped with this new information, you now need to find the real first and last digit on each line. For example:
 * 
 * two1nine
 * eightwothree
 * abcone2threexyz
 * xtwone3four
 * 4nineeightseven2
 * zoneight234
 * 7pqrstsixteen
 * In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76. Adding these together produces 281.
 * 
 * What is the sum of all of the calibration values? 
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class part2 {
    private static final String nums[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};


    private static String findNum(String str) {
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                num += str.charAt(i);
                continue;
            } 
            for (int j = 0; j < nums.length; j++) {
                if(str.substring(i).startsWith(nums[j])) {
                    num += j + 1;  
                    i += nums[j].length() - 2;        
                    break;
                }
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int sum = 0;
        try {
            File file = new File(".\\src\\day1\\input.txt");
            Scanner sc = new Scanner(file);  
            
            while(sc.hasNextLine()) {
              String line = sc.nextLine();
              String num = findNum(line);
              sum += Integer.parseInt(num.charAt(0) + "" + num.charAt(num.length() - 1));
            }
        sc.close();
        } catch (IOException ie) {
            ie.printStackTrace(); 
        } catch (Exception e) {
            e.printStackTrace(); 
        }
        System.out.println(sum); // 54418
    }
}
