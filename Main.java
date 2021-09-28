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
playGame(limit, randomNum);



  }
  static void playGame(int limit, int goal)
  {
    Scanner g = new Scanner(System.in);
    System.out.println("Guess a number between 0 and "+limit);
    int guess = -1;
    int tries = 1;

    while (guess != goal)
    {
      if(tries>1)
      {
        System.out.println("Enter your next guess: ");
        guess = g.nextInt();
      }
      else {
        System.out.println("Enter your first guess: ");
        guess = g.nextInt();

      }
      if(guess == goal)
      {
        System.out.println("Great job! This win took you " + tries + " tries!");

      }
      else if (guess>goal)
      {
        System.out.println("Guess a lower number!");
        tries = tries +1;

      }
      else {
        System.out.println("Guess a higher number!");
        tries = tries +1;
      }
    }


  }
}
