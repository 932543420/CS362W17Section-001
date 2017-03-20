/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 01 04:43:44 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
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
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "<`^>7W|8W7Nk7%$2\"Co", 0);
      Player player1 = player0.clone();
      player1.discard = null;
      player1.hand = (List<Card>) arrayList0;
      int int0 = gameState0.embargo;
      player0.toString();
      player1.numSmithy = (-4030);
      Randomness.totalCallsToRandom = 0;
      int int1 = player1.numBuys;
      player0.AI_type = 0;
      Random.setNextRandom(0);
      player0.drawCard();
      player1.numBuys = 0;
      player1.playTtreasureCard();
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

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.initializePlayerTurn();
      player0.discard(card0);
      player0.scoreFor();
      player0.initializePlayerTurn();
      gameState0.embargo = (-45);
      player0.buyCard(gameState0, card0);
      player0.clone();
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(25L);
      player0.playKingdomCard();
      player0.numSmithy = 11;
      List<Card> list1 = player0.discard;
      gameState0.embargo = gameState0.embargo;
      player0.modifyCoins(1);
      player0.scoreFor();
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0, card0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = new GameState(gameState0.cards);
      gameState0.gameBoard = gameState1.gameBoard;
      gameState0.isGameOver();
      Player player0 = new Player(gameState1, "VICTORY", (-3056));
      List<Card> list1 = player0.hand;
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      player0.discard(card0);
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
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.playKingdomCard();
      player0.scoreFor();
      gameState0.embargo = (-45);
      Player player1 = player0.clone();
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(0L);
      player0.playKingdomCard();
      List<Card> list1 = player0.discard;
      player0.coins = 11;
      player0.modifyCoins(22);
      List<Card> list2 = player0.hand;
      player1.numBuys = 11;
      List<Card> list3 = player0.playedCards;
      Card card0 = player0.drawCard();
      player0.gain(card0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.Type.values();
      Player player0 = new Player((GameState) null, ":w4MGlV?\u0000E ojf$", 354);
      player0.numActions = 354;
      Player player1 = player0.clone();
      List<Card> list0 = Card.createCards();
      player1.hand = list0;
      player1.scoreFor();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.discard(card0);
      player0.scoreFor();
      gameState0.embargo = (-45);
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(0L);
      player0.playKingdomCard();
      List<Card> list1 = player0.discard;
      player0.coins = 11;
      player0.modifyCoins(1);
      player0.drawCard();
      Player player1 = new Player(gameState0, " \n\tGold", 525);
      int int1 = player1.numActions;
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<`^>7W|8W7Nk7%$2\"Co", 0);
      Player player1 = player0.clone();
      player1.discard = list0;
      player1.hand = list0;
      player0.scoreFor();
      player0.toString();
      player1.numSmithy = (-4030);
      Randomness.totalCallsToRandom = 0;
      player0.coins = 104;
      int int0 = player1.numBuys;
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.getCard(player1.discard, card_CardName0);
      gameState0.embargo = 0;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<`^>7W|8W7Nk7%$2\"Co", 0);
      Player player1 = player0.clone();
      player1.discard = list0;
      player1.hand = list0;
      player0.scoreFor();
      player0.toString();
      player1.numSmithy = (-4030);
      Randomness.totalCallsToRandom = 0;
      int int0 = player1.numBuys;
      player0.AI_type = 0;
      player0.toString();
      gameState0.initializeGame();
      player0.numSmithy = 0;
      player1.numBuys = 0;
      player1.playTtreasureCard();
      player1.clone();
      // Undeclared exception!
      try { 
        player1.endTurn();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "", (-1313));
      Player player1 = new Player(gameState0, "", (-1313));
      player1.modifyBuy((-1470));
      player0.playTtreasureCard();
      GameState gameState1 = new GameState((List<Card>) null);
      player0.drawCard();
      player1.buyCard(gameState1, (Card) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "o#n`{5", 0);
      Player player1 = player0.clone();
      arrayList0.parallelStream();
      player1.drawCard();
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        player1.playTtreasureCard();
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
      Randomness.totalCallsToRandom = 28;
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "ts){CP=.Sb~(,%", 28);
      gameState0.getWinners();
      Player player1 = player0.clone();
      gameState0.getWinners();
      player0.drawCard();
      player1.hand = null;
      player1.numBuys = 60000;
      // Undeclared exception!
      try { 
        player1.buyCard(gameState0, (Card) null);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "T)C?aSL(;?a;6", 700);
      gameState1.getWinners();
      gameState0.players = gameState1.players;
      Player player1 = player0.clone();
      String string0 = player1.player_username;
      gameState1.cards = gameState0.cards;
      gameState0.getWinners();
      player1.player_username = "Gold";
      player0.modifyCoins(700);
      player0.toString();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.drawCard();
      linkedList0.add((Card) null);
      List<Card> list0 = player1.discard;
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(list0, card_CardName0);
      linkedList0.add((Card) null);
      player1.deck = linkedList0;
      Player player2 = player0.clone();
      // Undeclared exception!
      try { 
        player2.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.toString();
      Player player0 = new Player(gameState0, "e=q_$em>%;Y", 0);
      Player player1 = player0.clone();
      player1.modifyAction(3);
      player1.toString();
      player0.hand = null;
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player((GameState) null, "W NBP,xS^sQcn=iZx", 801);
      player0.numAdventurer = 801;
      Player player1 = player0.clone();
      // Undeclared exception!
      try { 
        player1.printStateGame();
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
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      TreeSet<Card> treeSet1 = new TreeSet<Card>((SortedSet<Card>) treeSet0);
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(treeSet1, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 1831);
      player0.numSmithy = 115;
      LinkedList<Card> linkedList0 = player0.deck;
      player0.toString();
      Randomness.reset(0);
      player0.drawCard();
      // Undeclared exception!
      try { 
        linkedList0.add((-1172), (Card) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1172, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      GameState gameState1 = gameState0.clone();
      gameState0.isGameOver();
      Player player0 = new Player(gameState1, "", Integer.MIN_VALUE);
      player0.drawCard();
      vector0.add((Card) null);
      GameState gameState2 = new GameState((List<Card>) vector0);
      gameState2.cards = (List<Card>) vector0;
      Player player1 = new Player(gameState2, "dJ|)MD'vLL`", 1970);
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

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((GameState) null, "", 2105);
      player0.numActions = 0;
      player0.modifyAction(60000);
      player0.modifyAction((-57));
      LinkedHashSet<Card> linkedHashSet0 = null;
      try {
        linkedHashSet0 = new LinkedHashSet<Card>((-57));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -57
         //
         assertThrownBy("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "Gardens", 0);
      Player player1 = player0.clone();
      player1.modifyAction(2141);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, " ends his turn.", 0);
      player0.playTtreasureCard();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "#ivX", 2);
      Player player1 = player0.clone();
      player1.toString();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "_!jiLB'!", 5);
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

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState1.cards = (List<Card>) arrayList0;
      Player player0 = new Player(gameState1, "q", 0);
      player0.clone();
      player0.drawCard();
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
  public void test22()  throws Throwable  {
      HashSet<Card> hashSet0 = new HashSet<Card>(0);
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(hashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.getWinners();
      gameState0.play();
      Player player0 = new Player(gameState1, (String) null, 6);
      player0.AI_type = (-169);
      int int0 = player0.numActions;
      int int1 = player0.numAdventurer;
      player0.drawCard();
      Randomness.random = null;
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
  public void test23()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "@@n>sF^@k,", 0);
      player0.modifyBuy(0);
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
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      player0.playKingdomCard();
      player0.scoreFor();
      gameState0.embargo = (-45);
      player0.clone();
      gameState0.embargo = 11;
      player0.numAdventurer = 2;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(0L);
      player0.playKingdomCard();
      List<Card> list1 = player0.discard;
      player0.player_username = null;
      player0.coins = 11;
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.numBuys = 0;
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.discard(card0);
      player0.scoreFor();
      gameState0.embargo = (-45);
      player0.clone();
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(0L);
      player0.playKingdomCard();
      List<Card> list1 = player0.discard;
      player0.coins = 11;
      player0.coins = 0;
      player0.modifyCoins(1);
      player0.scoreFor();
      player0.buyCard(gameState0, card0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.initializePlayerTurn();
      player0.discard(card0);
      player0.scoreFor();
      player0.initializePlayerTurn();
      gameState0.embargo = (-45);
      player0.buyCard(gameState0, card0);
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Card.createCards();
      player0.endTurn();
      Randomness.reset(25L);
      player0.playKingdomCard();
      player0.numSmithy = 11;
      List<Card> list1 = player0.discard;
      player0.coins = 11;
      player0.modifyCoins(1);
      player0.scoreFor();
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0, card0);
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
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.initializePlayerTurn();
      player0.discard(card0);
      player0.scoreFor();
      player0.initializePlayerTurn();
      gameState0.embargo = (-45);
      player0.buyCard(gameState0, card0);
      player0.clone();
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(25L);
      player0.playKingdomCard();
      player0.numSmithy = (-45);
      List<Card> list1 = player0.discard;
      player0.coins = 11;
      player0.modifyCoins((-5));
      player0.scoreFor();
      // Undeclared exception!
      try { 
        player0.buyCard(gameState0, card0);
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
      Player player0 = new Player(gameState0, (String) null, 0);
      player0.discard = list0;
      int int0 = player0.numActions;
      gameState0.play();
      player0.playKingdomCard();
      Card card0 = player0.drawCard();
      card0.toString();
      player0.initializePlayerTurn();
      player0.discard(card0);
      player0.scoreFor();
      player0.initializePlayerTurn();
      gameState0.embargo = (-45);
      player0.buyCard(gameState0, card0);
      Card card1 = player0.drawCard();
      card0.compareTo(card1);
      Player player1 = player0.clone();
      gameState0.embargo = 11;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      player0.endTurn();
      Randomness.reset(25L);
      player0.playKingdomCard();
      player0.numSmithy = 11;
      List<Card> list1 = player0.discard;
      player1.buyCard(gameState0, card1);
      player0.coins = 0;
      player0.modifyCoins((-5));
      player0.scoreFor();
      player0.buyCard(gameState0, card0);
      player0.initializePlayerTurn();
      player0.player_username = " \n\tGold";
      player1.drawCard();
      player1.playedCards = gameState0.cards;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
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
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<`^>7W|8W7Nk7%$2\"Co", 0);
      Player player1 = player0.clone();
      player1.discard = list0;
      player1.hand = list0;
      player0.scoreFor();
      player0.toString();
      player1.numSmithy = 0;
      Randomness.totalCallsToRandom = 0;
      int int0 = player1.numBuys;
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card card0 = Card.getCard(player1.discard, card_CardName0);
      gameState0.embargo = 0;
      boolean boolean0 = player0.gain(card0);
      assertTrue(boolean0);
      
      String string0 = player0.toString();
      assertEquals(" --- <`^>7W|8W7Nk7%$2\"Co ---  --- --------------------------- --- Hand: []Discard: [null]Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n", string0);
      
      Random.setNextRandom(0);
      player0.drawCard();
      player0.numSmithy = 0;
      player1.numBuys = 0;
      player1.playTtreasureCard();
      player1.clone();
      assertNotSame(player0, player1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "<`^>7W|8W7Nk7%$2\"Co", 0);
      Player player1 = player0.clone();
      player1.discard = gameState0.cards;
      player1.hand = list0;
      int int0 = gameState0.embargo;
      String string0 = player0.toString();
      assertEquals(" --- <`^>7W|8W7Nk7%$2\"Co ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n", string0);
      
      player1.numSmithy = (-4030);
      Randomness.totalCallsToRandom = 0;
      int int1 = player1.numBuys;
      player0.AI_type = 0;
      Random.setNextRandom(0);
      player0.drawCard();
      player1.numBuys = 0;
      player1.playTtreasureCard();
      Player player2 = player1.clone();
      assertNotSame(player2, player0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "numBuys: ", 0);
      player0.printStateGame();
      gameState0.embargo = 579;
      gameState0.addPlayer(player0);
      int int0 = player0.numActions;
      player0.playKingdomCard();
      player0.modifyBuy(8);
      Card.Type.values();
      player0.toString();
      player0.clone();
      player0.modifyBuy(579);
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, "VICTORY", (-3056));
      List<Card> list1 = player0.hand;
      player0.scoreFor();
      player0.printStateGame();
      player0.modifyAction((-3056));
      // Undeclared exception!
      try { 
        Card.CardName.valueOf("VICTORY");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.CardName.VICTORY
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }
}