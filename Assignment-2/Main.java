/*
* This is the main code that runs with the animal Class.
*
* @author  Alyssia
* @version 1.0
* @since   2025-12-01
*/

/**
*
* This is the Main program.
*
*/

final class Main {

   /**
   *
   * Prevent instantiation
   *
   * Throw an exception IllegalStateException.
   *
   * if this ever is called
   *
   *
   *
   * @throws IllegalStateException if instantiation is attempted
   *
   */

   private Main() {

       throw new IllegalStateException("Cannot be instantiated");

   }

   /**
   *
   * The starting Main() function.
   *
   *
   *
   * @param args No args will be used
   *
   */

   public static void main(String[] args) { // Fixed: changed 'Main' to 'main'

      // MultipleStringLiterals & MagicNumbers

       final String statusString = "Status:";
       final String newSpeedString = "New speed:";
       final String onceUponATimeString = "Once upon a time, there was a hare and tortise!They wanting to race to see who is the fastest!";
       final String chapter1String = "Chapter 1!";
       final String chapter2String = "Chapter 2!";
       final String chapter3String = "Chapter 3! Tortoise use super ability";
       final String chapter4String = "Chapter 4! Hare use super ability";
       final String chapter5String = "Chapter 5! Snow-fox use super ability";
       final String chapter6String = "Chapter 6! Gray-wolf use super ability";
       final String endingString1 = "At the end of the race the snow-fox and the gray-wolf was neck to neck, but then the snow-fox won the race by a milisecond!";
       final String endingString2 = "The gray-wolf coming out first place 🥇, and the snow-fox coming out second place 🥈! Third place the tortoise 🥉, and fourth place the hare.";
       final String moralString = "The story is told that slow and steady + never giving up + creativity you can get anything done. ❤";
       final int twoConst = 2;
       final int fourConst = 4;
       final int fiveConst = 5;
       final int sixConst = 6;
       final int eightConst = 8;
       final int tenConst = 10;
       final int twelveConst = 10;
       final int fifteenConst = 15;
       final int twentyConst = 20;
       final int twentyFiveConst = 25;
       final int thirtyFiveConst = 35;

   // Title of the story 
   System.out.println("\n -------- 🐾 🆃 🅷 🅴  🅰 🆆 🅴 🆂 🅾 🅼 🅴  🅰 🅽 🅸 🅼 🅰 🅻 -------\n"); 
   System.out.println("\n ----------------- 🆁 🅰 🅲 🅴  🆂 🆃 🅾 🆁 🆈 🐾 -------------------\n");
  
        // Begainning of the story.
        System.out.println(chapter1String); 
        System.out.println(onceUponATimeString);
        Tortoise tortoise = new Tortoise("Trent the tortoies", "albinism", 20);
        System.out.println(statusString);
        tortoise.status(); 
        System.out.println("");
        Hare hare = new Hare("Harly the hare", "Golden", 40); 
        System.out.println(statusString);
        hare.status();
        System.out.println("");

        System.out.println(chapter2String);
        System.out.println("Along the way they come across a snow fox and a gray wolf!");
        Snowfox snowFox = new Snowfox("Snow-flake the snow fox", "blue morph", 60);
        System.out.println(statusString);
        snowFox.status();
        System.out.println("");
        Graywolf grayWolf = new Graywolf("Ginger the gray wolf", "albino (white)", 80);
        System.out.println(statusString);
        grayWolf.status();
        System.out.println("");

   // First half of the story
       System.out.println(chapter3String);
       System.out.println("Shield time! speed up for 20 seconds!");
       System.out.println("Accelerating, 4 of power for 20 sec.");
       tortoise.accelerate(fourConst, twentyConst); 
       System.out.println(newSpeedString + tortoise.getCurrentSpeed());
       System.out.println("Breaking, 2 of power for 10 sec.");
       tortoise.brake(twoConst, fifteenConst); 
       System.out.println(newSpeedString + tortoise.getCurrentSpeed());
       System.out.println("");

   // midway into the story
       System.out.println(chapter4String);
       System.out.println("Fur-ball attack! tortoise slow down 10 seconds!");
       System.out.println("Accelerating, 6 of power for 15 sec.");
       hare.accelerate(sixConst, fifteenConst);
       System.out.println(newSpeedString + hare.getCurrentSpeed());
       System.out.println("Breaking, 8 of power for 10 sec.");
       hare.brake(eightConst, tenConst);
       System.out.println(newSpeedString + hare.getCurrentSpeed());
       System.out.println("");

   // third way of the story
       System.out.println(chapter5String);
       System.out.println("Ice attack! gray-wolf freeze for 25 seconds!");
       System.out.println("Accelerating, 8 of power for 20 sec.");
       snowFox.accelerate(eightConst, twentyConst);
       System.out.println(newSpeedString + snowFox.getCurrentSpeed());
       System.out.println("Breaking, 6 of power for 15 sec.");
       snowFox.brake(sixConst, fifteenConst);
       System.out.println(newSpeedString + snowFox.getCurrentSpeed());
       System.out.println("");

   // Finale of the story
       System.out.println(chapter6String);
       System.out.println("clone time! You won't know who the real me!"); 
       System.out.println("snow-fox hallucinate for 15 seconds!");
       System.out.println("Accelerating, 10 of power for 35 sec.");
       grayWolf.accelerate(tenConst, thirtyFiveConst);
       System.out.println(newSpeedString + grayWolf.getCurrentSpeed());
       System.out.println("Breaking, 12 of power for 25 sec.");
       grayWolf.brake(twelveConst, twentyFiveConst);
       System.out.println(newSpeedString + grayWolf.getCurrentSpeed());
       System.out.println("");

       System.out.println(endingString1);
       System.out.println("");

       System.out.println(endingString2);
       System.out.println("");
       
       System.out.println(moralString);
       System.out.println("");

       System.out.println("🆃 🅷 🅰 🅽 🅺 🆂  🅵 🅾 🆁  🆁 🅴 🅰 🅳 🅸 🅽 🅶 !") ;
       System.out.println("");
       System.out.println("🆃 🅷 🅴  🅴 🅽 🅳 !");
   }
}
