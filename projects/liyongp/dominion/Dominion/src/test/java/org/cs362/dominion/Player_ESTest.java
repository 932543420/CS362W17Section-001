/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 14:37:42 PDT 2017
 */
package org.cs362.dominion;


import static org.evosuite.runtime.EvoAssertions.assertThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVNET = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "ye#pp*zei*6V!jGL");
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      player0.gain(card0);
      player0.drawCard();
  }

  @Test
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      card0.getType();
      player0.playedCards = gameState0.cards;
      player0.endTurn();
      player0.scoreFor();
      gameState0.toString();
      player0.numBuys = 12;
      player0.drawCard();
      Player player1 = player0.clone();
      player1.drawCard();
  }

  @Test
  public void test02()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.numActions = 10;
      player0.toString();
  }

  @Test
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*R,6>)t$IbE ");
      player0.coins = 12;
      player0.toString();
  }

  @Test
  public void test04()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.numBuys = 10;
      player0.coins = 10;
      // Undeclared exception!
      try { 
        player0.buyCard((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test05()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "%u#2nK{i3:%GY&%w\"r");
      player0.numBuys = 1315;
      GameState gameState1 = new GameState(gameState0.cards);
      player0.buyCard(gameState1);
  }

  @Test
  public void test06()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "3");
      player0.numBuys = (-19);
      player0.buyCard(gameState0);
  }

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player((GameState) null, "r&zLEvrbd]}hu@]j?");
      player0.numActions = (-5);
      player0.playKingdomCard();
  }

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player((GameState) null, "AX7n6z\"");
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

  @Test
  public void test09()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "y+/& Rs@1jb[!vEo@#");
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
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "ye#pp*zei*6V!jGL");
      Card.CardName card_CardName0 = Card.CardName.Festival;
      Card card0 = Card.getCard(list0, card_CardName0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      player0.initializePlayerTurn();
      player0.hand = list0;
      linkedList0.offerLast(card0);
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "}a3aJN=h~t");
      player0.discard = null;
      // Undeclared exception!
      try { 
        player0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*R,6>)t$IbE ");
      Player player1 = player0.clone();
      player1.discard = gameState0.cards;
      player1.scoreFor();
      player1.initializePlayerTurn();
      player1.playKingdomCard();
      // Undeclared exception!
      try { 
        player1.scoreFor();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.numBuys = 10;
      player0.coins = (-7);
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 3
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ";jyR\"`dZE");
      player0.initializePlayerTurn();
      player0.endTurn();
  }

  @Test
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*R,6>)t$IbE ");
      Player player1 = player0.clone();
      player1.discard = gameState0.cards;
      player1.initializePlayerTurn();
      player1.playTtreasureCard();
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
  }

  @Test
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "pS6j");
      player0.playedCards = gameState0.cards;
      int int0 = player0.scoreFor();
      assertEquals(12, int0);
  }

  @Test
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*R,6>)t$IbE ");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "*R,6>)t$IbE ");
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("main.java.org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Player player0 = new Player((GameState) null, "y*>.W9TG5HW=pD");
      Player player1 = player0.clone();
      Vector<Card> vector0 = new Vector<Card>();
      player1.discard = (List<Card>) vector0;
      vector0.add((Card) null);
      player1.playedCards = (List<Card>) vector0;
      // Undeclared exception!
      try { 
        player1.endTurn();
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Vector$Itr", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "ye#pp*zei*6V!jGL");
      Card.CardName card_CardName0 = Card.CardName.Festival;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
      Card card1 = player0.drawCard();
      assertEquals(5, card1.getCost());
  }

  @Test
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "A<lqx(O2VL ");
      player0.printStateGame();
  }
}
