/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 13:41:09 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.numBuys = 6;
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.coins = 4;
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.numActions = (-5214);
      player0.toString();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      Card.CardName card_CardName0 = Card.CardName.councilRoom;
      Card.getCard(player0.playedCards, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "v-9=>[oo\"R>");
      player0.coins = 8;
      player0.numBuys = 8;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      Card.CardName card_CardName0 = Card.CardName.councilRoom;
      player0.numActions = 812;
      Card.getCard(player0.playedCards, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.numActions = (-5214);
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.extra = 812;
      player0.playedCards = list0;
      player0.endTurn();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "WbwWR");
      player0.coins = 1;
      player0.discard((Card) null);
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "WbwWR");
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.extra = (-3996);
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "TZ,\"::pBI_0l8Ynw");
      player0.discard = list0;
      player0.endTurn();
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Player.actionPhase Card:");
      List<Card> list0 = Card.createCards();
      player0.discard = list0;
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.gain((Card) null);
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
  public void test14()  throws Throwable  {
      Player player0 = new Player((GameState) null, ">29n5G||c-Bs");
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

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      player0.hand = (List<Card>) arrayList0;
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      LinkedList<Card> linkedList0 = player0.deck;
      player0.endTurn();
      Card.CardName card_CardName0 = Card.CardName.councilRoom;
      player0.discard = (List<Card>) linkedList0;
      Card.getCard(player0.playedCards, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player((GameState) null, "v-9=>[oo\"R>");
      Randomness.random = null;
      player0.gain((Card) null);
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Player player0 = new Player((GameState) null, "InvalidFieldValue");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      player0.drawCard();
      Randomness.random = null;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      Randomness.random = null;
      player0.discard = list0;
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
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "IhWh__H=RaJ}@DAQE^");
      Card.CardName card_CardName0 = Card.CardName.Remodel;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.hand = null;
      // Undeclared exception!
      try { 
        player0.discard(card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.coins = 1;
      player0.numBuys = 1;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.coins = 2;
      player0.numBuys = 2;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.hand = list0;
      player0.playedCards = list0;
      player0.endTurn();
      player0.playTtreasureCard();
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "v-9=>[oo\"R>");
      player0.coins = 5;
      player0.numBuys = 5;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.coins = 7;
      player0.numBuys = 7;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player((GameState) null, " gains ");
      player0.coins = 1740;
      player0.numBuys = 1740;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      Card card0 = player0.drawCard();
      player0.gain(card0);
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = list0;
      player0.endTurn();
      player0.initializePlayerTurn();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player((GameState) null, "v-9=>[oo\"R>");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.hand = list0;
      player0.endTurn();
      player0.playTtreasureCard();
      player0.buyCard();
      assertEquals(12, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.printStateGame();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, (String) null);
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      player0.discard(card0);
      player0.playedCards = list0;
      // Undeclared exception!
      try { 
        player0.endTurn();
       //  fail("Expecting exception: System.SystemExitException");
       // Unstable assertion
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }
}
