package org.cs362.dominion;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class MineTest
{
	@Test
	public void test() throws Throwable {
		Randomness.reset(System.currentTimeMillis());
		GameState state;
		List<Card> cards;
		cards = new ArrayList<Card>(Card.createCards());
		state = new GameState(cards);
		Player testPlayer = new Player(state, "test-player-1");
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Copper));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Gold));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Mine));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Silver));
		state.addPlayer(testPlayer);
		testPlayer = new Player(state, "test-player-2");
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Copper));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Gold));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Mine));
		testPlayer.hand.add(Card.getCard(cards,Card.CardName.Silver));
		state.addPlayer(testPlayer);
		state.prepTestGame();

        for (Player player : state.players)
        {
    	 	Card c = Card.getCard(state.cards,Card.CardName.Mine);
    	 	c.play(player, state);
        }
	   assertEquals( state.players.get(0).trashpile.size(), 1);
	}
}