/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 01:59:06 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Card;
import dominion.GameState;
import dominion.Player;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      Player player0 = new Player(gameState0, "S5rN");
      player0.discard = list0;
      player0.endTurn();
      String string0 = player0.toString();
      assertEquals(" --- S5rN ---  --- --------------------------- --- Hand: [ \n\tGold,  \n\tSilver,  \n\tCopper,  \n\tProvince,  \n\tDuchy]Discard: []Deck: [ \n\tEstate,  \n\tCurse,  \n\tAdventurer,  \n\tAmbassador,  \n\tSmithy,  \n\tVillage,  \n\tBaron,  \n\tCouncil_Room,  \n\tCutpurse,  \n\tEmbargo,  \n\tFeast,  \n\tGardens,  \n\tGreat_Hall,  \n\tMine,  \n\tSea_Hag]Played Cards: []numActions: 1coinss: 0numBuys: 1\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "l}%}7^xr6J=yi$B$AlC");
      player0.numActions = 1263;
      String string0 = player0.toString();
      assertEquals(" --- l}%}7^xr6J=yi$B$AlC ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 1263coinss: 0numBuys: 0\n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<n~w{<?D]x7?Q>s1M<");
      player0.playedCards = gameState0.cards;
      Player player1 = player0.clone();
      player1.endTurn();
      player1.coins = 47;
      // Undeclared exception!
      try { 
        player1.buyCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 6
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "umfs:n");
      player0.numActions = (-4235);
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.numActions = (-1);
      player1.playTtreasureCard();
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.discard = list0;
      int int0 = player0.scoreFor();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.numActions = (-1);
      player1.playKingdomCard();
      assertNotSame(player1, player0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "numBuCs: ");
      player0.discard = gameState0.cards;
      Random.setNextRandom(233);
      player0.initializePlayerTurn();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "numBuCs: ");
      player0.discard = gameState0.cards;
      player0.initializePlayerTurn();
      player0.endTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.discard = list0;
      player0.drawCard();
      player0.initializePlayerTurn();
      player0.hand = gameState0.cards;
      int int0 = player0.scoreFor();
      assertEquals(0, list0.size());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<n~w{<?D]x7?Q>s1M<");
      player0.playedCards = list0;
      player0.endTurn();
      player0.drawCard();
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.discard = gameState0.cards;
      player0.drawCard();
      player0.endTurn();
      Card card0 = player0.drawCard();
      assertEquals(-1, card0.score());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "E[{d%t.pShhc");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.numActions = 0;
      player0.numActions = 233;
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "umfs:n");
      player0.numActions = (-4235);
      player0.hand = gameState0.cards;
      player0.numActions = 3;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((GameState) null, "VICTORY");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      Player player1 = player0.clone();
      player1.discard = null;
      // Undeclared exception!
      try { 
        player1.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      Player player1 = player0.clone();
      player1.hand = null;
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        player1.discard(card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((GameState) null, "coinss: ");
      player0.playedCards = null;
      // Undeclared exception!
      try { 
        player0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Vkgo1qHa:7");
      player0.numActions = 13;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      Player player0 = new Player(gameState0, "Council_Room");
      player0.discard = list0;
      player0.drawCard();
      Vector<Card> vector0 = new Vector<Card>();
      player0.hand = (List<Card>) vector0;
      player0.endTurn();
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 6
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "The board game is empty you need to intialize the game!!!!");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
      assertEquals(6, card0.score());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "l}%}7^xr6=yi$B$AlC");
      player0.hand = list0;
      player0.numActions = 1263;
      // Undeclared exception!
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "l}%}7^xr6=yi$B$AlC");
      player0.numActions = 1263;
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuCs: ");
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.discard = gameState0.cards;
      player0.drawCard();
      player0.endTurn();
      int int0 = player0.scoreFor();
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuys: ");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Feast");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      player0.endTurn();
      player0.initializePlayerTurn();
      // Undeclared exception!
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Feast");
      List<Card> list0 = Card.createCards();
      player0.hand = list0;
      player0.endTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      List<Card> list0 = Card.createCards();
      gameState0.cards = list0;
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.discard = gameState0.cards;
      player0.endTurn();
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card card0 = player0.drawCard();
      boolean boolean0 = player0.gain(card0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.printStateGame();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "numBuys: ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
