package io.zipcoder.fundamentals.day2.lab1;
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args){
    	Scanner stdin = new Scanner(System.in);
    	String userName;
    	System.out.print("Please enter your name: ");
    	userName = stdin.nextLine();
    		if (userName.equals("Alice")) 
    			System.out.print("Hello, " + userName);
    		if (userName.equals("Bob"))
    			System.out.print("Hello, " + userName);
    	stdin.close();
    }
}
