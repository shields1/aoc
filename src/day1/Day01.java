package day1;

import java.io.File;
import java.util.Scanner;

public class Day01 {
    
    private final static String DATA_FILE = "input.txt";

    public static void part1() {
        Scanner sc;
        try {
            sc = new Scanner(new File(DATA_FILE));
        } catch (Exception e) {
            System.out.println("Error occured: " + e);
            return;
        }
        System.out.println(sc);



    }
    
    public static void main(String[] args) {
        part1();
    }
}
