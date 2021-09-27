/*
Mini Project 1
Partners: Cal Gilson, Ayaan Ajmal,
Date: 9/26/21
*/

import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");
    int limit = s.nextInt();
    Random r = new Random();
    int randomNum = r.nextInt(limit) + 1;

  }
  public static void playGame()
}
}