package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) {
        try (BufferedReader customer = new BufferedReader(new InputStreamReader(System.in))) {

            boolean continueToMenu = true;
            int restaurantSelection;
            // Selecting restaurant
            do {
                System.out.println("Which restaurant would you like to visit? \n" +
                        "1 for Chick-fil-A \n" +
                        "2 for Outback Steakhouse \n");
                String restaurant = customer.readLine();
                restaurantSelection = Integer.parseInt(restaurant);

                if (restaurantSelection == 1) {
                    System.out.println("You have selected Chick-fil-A");
                    continueToMenu = false;
                } else if (restaurantSelection == 2) {
                    System.out.println("You have selected Outback Steakhouse");
                    continueToMenu = false;
                } else {
                    System.out.println("Selection not valid");
                }
            } while(continueToMenu);

            // Viewing menu based upon selected restaurant
            if (restaurantSelection == 1) {
                // add view menu method for selection 1
                // add order method
            } else if (restaurantSelection == 2) {
                // add view menu method for selection 2
                // add order method
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
