package org.cs362.dominion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.cs362.dominion.Card.Type;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlayTreasureTest {

	//   public  static void main(String args[]) throws CloneNotSupportedException{
	  @Test
	  public void test0()  throws Throwable  {	   
		    List<Card> cards;
		    GameState state,testState;
			Randomness.reset(10);	   

		      
//		 // initialize a game state and player cards
			cards = new ArrayList<Card>(Card.createCards());
			 state = new GameState(cards);  
//			
		      Player player = new Player(state, "player-1");
		         player.hand.add(Card.getCard(cards,Card.CardName.Smithy));

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
	      
		      System.out.println("hand hand = " + state.players.get(0).hand.size());
		      System.out.println("hand deck = " + state.players.get(0).deck.size());
		      //copy or clone the game state to a test case
		      testState=(GameState) state.clone();

  		     //	use cards
		      state.players.get(0).playTtreasureCard();
		      
		      System.out.println("  *****    Player-1 Status ***** " );
		      System.out.println("hand count = " + state.players.get(0).hand.size() + ", expected = "+ ( testState.players.get(0).hand.size() - Card.filter(testState.players.get(0).hand, Type.TREASURE).size() ) );
		      System.out.println("deck count = " + state.players.get(0).deck.size() + ", expected = "+ ( testState.players.get(0).deck.size()  ) );
		      System.out.println("discard = " + state.players.get(0).discard.size() + ", expected = "+ ( testState.players.get(0).discard.size() +  Card.filter(testState.players.get(0).hand, Type.TREASURE).size()) );
		      System.out.println("coins = " + state.players.get(0).coins + ", expected = "+ ( testState.players.get(0).coins +  Card.filter(testState.players.get(0).hand, Type.TREASURE).size() ) );//only has copper
		      
		      
		      
		      assertEquals(state.players.get(0).hand.size(),( testState.players.get(0).hand.size() - Card.filter(testState.players.get(0).hand, Type.TREASURE).size()))      ;
		      assertEquals(state.players.get(0).deck.size(),( testState.players.get(0).deck.size()  ))      ;
		      assertEquals(state.players.get(0).discard.size(),( testState.players.get(0).discard.size() + Card.filter(testState.players.get(0).hand, Type.TREASURE).size() ))      ;
		      assertEquals(state.players.get(0).coins,( testState.players.get(0).coins + Card.filter(testState.players.get(0).hand, Type.TREASURE).size() ))      ;
	      
		      
		      
		      

	   }
	
	
}
