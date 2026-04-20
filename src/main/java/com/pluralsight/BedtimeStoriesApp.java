package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStoriesApp {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of a story: ");
            String storySelection = scanner.nextLine();

            FileReader fr = new FileReader(storySelection);
            BufferedReader br = new BufferedReader(fr);

            while ((storySelection = br.readLine()) != null){
                System.out.println(storySelection);
            }

        } catch (Exception e) {
            System.out.println("Oh well!");



        }
    }
}
