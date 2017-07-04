package beginnerPack;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * game of billiards involves two players knocking 3 balls around on a green baize table. Well, there is more to it,
 *  but for our purposes this is sufficient.

The game consists of several rounds and in each round both players obtain a score, based on how well they played. 
Once all the rounds have been played, the total score of each player is determined by adding up the scores in all
 the rounds and the player with the higher total score is declared the winner.

The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play against each other.
 The Manager of Siruseri Sports Club decided to add his own twist to the game by changing the rules for determining the
  winner. In his version, at the end of each round the leader and her current lead are calculated. 
  Once all the rounds are over the player who had the maximum lead at the end of any round in the game is 
  declared the winner.
  
  The total scores of both players, the leader and the lead after each round for this game is given below:

Round          Player 1          Player 2     Leader     Lead
  1               140                82       Player 1     58
  2               229               216       Player 1     13
  3               319               326       Player 2      7
  4               431               432       Player 2      1
  5               519               522       Player 2      3
  
  The winner of this game is Player 1 as he had the maximum lead (58 at the end of round 1) during the game. 
  Your task is to help the Manager find the winner and the winning lead. 
  You may assume That is, there are no ties.
  
  --------------Input---------------------------------
  The first line of the input will contain a single integer N (N ≤ 10000) indicating the number of rounds in the game.
   Lines 2,3,...,N+1 describe the scores of the two players in the N rounds. Line i+1 contains two integer Si and Ti, 
   the scores of the Player 1 and 2 respectively, in round i. You may assume that 1 ≤ Si ≤ 1000 and 1 ≤ Ti ≤ 1000.
   
   --------------Output---------------------------------
   
   Your output must consist of a single line containing two integers W and L, 
   where W is 1 or 2 and indicates the winner and L is the maximum lead attained by the winner.
 * */
public class GameOfBilliards 
{
	public static int[] player1score,player2score,playerScoreDifference;
	public static Scanner sc=new Scanner(System.in);
	public static int roundPerGame,lead=0;
	public static ArrayList<Integer> al=new ArrayList<>();
	
	public static void calculateScoreDifference(int[] player1score,int[] player2score)
	{
		playerScoreDifference=new int[player1score.length];
		for(int i=0;i<playerScoreDifference.length;i++)
		{
//			playerScoreDifference[i]=player1score[i]-player2score[i];
			al.add(player1score[i]-player2score[i]);
		}
		
		
		
		if(calculateNetLeadOfScore(al)<=0)
		{
			System.out.println(2+" "+Math.abs(calculateNetLeadOfScore(al)));
		}
		else
		{
			System.out.println(1+" "+calculateNetLeadOfScore(al));
		}
		
	}
	public static int calculateNetLeadOfScore(ArrayList<Integer> al)
	{
		int sum=0;
		
		for(Integer i:al)
		{
			sum+=i;
		}
		return sum;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter rounds of pool per game");
		roundPerGame=sc.nextInt();
		if(roundPerGame<=10000)
		{
			player1score=new int[roundPerGame];
			player2score=new int[roundPerGame];
			int i=0,a,b;
			while(roundPerGame-->0)
			{
				
				System.out.println("Enter player 1 score");
				a=sc.nextInt();
				System.out.println("Enter player 2 score ");
				b=sc.nextInt();
				if(a<=10000 && b<=10000)
				{
					player1score[i]=a;
					player2score[i]=b;
					i++;	
				}
				else
				{
					break;
				}
				
			}
			calculateScoreDifference(player1score, player2score);
		}
		
		
	}

}
