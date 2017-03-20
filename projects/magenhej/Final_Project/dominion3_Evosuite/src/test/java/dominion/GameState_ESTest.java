/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 01:57:07 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Card;
import dominion.GameState;
import dominion.Player;
import dominion.Randomness;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArrayDeque<Card> arrayDeque0 = new ArrayDeque<Card>((-2434));
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(arrayDeque0, card_Type0);
      GameState gameState0 = new GameState(list0);
      gameState0.play();
      Card.CardName.values();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, " is playing");
      gameState0.addPlayer(player0);
      Integer integer0 = new Integer(42);
      Integer.compareUnsigned(4, 4);
      Integer integer1 = new Integer((-2434));
      Integer.getInteger("the number of players mus be between 2 and 4 ", integer1);
      Integer integer2 = new Integer((-2434));
      Integer.max(396, 8);
      hashMap0.put((Card) null, integer0);
      gameState0.gameBoard = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Randomness.reset((-1784L));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      GameState gameState1 = gameState0.clone();
      GameState gameState2 = gameState1.clone();
      gameState1.initializeGame();
      gameState1.players = gameState0.players;
      gameState1.toString();
      gameState0.getWinners();
      gameState2.cards = gameState0.cards;
      Player player0 = new Player(gameState1, "Feast");
      Player player1 = player0.clone();
      player1.drawCard();
      gameState1.addPlayer(player1);
      gameState1.isGameOver();
      stack0.add((Card) null);
      gameState1.isGameOver();
      gameState2.toString();
      GameState gameState3 = new GameState((List<Card>) stack0);
      // Undeclared exception!
      try { 
        gameState0.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>(12);
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(arrayList0, card_CardName0);
      arrayList0.add((Card) null);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      Player player1 = player0.clone();
      player0.numBuys = (-1815);
      gameState0.addPlayer(player1);
      gameState0.addPlayer(player1);
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
  public void test04()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>(12);
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(arrayList0, card_CardName0);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      Player player1 = player0.clone();
      player0.numBuys = (-1815);
      gameState0.addPlayer(player1);
      gameState0.addPlayer(player1);
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
  public void test05()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>(12);
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(arrayList0, card_CardName0);
      arrayList0.add((Card) null);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.players = null;
      Player player1 = player0.clone();
      player0.numBuys = (-1815);
      // Undeclared exception!
      try { 
        gameState0.addPlayer(player1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.toString();
      gameState0.gameBoard = gameState0.gameBoard;
      linkedList0.iterator();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer((-3456));
      gameState0.gameBoard.put((Card) null, integer0);
      gameState0.isGameOver();
      gameState0.play();
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      GameState gameState1 = new GameState(gameState0.cards);
      gameState0.addPlayer(player0);
      gameState0.toString();
      gameState0.play();
      // Undeclared exception!
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      gameState0.cards = list1;
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      gameState0.clone();
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.toString();
      gameState0.getWinners();
      Vector<Card> vector0 = new Vector<Card>();
      gameState0.addPlayer(player0);
      // Undeclared exception!
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName.values();
      List<Card> list0 = null;
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      gameState0.gameBoard = hashMap0;
      Player player0 = new Player(gameState0, "t8l:Q%GQ`k)<bi?");
      player0.drawCard();
      Card.createCards();
      Integer integer0 = new Integer(1);
      hashMap0.put((Card) null, integer0);
      Player player1 = new Player(gameState0, "t8l:Q%GQ`k)<bi?");
      gameState0.addPlayer(player1);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.TreeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Randomness.reset(0L);
      gameState0.initializeGame();
      String string0 = gameState0.toString();
      assertEquals("The board game is empty you need to intialize the game!!!!", string0);
      
      HashMap<Player, Integer> hashMap0 = gameState0.play();
      HashMap<Player, Integer> hashMap1 = gameState0.getWinners();
      assertNotSame(hashMap1, hashMap0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Randomness.reset(0L);
      MockRandom mockRandom0 = new MockRandom();
      mockRandom0.nextGaussian();
      Randomness.random = (Random) mockRandom0;
      ArrayDeque<Card> arrayDeque0 = new ArrayDeque<Card>((-2918));
      Card.Type card_Type0 = Card.Type.VICTORY;
      List<Card> list0 = Card.filter(arrayDeque0, card_Type0);
      GameState gameState0 = new GameState(list0);
      gameState0.isGameOver();
      Player player0 = new Player(gameState0, " +n");
      player0.playKingdomCard();
      player0.toString();
      gameState0.addPlayer(player0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      gameState0.gameBoard = hashMap0;
      Object object0 = new Object();
      Integer integer0 = new Integer(0);
      player0.drawCard();
      hashMap0.remove((Object) integer0);
      hashMap0.put((Card) null, integer0);
      hashMap0.getOrDefault(object0, integer0);
      HashMap<Card, Integer> hashMap1 = gameState0.gameBoard;
      Card.CardName.values();
      Card.Type.values();
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      assertEquals(20, list0.size());
      
      GameState gameState1 = gameState0.clone();
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      String string0 = gameState0.toString();
      assertEquals("The board game is empty you need to intialize the game!!!!", string0);
      
      gameState0.getWinners();
      HashMap<Player, Integer> hashMap0 = gameState0.play();
      assertFalse(hashMap0.isEmpty());
      
      Vector<Card> vector0 = new Vector<Card>();
      gameState0.addPlayer(player0);
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      gameState0.initializeGame();
      GameState gameState2 = gameState1.clone();
      assertNotSame(gameState2, gameState1);
  }
}