package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is your first name?");
        Scanner inputScanner = new Scanner(System.in);
        String firstName = inputScanner.nextLine();
        //System.out.println("Hello, " + firstName);
        System.out.println("What is your last name?");
        String lastName = inputScanner.nextLine();
        System.out.println("Number of Siblings");
        int numOfSiblings = inputScanner.nextInt();
        System.out.println("What is your age?");
        int age = inputScanner.nextInt();
        //System.out.println(firstName + " you are " + age + " years old");
        System.out.println("What is your birth month as a number");

        int birthMonth = inputScanner.nextInt();
        System.out.println("What is your favorite Color?");
        inputScanner.nextLine();
        String favColor = inputScanner.nextLine();
        System.out.println("Your favorite color is: " + favColor);
        inputScanner.close();

        int retireYears;
        if(age%2 == 0){
            retireYears = 12;
        }
        else{
            retireYears = 14;
        }
        String vacationHome;
        if(numOfSiblings < 0){
            vacationHome = "Chernobyl, Ukraine";
        }
        else if(numOfSiblings == 0){
            vacationHome = "Boca Raton, FL";
        }
        else if(numOfSiblings == 1){
            vacationHome = "Nassau, Bahamas";
        }
        else if(numOfSiblings == 2){
            vacationHome = "Ponta Negra,Brazil";
        }
        else if(numOfSiblings == 3){
            vacationHome = "Portland, Oregon";
        }
        else{
            vacationHome = "Baton Rouge, LA";
        }
        String car;
        switch(favColor.toLowerCase()){
            case "red":
                car = "Maserati";
                break;
            case "orange":
                car = "stallion";
                break;
            default:
                car = "skateboard";
                break;
        }
        float bankBalance;
        if(birthMonth >= 1 && birthMonth <= 4){
            bankBalance = 256000.76f;
        }
        else if(birthMonth >= 5 && birthMonth <=8){
            bankBalance = 3687105.42f;
        }
        else if(birthMonth >= 9 && birthMonth <= 12){
            bankBalance = 86.23f;
        }
        else{
            bankBalance = 0;
        }
        String fortune = "";
        fortune = firstName + " " + lastName;
        fortune = fortune + " will retire in " + retireYears + " years";
        fortune += " with $" + bankBalance + " in the bank, ";
        fortune += "a vacation home in " + vacationHome + ",";
        fortune += " and travel by " + car + ".";

        System.out.println(fortune);



    }
}
