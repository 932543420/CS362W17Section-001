/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:53:11 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ObjectStreamConstants;
import java.util.ArrayList;
import java.util.Comparator;
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

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false)
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(2354);
      Player player0 = new Player(gameState0, "HiRO4Y");
      Player player1 = player0.clone();
      player1.drawCard();
      Integer.toUnsignedString(40);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      gameState0.gameBoard = null;
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      gameState0.players = (List<Player>) linkedList0;
      GameState gameState1 = gameState0.clone();
      Player player0 = new Player(gameState1, "draw ");
      Player player1 = player0.clone();
      player1.numBuys = 1000000000;
      gameState0.addPlayer(player1);
      Card.Type.values();
      linkedList0.add(player0);
      gameState0.play();
      gameState0.play();
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
  public void test03()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState1.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState1.getWinners();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      vector0.sort((Comparator<? super Card>) null);
      gameState0.isGameOver();
      gameState0.play();
      Player player0 = new Player(gameState0, "Wp");
      vector0.containsAll(gameState0.players);
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>(0);
      gameState0.gameBoard = hashMap0;
      Card.getCard(vector0, card_CardName0);
      Card.getCard(vector0, card_CardName0);
      player0.gain((Card) null);
      List<Card> list0 = Card.createCards();
      player0.drawCard();
      vector0.add((Card) null);
      vector0.trimToSize();
      player0.playedCards = list0;
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.clone();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = new GameState(list0);
      Player player0 = new Player(gameState1, "");
      Player player1 = player0.clone();
      gameState0.embargoTokens = list0;
      gameState1.isGameOver();
      player1.playTreasureCard();
      player0.playedCards = gameState0.cards;
      gameState0.addPlayer(player1);
      gameState0.cards = list0;
      GameState gameState2 = gameState0.clone();
      gameState0.initializeGame();
      gameState2.toString();
      GameState.addEmbargo((Card) null);
      gameState0.embargoTokens = gameState1.cards;
      gameState2.getWinners();
      gameState2.isGameOver();
      gameState0.isGameOver();
      // Undeclared exception!
      try { 
        Card.Type.valueOf(")l12p$?`A6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.)l12p$?`A6
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      GameState gameState1 = gameState0.clone();
      gameState1.getWinners();
      assertNotSame(gameState1, gameState0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(2354);
      Integer.toUnsignedString((-4183));
      Player player0 = new Player(gameState0, "HiRO4Y");
      player0.drawCard();
      Integer.toUnsignedString(40);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = null;
      GameState.addEmbargo((Card) null);
      // Undeclared exception!
      try { 
        Card.Type.valueOf(")l12p$?`A6");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.)l12p$?`A6
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.Type[] card_TypeArray0 = Card.Type.values();
      Card.Type[] card_TypeArray1 = Card.Type.values();
      assertFalse(card_TypeArray1.equals((Object)card_TypeArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      GameState gameState1 = gameState0.clone();
      gameState0.isGameOver();
      gameState1.players = gameState0.players;
      gameState1.toString();
      gameState0.toString();
      GameState gameState2 = gameState1.clone();
      gameState0.play();
      gameState0.isGameOver();
      Player player0 = new Player(gameState1, "The board game is empty you need to initialize the game!!!!");
      gameState0.play();
      player0.initializePlayerTurn();
      player0.endTurn();
      player0.hand = gameState2.cards;
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_2;
      GameState gameState3 = gameState2.clone();
      gameState0.addPlayer(player0);
      gameState1.isGameOver();
      List<Card> list1 = gameState0.cards;
      gameState2.initializeGame();
      Card.CardName.values();
      gameState0.embargoTokens = player0.hand;
      gameState1.isGameOver();
      gameState1.toString();
      Card.CardName.values();
      Card.Type.values();
      gameState2.players = gameState0.players;
      gameState2.cards = gameState3.cards;
      gameState0.play();
      // Undeclared exception!
      try { 
        Card.Type.valueOf("?W'$\"Ufr6xN>");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.?W'$\"Ufr6xN>
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "#compare(Duration duration)");
      Player player1 = player0.clone();
      gameState0.addPlayer(player1);
      // Undeclared exception!
      try { 
        Card.CardName.valueOf("#");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.CardName.#
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      HashMap<Card, Integer> hashMap0 = gameState0.gameBoard;
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(gameState0.cards, card_CardName0);
      Integer integer0 = new Integer(2354);
      hashMap0.put(card0, integer0);
      Player player0 = new Player(gameState0, "p=td@fneJhFCq");
      player0.clone();
      Integer.toUnsignedString(40);
  }
}
