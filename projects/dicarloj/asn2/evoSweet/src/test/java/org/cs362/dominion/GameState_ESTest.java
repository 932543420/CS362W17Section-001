/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 09:07:26 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
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
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.useingCards = (List<Card>) arrayList0;
      gameState0.players = null;
      gameState0.isGameOver();
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, "5");
      Player player1 = player0.clone();
      // Undeclared exception!
      try { 
        gameState0.addPlayer(player1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      GameState gameState1 = gameState0.clone();
      linkedList0.remove((Object) gameState0);
      gameState0.isGameOver();
      gameState1.cards = (List<Card>) linkedList0;
      GameState gameState2 = gameState1.clone();
      ArrayList<Player> arrayList0 = new ArrayList<Player>((Collection<? extends Player>) gameState0.players);
      gameState2.players = (List<Player>) arrayList0;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      gameState1.toString();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState2.gameBoard = hashMap0;
      hashMap0.remove((Object) arrayList0, (Object) gameState0);
      gameState2.initializeGame();
      Randomness.reset(0L);
      gameState2.embargod = gameState0.embargod;
      gameState1.useingCards = null;
      Player player0 = new Player(gameState2, "N&Zw $Vn|ztc009");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer integer0 = new Integer((-16));
      hashMap0.put((Card) null, integer0);
      GameState gameState3 = new GameState(gameState1.cards);
      Randomness.reset(0L);
      Randomness.reset(0L);
      Integer integer1 = new Integer(12);
      Player player2 = new Player(gameState1, "N&Zw $Vn|ztc009");
      Player player3 = player2.clone();
      arrayList0.add(player3);
      hashMap0.put((Card) null, integer1);
      // Undeclared exception!
      try { 
        gameState2.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.play();
      GameState gameState1 = new GameState(list0);
      gameState0.getWinners();
      gameState1.useingCards = list0;
      gameState1.clone();
      gameState1.cards = null;
      // Undeclared exception!
      try { 
        gameState1.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      linkedList0.remove((Object) gameState0);
      GameState gameState1 = gameState0.clone();
      ArrayList<Player> arrayList0 = new ArrayList<Player>((Collection<? extends Player>) gameState0.players);
      gameState1.players = (List<Player>) arrayList0;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      gameState0.toString();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState1.gameBoard = hashMap0;
      hashMap0.remove((Object) arrayList0, (Object) gameState0);
      gameState1.initializeGame();
      Randomness.reset(0L);
      gameState1.embargod = gameState0.embargod;
      Player player0 = new Player(gameState1, "N&Zw $Vn|ztc009");
      Player player1 = player0.clone();
      player1.drawCard();
      player0.numActions = 10;
      Integer integer0 = new Integer(0);
      hashMap0.put((Card) null, integer0);
      GameState gameState2 = new GameState(gameState0.cards);
      Randomness.reset(0L);
      Randomness.reset(0L);
      gameState1.play();
      gameState1.initializeGame();
      gameState1.getWinners();
      Card.CardName.values();
      // Undeclared exception!
      try { 
        gameState1.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, "");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      gameState0.getWinners();
      Card.Type.values();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashSet<Card> hashSet0 = new HashSet<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(hashSet0, card_Type0);
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.clone();
      gameState0.initializeGame();
      Player player0 = new Player(gameState0, "");
      LinkedList<Card> linkedList0 = player0.deck;
      player0.drawCard();
      linkedList0.add((Card) null);
      GameState gameState2 = new GameState((List<Card>) linkedList0);
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(gameState1.cards, card_CardName0);
      linkedList0.add((Card) null);
      // Undeclared exception!
      try { 
        gameState2.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.useingCards = (List<Card>) arrayList0;
      gameState0.players = null;
      gameState0.isGameOver();
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      gameState0.addPlayer((Player) null);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      ArrayList<Player> arrayList1 = new ArrayList<Player>();
      gameState0.players = (List<Player>) arrayList1;
      gameState0.addPlayer(player0);
      GameState gameState1 = gameState0.clone();
      gameState1.embargod = (Map<Card, Integer>) gameState0.gameBoard;
      gameState1.embargod = (Map<Card, Integer>) gameState0.gameBoard;
      arrayList1.add(player0);
      GameState gameState2 = new GameState(gameState0.cards);
      Randomness.reset(2731L);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.useingCards = list0;
      gameState0.play();
      GameState gameState1 = gameState0.clone();
      gameState1.cards = gameState0.useingCards;
      GameState gameState2 = new GameState(gameState1.cards);
      String string0 = "O-CN9[)E]a$Ox09~";
      gameState1.players = gameState0.players;
      Player player0 = new Player(gameState2, "O-CN9[)E]a$Ox09~");
      player0.playedCards = null;
      gameState2.addPlayer(player0);
      gameState2.play();
      List<Player> list1 = gameState2.players;
      gameState1.cards = null;
      gameState2.initializeGame();
      gameState0.embargod = gameState2.embargod;
      Randomness.reset((-923L));
      gameState1.addPlayer(player0);
      Card.Type.values();
      Randomness.reset((-923L));
      gameState2.addPlayer(player0);
      Map<Card, Integer> map0 = gameState0.embargod;
      // Undeclared exception!
      gameState2.initializeGame();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Player player0 = new Player(gameState0, "EndTurn ");
      player0.clone();
      Integer integer0 = new Integer(0);
      gameState0.gameBoard = hashMap0;
      gameState0.embargod = (Map<Card, Integer>) hashMap0;
      GameState gameState1 = gameState0.clone();
      gameState0.useingCards = gameState1.cards;
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      Card.createCards();
      hashMap0.put(card0, (Integer) null);
      Card.Type.values();
      Card.CardName.values();
      gameState0.toString();
      gameState0.cards = list0;
      gameState0.getWinners();
      gameState0.getWinners();
      gameState0.initializeGame();
      gameState0.clone();
      Map<Card, Integer> map0 = gameState1.embargod;
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.CardName.values();
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState1.isGameOver();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      GameState gameState1 = gameState0.clone();
      linkedList0.remove((Object) gameState0);
      gameState0.isGameOver();
      gameState1.cards = (List<Card>) linkedList0;
      GameState gameState2 = gameState1.clone();
      ArrayList<Player> arrayList0 = new ArrayList<Player>((Collection<? extends Player>) gameState0.players);
      gameState2.players = (List<Player>) arrayList0;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState2.gameBoard = hashMap0;
      hashMap0.remove((Object) arrayList0, (Object) gameState0);
      gameState2.initializeGame();
      Randomness.reset(0L);
      gameState2.embargod = gameState0.embargod;
      gameState1.useingCards = null;
      Player player0 = new Player(gameState2, "N&Zw $Vn|ztc009");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer integer0 = new Integer((-16));
      hashMap0.put((Card) null, integer0);
      Randomness.reset(0L);
      Randomness.reset(0L);
      // Undeclared exception!
      gameState2.play();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "Ambassador");
      Player player1 = player0.clone();
      player1.toString();
      gameState0.addPlayer(player1);
      player0.addAction((-1023));
      gameState0.addPlayer(player1);
      List<Player> list0 = gameState0.players;
      Randomness.reset(1434L);
      GameState gameState1 = new GameState(gameState0.cards);
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState1.players = (List<Player>) linkedList0;
      Player player2 = player1.clone();
      gameState0.addPlayer(player2);
      List<Card> list1 = gameState1.useingCards;
      gameState0.isGameOver();
      gameState0.play();
      gameState0.isGameOver();
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
  public void test14()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      GameState gameState1 = gameState0.clone();
      linkedList0.remove((Object) gameState0);
      gameState0.isGameOver();
      gameState1.cards = (List<Card>) linkedList0;
      GameState gameState2 = gameState1.clone();
      ArrayList<Player> arrayList0 = new ArrayList<Player>((Collection<? extends Player>) gameState0.players);
      gameState2.players = (List<Player>) arrayList0;
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      gameState1.toString();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState2.gameBoard = hashMap0;
      gameState2.initializeGame();
      Randomness.reset(0L);
      gameState1.useingCards = null;
      Player player0 = new Player(gameState2, "N&Zw $Vn|ztc009");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer integer0 = new Integer(11);
      hashMap0.put((Card) null, integer0);
      GameState gameState3 = new GameState(gameState1.cards);
      arrayList0.add(player1);
      Randomness.reset(0L);
      Randomness.reset(0L);
      // Undeclared exception!
      try { 
        gameState2.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }
}
