package dominion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CardTest{
  private GameState g;
  private Player a;
  private Player b;


  @Before
  public void initPlayer(){
    g = new GameState();
    a = new Player("Armand", g, true);
    g.addPlayer(a);
    b = new Player("Barney", g, true);
    g.addPlayer(b);
  }

  @Test
  public void testValuesCopper(){
    // System.out.println("In testValuesCopper.");
    assertEquals(Card.COPPER.toString(), "Copper");
    assertEquals(Card.COPPER.desc, "worth 1 money");
    assertEquals(Card.COPPER.costsAction, 0);
    assertEquals(Card.COPPER.costsMoney, 0);
    assertEquals(Card.COPPER.givesActions, 0);
    assertEquals(Card.COPPER.givesCardDraws, 0);
    assertEquals(Card.COPPER.givesMoney, 1);
    assertEquals(Card.COPPER.givesVictoryPoints, 0);
    assertEquals(Card.COPPER.getType(), Card.Type.TREASURE);
  }

  @Test
  public void testPlayCopper(){
    assertEquals(a.getMoney(), 0);
    Card.COPPER.play(a);
    assertEquals(a.getMoney(), 1);
  }

  @Test
  public void testPlayCurse(){
    assertEquals(a.getMoney(), 0);
    Card.CURSE.play(a);
    assertEquals(a.getMoney(), 0);
  }

  @Test
  public void testPlayAdventurer(){
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), 10);
    assertEquals(Card.ADVENTURER.play(a), Card.ADVENTURER);
    assertEquals(a.getHandSize(), 7);
    assertEquals(a.countAllCards(), 10);
  }

  @Test
  public void testPlayAmbassador(){
    // Needs random choices enabled
    assertEquals(Card.AMBASSADOR.play(a), Card.AMBASSADOR);
  }

  @Test
  public void testPlayBaron(){
    // Case: no Estate in hand, gain an Estate
    while(a.isCardInHand(Card.ESTATE)) a.discardFromHand(Card.ESTATE);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertEquals(a.countAllCards(), 11);
    // Case: yes Estate in hand, gain 4 money
    assertEquals(a.getMoney(), 0);
    a.putInHand(Card.ESTATE);
    assertTrue(a.isCardInHand(Card.ESTATE));
    assertEquals(Card.BARON.play(a), Card.BARON);
    assertFalse(a.isCardInHand(Card.ESTATE));
    assertEquals(a.getMoney(), 4);
  }

  @Test
  public void testPlayCouncilRoom(){
    assertEquals(a.getBuys(), 1);
    assertEquals(a.getHandSize(), 5);
    assertEquals(b.getHandSize(), 5);
    assertEquals(Card.COUNCILROOM.play(a), Card.COUNCILROOM);
    assertEquals(a.getBuys(), 2);
    assertEquals(a.getHandSize(), 9);
    assertEquals(b.getHandSize(), 6);
  }

  @Test
  public void testPlayCutpurse(){
    // case: opponent has at least one copper
    assertEquals(a.getMoney(), 0);
    b.putInHand(Card.ESTATE);
    assertEquals(b.getHandSize(), 6);
    assertEquals(Card.CUTPURSE.play(a), Card.CUTPURSE);
    assertEquals(a.getMoney(), 2);
    assertEquals(b.getHandSize(), 5);
    // case: opponent has no coppers
    while(b.isCardInHand(Card.COPPER)) b.discardFromHand(Card.COPPER);
    int i = b.getHandSize();
    a.putInHand(Card.CUTPURSE);
    a.playCard(Card.CUTPURSE);
    assertEquals(b.getHandSize(), i);
  }

  @Test
  public void testPlayEmbargo(){
    a.putInHand(Card.EMBARGO);
    assertEquals(a.getMoney(), 0);
    assertEquals(a.getHandSize(), 6);
    assertTrue(a.playCard(Card.EMBARGO));
    assertEquals(a.getMoney(), 2);
    assertEquals(a.getHandSize(), 5);
  }

  @Test
  public void testPlayFeast(){
    a.putInHand(Card.FEAST);
    assertEquals(a.getHandSize(), 6);
    int totalCards = a.countAllCards();
    a.playCard(Card.FEAST);
    assertEquals(a.getHandSize(), 5);
    assertEquals(a.countAllCards(), totalCards);
  }

  @Test
  public void testPlayGardens(){
    assertFalse(a.playCard(Card.GARDENS));
    a.putInHand(Card.GARDENS);
  }
}
