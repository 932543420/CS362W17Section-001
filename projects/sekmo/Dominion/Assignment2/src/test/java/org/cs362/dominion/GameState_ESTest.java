/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:35:18 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Integer integer0 = new Integer((-744));
      gameState0.gameBoard.put((Card) null, integer0);
      HashMap<Player, Integer> hashMap0 = gameState0.play();
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
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
      Player player0 = new Player((GameState) null, "D]}._T_8/Rp(x");
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player0);
      gameState0.players = (List<Player>) vector0;
      HashMap<Player, Integer> hashMap0 = gameState0.play();
      assertFalse(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "d%X52^*M<{ld_l");
      gameState0.addPlayer(player0);
      HashMap<Player, Integer> hashMap0 = gameState0.getWinners();
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "D]}._T_[/Rp(x");
      List<Card> list0 = player0.discard;
      GameState gameState0 = new GameState(list0);
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player0);
      gameState0.players = (List<Player>) vector0;
      player0.hand = list0;
      Integer integer0 = new Integer(564);
      gameState0.gameBoard.put((Card) null, integer0);
      // Undeclared exception!
      gameState0.play();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add((Card) null);
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
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
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      String string0 = gameState0.toString();
      assertEquals("The board game is embty you need to intialize the game!!!!", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Player, Integer> hashMap0 = gameState0.getWinners();
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Integer integer0 = new Integer(1);
      gameState0.gameBoard.put((Card) null, integer0);
      boolean boolean0 = gameState0.isGameOver();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      boolean boolean0 = gameState0.isGameOver();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Integer integer0 = new Integer((-744));
      gameState0.gameBoard.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      assertEquals(20, list0.size());
      
      GameState gameState1 = gameState0.clone();
      assertNotSame(gameState1, gameState0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      assertNotNull(card0);
      
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      Integer integer0 = new Integer(835);
      gameState0.gameBoard.put(card0, integer0);
      String string0 = gameState0.toString();
      assertEquals(" ---  ---  ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 0coinss: 0numBuys: 0\n\n --- gameBoard --- \nCards on the table: \nCard Name \t\t NumberCards: \n\t GreatHall\t\t 835\n", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Integer integer0 = new Integer(1);
      gameState0.gameBoard.put((Card) null, integer0);
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Integer integer0 = new Integer(0);
      gameState0.gameBoard.put((Card) null, integer0);
      boolean boolean0 = gameState0.isGameOver();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player((GameState) null, "D]}._T_[/Rp(x");
      List<Card> list0 = player0.discard;
      GameState gameState0 = new GameState(list0);
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player0);
      gameState0.players = (List<Player>) vector0;
      Integer integer0 = new Integer(564);
      gameState0.gameBoard.put((Card) null, integer0);
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
  public void test17()  throws Throwable  {
      Player player0 = new Player((GameState) null, "D]}._T_8/Rp(x");
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Vector<Player> vector0 = new Vector<Player>();
      vector0.add(player0);
      vector0.add(player0);
      gameState0.players = (List<Player>) vector0;
      // Undeclared exception!
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, (String) null);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.addPlayer(player0);
      gameState0.initializeGame();
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.addPlayer((Player) null);
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
  public void test20()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      gameState0.initializeGame();
  }
}
