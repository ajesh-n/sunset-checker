package com.example.sunsetchecker;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        ArrayList<House> houses = new ArrayList<>();
        System.out.print("Enter number of houses");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter id of house");
            String id = scanner.next();
            House house = new House();
            if(id != null) {
                house.setId(id);
                System.out.println("Enter height of house " + id);
                int height = scanner.nextInt();
                if(height != 0) {
                    house.setHeight(height);
                    houses.add(house);
                }
            }
        }
        for (int i = 0; i < houses.size(); i++) {
            int j;
            for(j=i; j < houses.size()-1; j++){
                if(houses.get(i).getHeight() < houses.get(j+1).getHeight()){
                    break;
                }
            }
            if(j==houses.size()-1){
                System.out.print(" "+houses.get(i).getId());
            }
        }
    }
}