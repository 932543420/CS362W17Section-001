package cs362.dominionMaven;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import junit.framework.TestCase;

public class FestivalTest extends TestCase {



	public static HashMap<Card, Integer> gameBoard = new HashMap<Card, Integer>();	
	List<Card> cards =new ArrayList<Card>(Card.createCards());
	
	Player p = new Player(null, "fester");
	Player j = new Player(null, "Jay");
	GameState game = new GameState(cards); 
	
	public void test() {
		game.addPlayer(p);
		game.addPlayer(j);
		game.initializeGame();
		int x = p.numBuys;
		System.out.println("buys before = " + x);
		Card temp = Card.getCard(cards, Card.CardName.festival);
		temp.play(p, game);
		int y = p.numBuys;
		System.out.println("buys after = " + y);
		int o = p.numActions;
		int b = p.numBuys;
		System.out.println("actions after = " + o);
		System.out.println("buys after = " + b);
	}
	
	
}
