package rockPaperScissors;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
	 
	 
	 String playerPicks = Player();
	 String HandPlays = Comp();  
	 WhoWins(playerPicks, HandPlays);
	 
	}

	public static String Player() {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter rock, paper or scissors: ");
	 String playerPicks = scanner.nextLine();
	 scanner.close();
	 System.out.println("Player picks: " + playerPicks);
	 return playerPicks;
	}
	  
	public static boolean Validation(String inString) {
		return(inString == "rock") || (inString == "scissors") || (inString == "paper");
	}

	public static String Comp() {
	 int compPlay;
	 String HandPlays = "none";

	 Random r = new Random();
	 compPlay = r.nextInt(3) + 1;
	 System.out.println(compPlay);
	 
	 
	 int rock = 1 ;
	 int paper = 2;
	 int scissors = 3;
	 if (compPlay==rock) {
	  HandPlays="rock";
	 }
	 if(compPlay==paper) {
	  HandPlays = "paper";
	 }
	 if(compPlay==scissors) {
	  HandPlays = "scissors";
	 }
	  
	 System.out.println("Computer picks: " + HandPlays);
	 return HandPlays;
	 }

	public static void WhoWins(String player, String computer) {
	 
	 if(player.equals(computer)) {
	  System.out.println("Its a tie");
	 }

	 else{
		 if(player == "rock") {
			 if(computer == "paper") {
				 System.out.println("Computer wins!");
			 }
			 else {
				 System.out.println("Player wins!");
			 }
		 }
		 else if(player == "paper") {
			 if(computer == "rock") {
				 System.out.println("Player wins!");
			 }
			 else {
				 System.out.println("Computer wins!");
			 }
		 }
		 else {
			 if(computer == "rock") {
				 System.out.println("Computer wins!");
			 }
			 else {
				 System.out.println("Player wins!");
			 }
		 }
	 }
	}
	}
