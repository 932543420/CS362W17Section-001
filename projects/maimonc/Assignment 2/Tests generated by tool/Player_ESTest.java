/*
 * This file was automatically generated by EvoSuite
 * Wed Feb 22 21:27:54 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, ">pCpfE4;{m*dd+");
      player0.deck = (List<Card>) stack0;
      gameState0.initializeGame();
      player0.hand = (List<Card>) stack0;
      gameState0.initializeGame();
      gameState0.getWinners();
      player0.hand = (List<Card>) stack0;
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.getCard(player0.hand, card_CardName0);
      stack0.add((Card) null);
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Randomness.reset((-5L));
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      player0.printStateGame();
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.coins = (-8);
      player0.addScore(0);
      player0.numBuys = 1;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      player0.numActions = 5;
      player0.scoreFromPoints = 9;
      gameState0.play();
      player0.deck = list0;
      Card card0 = new Card(card_CardName0, card_Type0, 1678, (-1), 1);
      player0.played(card0);
      card0.toString();
      player0.discard(card0);
      Card card1 = player0.drawCard();
      gameState0.isGameOver();
      card0.compareTo(card1);
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      player0.buyCard();
      player0.gain(card0);
      card0.equals(player0);
      int int0 = player0.scoreFromPoints;
      player0.endTurn();
      Card.Type.values();
      Randomness.reset((-1L));
      player0.drawCard();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName.values();
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      vector0.remove((Object) "!iA|4lMyysx");
      Player player0 = new Player(gameState0, "!iA|4lMyysx");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      gameState0.toString();
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2338), 0, 0);
      // Undeclared exception!
      try { 
        player0.trash((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      gameState0.gameBoard = hashMap0;
      Player player0 = new Player(gameState0, "");
      player0.playedCards = list0;
      player0.endTurn();
      Integer integer0 = new Integer(2597);
      player0.coins = (-19);
      player0.playTtreasureCard();
      player0.endTurn();
      Card card0 = player0.drawCard();
      Integer integer1 = new Integer(0);
      card0.equals((Object) null);
      hashMap0.put(card0, integer1);
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      player0.numActions = 2597;
      Card.getCard(list0, card_CardName0);
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      player0.numActions = 5;
      gameState0.play();
      player0.deck = list0;
      Card card0 = new Card(card_CardName0, card_Type0, 1678, (-1), 1);
      player0.played(card0);
      card0.toString();
      player0.discard(card0);
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      player0.buyCard();
      player0.gain(card0);
      card0.equals(player0);
      int int0 = player0.scoreFromPoints;
      player0.endTurn();
      Card.Type.values();
      Randomness.reset((-1L));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Randomness.reset(0L);
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      gameState0.toString();
      player0.buyCard();
      player0.playKingdomCard();
      player0.numActions = 0;
      player0.toString();
      player0.scoreFor();
      MockRandom mockRandom1 = (MockRandom)Randomness.random;
      player0.playTtreasureCard();
      Card.Type card_Type0 = Card.Type.CURSE;
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>((Map<? extends Card, ? extends Integer>) gameState0.gameBoard);
      hashMap0.values();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.getCard(vector0, card_CardName0);
      Integer integer0 = new Integer((-127));
      hashMap0.put((Card) null, integer0);
      gameState0.gameBoard = hashMap0;
      player0.trash = (List<Card>) vector0;
      player0.scoreFromPoints = (-1768);
      int int0 = player0.coins;
      Randomness.totalCallsToRandom = 1266;
      int int1 = player0.scoreFromPoints;
      Random.setNextRandom(3);
      player0.deck = (List<Card>) vector0;
      player0.toString();
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      player0.numActions = 5;
      gameState0.play();
      player0.deck = list0;
      Card card0 = new Card(card_CardName0, card_Type0, 1678, (-1), 1);
      player0.played(card0);
      card0.toString();
      player0.discard(card0);
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      Player player1 = new Player(gameState0, " \tSmithy-CURSE \t\t Cost: 1678 \t\t Score: -1 \tTreasure Value: 1");
      player0.deck = player1.hand;
      player0.buyCard();
      player1.gain(card0);
      card0.equals(player0);
      int int0 = player1.scoreFromPoints;
      player1.scoreFromPoints = 5;
      // Undeclared exception!
      try { 
        player1.endTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "2tB");
      player0.numActions = (-1);
      player0.playKingdomCard();
      Random.setNextRandom((-1));
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(arrayList0, card_CardName0);
      Card.Type card_Type0 = Card.Type.CURSE;
      List<Card> list0 = player0.hand;
      Card.getCard(list0, card_CardName0);
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        Card.filter(arrayList0, card_Type0);
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
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      gameState0.play();
      Card card0 = new Card(card_CardName0, card_Type0, 1678, (-1), 1);
      player0.played(card0);
      card0.toString();
      player0.discard(card0);
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      Player player1 = new Player(gameState0, " \tSmithy-CURSE \t\t Cost: 1678 \t\t Score: -1 \tTreasure Value: 1");
      player0.buyCard();
      player1.player_username = "";
      player1.gain(card0);
      card0.equals(player0);
      int int0 = player1.scoreFromPoints;
      player1.playKingdomCard();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type1 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type1, 3062, (-822), 1963);
      arrayList0.add(card0);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      player0.playedCards = (List<Card>) arrayList0;
      player0.scoreFromPoints = 3062;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.getWinners();
      stack0.sort((Comparator<? super Card>) null);
      Player player0 = new Player(gameState0, " has: ");
      player0.deck = (List<Card>) stack0;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Randomness.reset((-5L));
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.addScore(0);
      player0.hand = null;
      player0.scoreFromPoints = 1;
      player0.buyCard();
      player0.addCoins(1);
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName.values();
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      vector0.remove((Object) "!iA|4lMyysx");
      Player player0 = new Player(gameState0, "!iA|4lMyysx");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      gameState0.toString();
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2338), (-12), (-12));
      player0.trash(card0);
      vector0.add(card0);
      List<Card> list0 = player0.deck;
      int int0 = player0.numBuys;
      player0.toString();
      player0.gain(card0);
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Randomness.random = null;
      Randomness.totalCallsToRandom = 2569;
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, " treasure value: ");
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.CURSE;
      player0.addScore((-464));
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 2569);
      vector0.add((Card) null);
      vector0.add(card0);
      player0.toString();
      player0.playedCards = (List<Card>) vector0;
      vector0.add(card0);
      player0.playTtreasureCard();
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      player0.hand = list0;
      player0.numActions = 5;
      gameState0.play();
      player0.deck = list0;
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@9mg2<j#|?DI~");
      player0.discard = list0;
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      gameState0.play();
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.trash = list1;
      player0.scoreFor();
      player0.buyCard();
      Random.setNextRandom(1);
      player0.scoreFor();
      player0.initializePlayerTurn();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Randomness.reset((-5L));
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.addScore(0);
      player0.scoreFromPoints = 1;
      player0.buyCard();
      player0.addCoins(1);
      player0.playTtreasureCard();
      player0.toString();
      Randomness.totalCallsToRandom = (-1);
      player0.addCoins((-1));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Randomness.random = null;
      Randomness.totalCallsToRandom = 2569;
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, " treasure value: ");
      player0.numActions = 1970;
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.CURSE;
      gameState0.toString();
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 2569);
      vector0.add(card0);
      player0.toString();
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Randomness.totalCallsToRandom = 23;
      int int0 = Randomness.totalCallsToRandom;
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      arrayList0.parallelStream();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "~}u*gz\">Trbv");
      gameState0.addPlayer(player0);
      player0.addScore(23);
      arrayList0.clear();
      Player player1 = new Player(gameState0, "~}u*gz\">Trbv");
      gameState0.getWinners();
      ArrayList<Card> arrayList1 = null;
      try {
        arrayList1 = new ArrayList<Card>((-862));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -862
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "`");
      List<Card> list0 = player0.deck;
      player0.hand = list0;
      player0.numBuys = (-12);
      player0.buyCard();
      List<Card> list1 = player0.deck;
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      vector0.clone();
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      Card.CardName card_CardName0 = Card.CardName.Village;
      arrayDeque0.addLast(card_CardName0);
      vector0.removeAll(arrayDeque0);
      Player player0 = new Player(gameState0, "`wvIK,D8\"");
      int int0 = player0.scoreFromPoints;
      player0.numActions = 0;
      Randomness.random = null;
      Card.CardName card_CardName1 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName1, card_Type0, (-4828), 1, 1);
      player0.played(card0);
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
  public void test22()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.scoreFromPoints = 1;
      player0.buyCard();
      player0.addCoins(1);
      player0.playTtreasureCard();
      player0.playKingdomCard();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      Card card0 = new Card(card_CardName0, card_Type0, 1678, (-1), 1);
      player0.discard(card0);
      player0.playKingdomCard();
      player0.coins = 1;
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Player player0 = new Player((GameState) null, " --- ");
      player0.playTtreasureCard();
      player0.playKingdomCard();
      List<Card> list0 = player0.deck;
      player0.deck = list0;
      player0.playKingdomCard();
      Randomness.reset(0L);
      player0.addScore(469);
      Player player1 = new Player((GameState) null, " --- ");
      player1.scoreFromPoints = 469;
      player1.addScore(469);
      // Undeclared exception!
      try { 
        player0.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.discard((Card) null);
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
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "Y+pO=F=8~#^G|");
      player0.deck = (List<Card>) vector0;
      vector0.listIterator(0);
      List<Card> list0 = player0.hand;
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      player0.gain(card0);
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Randomness.reset(0L);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.getWinners();
      Player player0 = new Player(gameState0, "7~/X+JCk9\"O7&6f%");
      player0.hand = (List<Card>) linkedList0;
      player0.addCoins(0);
      player0.numBuys = 0;
      gameState0.initializeGame();
      player0.discard = (List<Card>) linkedList0;
      player0.numActions = 0;
      Card.CardName card_CardName0 = Card.CardName.Council_room;
      Card.getCard(linkedList0, card_CardName0);
      // Undeclared exception!
      try { 
        player0.played((Card) null);
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
      Player player0 = new Player((GameState) null, "|FnQ}#9O+qE(6[fi");
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
  public void test29()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.coins = 1;
      player0.addScore(1);
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
  public void test30()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "");
      player0.numActions = (-597);
      player0.addScore(0);
      player0.trash = null;
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "8P[");
      List<Card> list0 = player0.playedCards;
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Randomness.random = null;
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, (String) null);
      player0.scoreFor();
      player0.playTtreasureCard();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.CURSE;
      Card card0 = new Card(card_CardName0, card_Type0, 2, 1407, 1407);
      player0.discard(card0);
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
  public void test33()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "bY(||x6Ie`1L");
      player0.printStateGame();
      player0.scoreFor();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.gain((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Player player0 = new Player((GameState) null, " victory points");
      player0.scoreFromPoints = 1805;
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.gameBoard = gameState0.gameBoard;
      Player player0 = new Player(gameState0, "");
      player0.player_username = "";
      player0.playedCards = list0;
      player0.endTurn();
      player0.drawCard();
      player0.coins = (-19);
      player0.playTtreasureCard();
      player0.endTurn();
      Card card0 = player0.drawCard();
      card0.equals((Object) null);
      player0.playKingdomCard();
      player0.endTurn();
      player0.playKingdomCard();
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.gameBoard = gameState0.gameBoard;
      gameState0.gameBoard = gameState0.gameBoard;
      Integer integer0 = new Integer(2597);
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.gameBoard = gameState0.gameBoard;
      Player player0 = new Player(gameState0, "");
      player0.player_username = "";
      player0.playedCards = list0;
      player0.endTurn();
      player0.drawCard();
      player0.coins = (-19);
      player0.playTtreasureCard();
      player0.endTurn();
      Card card0 = player0.drawCard();
      Integer integer0 = new Integer(0);
      card0.equals((Object) null);
      gameState0.gameBoard.put(card0, integer0);
      player0.playKingdomCard();
      player0.endTurn();
      player0.playKingdomCard();
      player0.buyCard();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "p@m<?#|?DI~");
      player0.buyCard();
      List<Card> list1 = player0.playedCards;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.CURSE;
      player0.numActions = 5;
      gameState0.play();
      player0.deck = list0;
      Card card0 = new Card(card_CardName0, card_Type0, 1678, 5, 1);
      player0.played(card0);
      player0.discard(card0);
      Card card1 = player0.drawCard();
      card0.compareTo(card1);
      player0.playKingdomCard();
      Card.CardName.values();
      player0.coins = 1;
      player0.scoreFor();
      card0.equals(player0);
      Card.Type.values();
      Randomness.reset((-1L));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      int int0 = 1;
      gameState0.addPlayer(player0);
      player0.trash = null;
      player0.scoreFromPoints = 1;
      player0.numBuys = 1;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      player0.printStateGame();
      int int0 = 1;
      gameState0.addPlayer(player0);
      player0.trash = null;
      int int1 = 1;
      player0.coins = 1;
      player0.addScore(0);
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
  public void test42()  throws Throwable  {
      Randomness.reset((-5L));
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "3Dn~`'VX5LYOSER");
      player0.buyCard();
      player0.addCoins(1);
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "!iA|4lMyysx");
      Card.CardName card_CardName0 = Card.CardName.Gold;
      gameState0.toString();
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2338), 0, 0);
      player0.trash(card0);
      List<Card> list0 = player0.deck;
      int int0 = player0.numBuys;
      player0.toString();
      player0.gain(card0);
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}
