/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 14 08:47:05 GMT 2017
 */

package org.cs325.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.cs325.dominion.Card;
import org.cs325.dominion.GameState;
import org.cs325.dominion.Player;
import org.cs325.dominion.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 2917, 2917, 1);
      linkedList0.offer(card0);
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "cFAIz#kn=5T:1:qjnA");
      gameState0.addPlayer(player0);
      linkedList0.pollFirst();
      Card.CardName.values();
      GameState.addEmbargo(card0);
      gameState0.initializeGame();
      player0.playKingdomCard();
      gameState0.addPlayer(player0);
      linkedList0.add(card0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      hashMap0.values();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(stack0, card_CardName0);
      Integer integer0 = Integer.getInteger("T&/c`OC*28i}1c", (-3052));
      Integer integer1 = Integer.getInteger("", integer0);
      hashMap0.put((Card) null, integer1);
      Card.getCard(stack0, card_CardName0);
      GameState.addEmbargo((Card) null);
      Card.getCard(stack0, card_CardName0);
      GameState.addEmbargo((Card) null);
      gameState0.isGameOver();
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap1;
      Randomness.reset(0L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.getWinners();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState.addEmbargo((Card) null);
      Player player0 = new Player((GameState) null, "+2 Coins, Trash this Card, Place Embargo token on a supply pile");
      List<Card> list0 = player0.discard;
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      player0.player_username = "";
      player0.discard = gameState0.cards;
      gameState0.addPlayer(player0);
      gameState0.gameBoard = null;
      Card.Type.values();
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.getCard(arrayList0, card_CardName0);
      arrayList0.add((Card) null);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName.values();
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      Player player0 = new Player(gameState0, "Ambassador");
      gameState0.addPlayer(player0);
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1003, 1003, 3);
      Integer integer0 = new Integer(1003);
      Integer.divideUnsigned(3, 46);
      hashMap0.put(card0, integer0);
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap1;
      gameState0.toString();
      HashMap<Card, Integer> hashMap2 = gameState0.gameBoard;
      hashMap0.putAll(hashMap2);
      gameState0.getWinners();
      gameState0.toString();
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Randomness.reset((-1L));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      Player player0 = new Player(gameState0, "3wT~oiTct");
      gameState0.addPlayer(player0);
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(40);
      hashMap0.put((Card) null, integer0);
      gameState0.play();
      linkedList0.sort((Comparator<? super Card>) null);
      linkedList0.add((Card) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.ACTION;
      int int0 = 2917;
      Card card0 = new Card(card_CardName0, card_Type0, 2917, 2917, 1);
      linkedList0.offer(card0);
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "ctAIz#Cn=5T:1:qjnA");
      gameState0.addPlayer(player0);
      linkedList0.pollFirst();
      Card.CardName.values();
      GameState.addEmbargo(card0);
      gameState0.initializeGame();
      player0.playKingdomCard();
      gameState0.addPlayer(player0);
      linkedList0.add(card0);
      // Undeclared exception!
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.VICTORY;
      int int0 = 2917;
      Card card0 = new Card(card_CardName0, card_Type0, 2917, 2917, 1);
      linkedList0.offer(card0);
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "cFAIz#kn=5T:1:qjnA");
      gameState0.addPlayer(player0);
      linkedList0.pollFirst();
      Card.CardName.values();
      GameState.addEmbargo(card0);
      gameState0.initializeGame();
      player0.playKingdomCard();
      gameState0.addPlayer(player0);
      linkedList0.add(card0);
      // Undeclared exception!
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashSet<Card> linkedHashSet0 = new LinkedHashSet<Card>();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.filter(linkedHashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      gameState0.toString();
      gameState0.addPlayer((Player) null);
      Card.CardName.values();
      gameState0.toString();
      gameState0.initializeGame();
      linkedHashSet0.spliterator();
      gameState0.initializeGame();
      Card.CardName.values();
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      hashMap0.values();
      gameState0.gameBoard = hashMap0;
      gameState0.play();
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(stack0, card_CardName0);
      Integer integer0 = Integer.getInteger("T&/c`OC*28i}1c", (-3052));
      Integer.getInteger("", integer0);
      Integer integer1 = new Integer((-3052));
      Card.CardName card_CardName1 = Card.CardName.Adventurer;
      Integer integer2 = new Integer(0);
      hashMap0.put((Card) null, integer2);
      Card.getCard(stack0, card_CardName1);
      GameState gameState1 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState1, "Y$]B");
      gameState0.addPlayer(player0);
      GameState.addEmbargo((Card) null);
      Card.getCard(stack0, card_CardName0);
      GameState.addEmbargo((Card) null);
      gameState0.isGameOver();
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      Randomness.reset(0L);
      // Undeclared exception!
      try { 
        Card.Type.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         verifyException("java.lang.Enum", e);
      }
  }
}
