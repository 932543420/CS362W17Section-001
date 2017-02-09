package org.cs362.dominion;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.ArrayList;
public class CardTest {

	Card testCard;
	
	@Test
	public void test() {
		ArrayList<CardType> type = new ArrayList<CardType>();
		type.add(CardType.Action);
		type.add(CardType.Attack);
		
		try{
			testCard = new Card();
		}
		catch(Exception e){
			fail("Default card constructor crashes");
		}
		
		testCard = new Card("James", 1, 2, 3, type);
		Card other = new Card(testCard);
		
		assertFalse("The card constructor doesn't create a new object",
				testCard == other);
		
		assertEquals("The names aren't the same", 
				testCard.getName(), other.getName());
		
		assertEquals("The costs aren't the same",
				testCard.getCost(), other.getCost());
		
		assertEquals("The victory points aren't the same",
				testCard.getVictoryPoints(), other.getVictoryPoints());
		
		assertEquals("The treasure amount isn't the same",
				testCard.getTreasure(), other.getTreasure());
		
		assertTrue("The test card isn't action type", 
				testCard.isCardType(CardType.Action));
		
		assertTrue("The test card isn't attack type", 
				testCard.isCardType(CardType.Attack));
		
		assertTrue("The other card is the wrong type",
				other.isCardType(CardType.Action));
		
		assertFalse("The test card is reaction type",
				testCard.isCardType(CardType.Reaction));
		
		assertEquals("Card name isn't James",
				testCard.getName(), "James");
		
		assertEquals("Cost isn't 1",
				testCard.getCost(), 1);
		
		assertEquals("VictoryPoints isn't 2",
				testCard.getVictoryPoints(), 2);
		
		assertEquals("Treasure ammount isn't 3",
				testCard.getTreasure(), 3);
		
		try{
			testCard.Action();
		}
		catch(Exception e){
			fail("Action function crashed");
		}
		try{
			testCard.Attack();
		}
		catch(Exception e){
			fail("Attack function crashed");
		}
		try{
			testCard.Reaction();
		}
		catch(Exception e){
			fail("Reaction function crashed");
		}
		try{
			testCard.print(0);
		}
		catch(Exception e){
			fail("Print function crashed");
		}
	}
}
















































