/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 16:17:39 PST 2017
 */

package main.java.org.cs362.dominion;

import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.numBuys = (-738);
      String string0 = player0.toString();
      assertEquals(" --- null --- \n --- --------------------------- --- \nHand: []\nDiscard: []\nDeck: []\nPlayed Cards: []\nnumActions: 0\ncoins: 0\nnumBuys: -738\n", string0);
  }

  @Test
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "");
      player0.numBuys = 10;
      player0.coins = 10;
      player0.buyCard(gameState0);
      assertFalse(gameState0.equals((Object)gameState1));
  }

  @Test
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "");
      player0.numBuys = 10;
      player0.buyCard(gameState0);
      assertFalse(gameState1.equals((Object)gameState0));
  }

  @Test
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.numBuys = 10;
      player0.coins = 10;
      player0.buyCard(gameState0);
      int int0 = player0.scoreFor();
      //  // Unstable assertion: assertEquals(4, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, " --- ");
      player0.numActions = 1718;
      player0.hand = gameState1.cards;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " has ");
      player0.endTurn();
      player0.buyCard(gameState0);
      player0.hand = list0;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, " has ");
      player0.playKingdomCard();
  }

  @Test
  public void test07()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      boolean boolean0 = player0.gain((Card) null);
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, " brought Silver\n");
      player0.printStateGame();
  }

  @Test
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.numBuys = 10;
      player1.buyCard(gameState0);
      player1.initializePlayerTurn();
      assertNotSame(player1, player0);
  }

  @Test
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "+keMqB7");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.playedCards = list0;
      player0.discard = list0;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.LinkedList$ListItr", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "k");
      Player player1 = player0.clone();
      player1.discard = null;
      // Undeclared exception!
      try { 
        player1.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(priorityQueue0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.endTurn();
      player0.hand = list0;
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.numBuys = 10;
      player1.coins = 10;
      // Undeclared exception!
      try { 
        player1.buyCard(gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.numBuys = 10;
      player1.coins = 10;
      // Undeclared exception!
      try { 
        player1.buyCard(gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(priorityQueue0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      player0.endTurn();
  }

  @Test
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.playedCards = list0;
      player0.endTurn();
      Card card0 = player0.drawCard();
      //  // Unstable assertion: assertEquals(0, list0.size());
      //  // Unstable assertion: assertEquals(2, card0.getCost());
  }

  @Test
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "x");
      player0.playedCards = list0;
      int int0 = player0.scoreFor();
      assertEquals(12, int0);
  }

  @Test
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      player1.hand = list0;
      player1.playTtreasureCard();
      int int0 = player1.scoreFor();
      assertEquals(17, list0.size());
      assertEquals(12, int0);
  }

  @Test
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      gameState0.clone();
      player1.numBuys = 6;
      player0.player_username = "";
      player1.player_username = "(s}AI8BMk_GWWQ";
      player0.playKingdomCard();
      player0.buyCard(gameState0);
      player1.clone();
      player0.player_username = "(s}AI8BMk_GWWQ";
      player1.coins = 6;
      player1.buyCard(gameState0);
      player1.scoreFor();
      player0.hand = gameState1.cards;
      assertEquals(20, player0.hand.size());
  }

  @Test
  public void test22()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.endTurn();
      player0.playKingdomCard();
  }

  @Test
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
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

  @Test
  public void test24()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, " brought Silver\n");
      player0.discard((Card) null);
  }

  @Test
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "6e0b9-N{");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Player", e);
      }
  }
}
