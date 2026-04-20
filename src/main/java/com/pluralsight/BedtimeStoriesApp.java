package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStoriesApp {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of a story: ");
            String storyName = scanner.nextLine();

            int lineNumber = 1;
            String line;

            FileReader fr = new FileReader(storyName);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Could not open that file. Check the name and try again.");


        }
    }
}

