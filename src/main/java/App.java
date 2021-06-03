/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        String userInput = myApp.readUserInput();
        String password = "abc$123";
        String displayMessage = myApp.passwordCheck(userInput, password);
        String outputString = myApp.generateOutputString(displayMessage);
        myApp.printOutput(outputString);
    }

    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    public String readUserInput(){
        System.out.print("What is the password? ");
        return in.nextLine();
    }

    public String passwordCheck(String userInput, String password){
        if (userInput.equals(password)){
            return "Welcome!";
        }
        else {
            return "I don't know you.";
        }
    }

    public String generateOutputString(String displayMessage){
        return displayMessage;
    }
}
