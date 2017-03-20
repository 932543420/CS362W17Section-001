/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 22:58:30 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, " to use in Buy Round.");
      Player player1 = player0.clone();
      player1.numBuys = (-1617);
      player1.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Trash this card, Gain a Card Costing up to 5 coins");
      player0.initializePlayerTurn();
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((GameState) null, "<00F>5");
      player0.coins = 23;
      player0.numActions = 807;
      player0.buyCard((GameState) null);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      player1.coins = (-81);
      player1.buyCard((GameState) null);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      player1.numActions = (-1);
      player1.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_hall;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.gain(card0);
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      List<Card> list0 = Card.createCards();
      player1.discard = list0;
      Random.setNextRandom((-988));
      player1.drawCard();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      List<Card> list0 = Card.createCards();
      player1.discard = list0;
      player1.drawCard();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player((GameState) null, " to use in Buy Round.");
      player0.gain((Card) null);
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      List<Card> list0 = Card.createCards();
      player1.hand = list0;
      player1.numActions = 14;
      // Undeclared exception!
      try { 
        player1.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player((GameState) null, " 0vN(dxg2N`TES");
      player0.discard((Card) null);
      player0.gain((Card) null);
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
  public void test11()  throws Throwable  {
      Player player0 = new Player((GameState) null, "3UAV4Yg");
      Player player1 = player0.clone();
      LinkedList<Card> linkedList0 = player0.deck;
      player1.discard = (List<Card>) linkedList0;
      player1.discard = null;
      // Undeclared exception!
      try { 
        player1.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.hand = list0;
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

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      Player player1 = player0.clone();
      player1.hand = null;
      // Undeclared exception!
      try { 
        player1.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Randomness.random = null;
      Player player0 = new Player((GameState) null, (String) null);
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player((GameState) null, "H;\"W");
      player0.hand = null;
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      player0.initializePlayerTurn();
      player0.hand = list0;
      player0.playKingdomCard();
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.buyCard((GameState) null);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.playTreasureCard();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.playTreasureCard();
      // Undeclared exception!
      try { 
        player0.buyCard((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.gain((Card) null);
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_hall;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.gain(card0);
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      int int0 = player0.scoreFor();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((GameState) null, "<00F>5");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.initializePlayerTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }
}