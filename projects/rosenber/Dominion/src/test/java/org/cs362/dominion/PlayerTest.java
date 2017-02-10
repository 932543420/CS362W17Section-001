package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	Player test;
	
	private Card createCard(String name, int cost, int vic, int mon){
		return new Card(name, cost, vic, mon, new CardType[] {CardType.Action});
	}
	
	@Test
	public void testConstructorString() {
		
		test = new Player("Robert");
		
		assertEquals("Name doesn't match name given",
				"Robert", test.getName());
		assertEquals("Hand isn't empty",
				0, test.hand.size());
		assertEquals("Deck isn't empty",
				0, test.deck.size());
		assertEquals("Discard isn't empty",
				0, test.discard.size());
	}

	@Test
	public void testConstructorInt(){
		//TODO: implement this
	}
	
	@Test
	public void testSetters(){
		
		test = new Player("asdf");
		
		test.setBuys(5);
		assertEquals("Buys doesn't equal what it was set to",
				5, test.getBuys());
		
		test.setActions(4);
		assertEquals("Actions doesn't equal what is was set to",
				4, test.getActions());
		
		test.setMoney(3);
		assertEquals("Money doesn't equal what it was set to",
				3, test.getMoney());
	}
	
	@Test
	public void testAdds(){
		
		test = new Player("asdf");
		
		test.addBuys(5);
		assertEquals("Buys doesn't equal what it was set to",
				5, test.getBuys());
		
		test.addActions(4);
		assertEquals("Actions doesn't equal what is was set to",
				4, test.getActions());
		
		test.addMoney(3);
		assertEquals("Money doesn't equal what it was set to",
				3, test.getMoney());
		
	}
	
	@Test
	public void testHandDeckDiscardInteractions(){
		
		test = new Player("asdf");
		Card c = createCard("foo", 1, 2, 3);
		test.hand.addCard(c);
		test.discardCard(c);
		assertEquals("Discard did not increase when adding card to it",
				test.discard.size(), 1);
		assertEquals("Deck increased in size when discarding card",
				test.deck.size(), 0);
		assertEquals("Hand increased in size when discarding card",
				test.hand.size(), 0);
		
		test.reshuffleDeck();
		assertEquals("Discard isn't empty after reshuffle",
				test.discard.size(), 0);
		assertEquals("Hand size changed when reshuffling deck",
				test.hand.size(), 0);
		assertEquals("Deck didn't gain all cards when reshuffled",
				test.deck.size(), 1);
		
		test.drawCard();
		assertEquals("Discard size changed when card drawn",
				test.discard.size(), 0);
		assertEquals("Deck didn't decrement when card drawn",
				test.deck.size(), 0);
		assertEquals("Hand didn't gain card when card drawn",
				test.hand.size(), 1);
		
		
		test.discardCard(c);
		test.drawCard();
		assertEquals("Hand didn't receive a card on the drawn with deck empty",
				test.hand.size(), 1);
		assertEquals("Discard didn't get reshuffled when drawing on empty deck",
				test.discard.size(), 0);
		assertEquals("Deck isn't empty after last card drawn",
				test.deck.size(), 0);
		
	}
}