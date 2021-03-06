package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.cs362.dominion.Card.CardName;
import org.junit.Test;
import static org.junit.Assert.*;


public class SalvagerTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test4()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		    int newCards = 3;  
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		      //player.deck.add(Card.getCard(cards, Card.CardName.Salvager));
		      //player.deck.add(Card.getCard(cards, Card.CardName.Estate));
		        
		         state.addPlayer(player);
		       player = new Player(state, "player-2");
		         state.addPlayer(player);
		         
		      //Initialize the game!
		      state.initializeGame();
		      
		      System.out.println("hand count = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      System.out.println("hand coins = " + state.players.get(0).coins);
		      System.out.println("hand numActions = " + state.players.get(0).numActions);
		      System.out.println("hand numBuys = " + state.players.get(0).numBuys);
		      System.out.println("----------------------");
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

		     //	play the game 
		      while (!state.players.get(0).hand.isEmpty())
		    	  state.players.get(0).hand.remove(0);
		      Card c = Card.getCard(cards, Card.CardName.Salvager);
		      state.players.get(0).hand.add(c);
		      state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gold));
		      state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gold));
		      state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gold));
		      state.players.get(0).hand.add(Card.getCard(cards, Card.CardName.Gold));
		      c.play(state.players.get(0), state);
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size()-1));
		      System.out.println("deck count = " + (state.players.get(0).deck.size() )+ ", expected = "+ ( testState.players.get(0).deck.size()));
		      System.out.println("numActions = " + state.players.get(0).numActions + ", expected = "+ ( testState.players.get(0).numActions));
		      
		    
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size()-1));
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size()));
	      
		      assertEquals(state.players.get(0).coins, Card.getCard(cards, Card.CardName.Gold).getCost());
		      

	   }
	
}
