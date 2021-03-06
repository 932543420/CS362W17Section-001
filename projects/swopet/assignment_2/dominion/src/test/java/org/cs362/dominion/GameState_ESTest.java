/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:22:55 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GameState gameState0 = new GameState(3, 2);
      gameState0.whoseTurn = 1;
      gameState0.turn();
      gameState0.getWinner();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GameState gameState0 = new GameState(2, 2);
      gameState0.kingdomCards = null;
      // Undeclared exception!
      try { 
        gameState0.turn();
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
      GameState gameState0 = new GameState(2, 2);
      List<List<Card>> list0 = gameState0.treasureCards;
      gameState0.victoryCards = list0;
      // Undeclared exception!
      try { 
        gameState0.turn();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3, Size: 3
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      gameState0.whoseTurn = 3;
      // Undeclared exception!
      try { 
        gameState0.turn();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = new GameState(3, 2);
      gameState0.players = null;
      // Undeclared exception!
      try { 
        gameState0.printWinner();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      gameState0.numPlayers = (-1372);
      // Undeclared exception!
      try { 
        gameState0.printWinner();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameState gameState0 = new GameState(3, 0);
      gameState0.players = null;
      // Undeclared exception!
      try { 
        gameState0.getWinner();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GameState gameState0 = new GameState(2, 2);
      gameState0.numPlayers = (-3521);
      // Undeclared exception!
      try { 
        gameState0.getWinner();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GameState gameState0 = new GameState(3, 24);
      gameState0.numPlayers = 24;
      // Undeclared exception!
      try { 
        gameState0.getWinner();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        GameState.emptyPile((List<Card>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GameState.numKingdomCards = 3;
      GameState gameState0 = null;
      try {
        gameState0 = new GameState(3, 3);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card card0 = new Card();
      linkedList0.add(card0);
      GameState.emptyPile(linkedList0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card();
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Boolean boolean0 = GameState.emptyPile(linkedList0);
      card0.token = boolean0;
      linkedList0.push(card0);
      GameState.emptyPile(linkedList0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Random.setNextRandom((-41));
      GameState gameState0 = new GameState(4, (-41));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState(2, 2);
      List<List<Card>> list0 = gameState0.victoryCards;
      gameState0.treasureCards = list0;
      assertEquals(4, gameState0.treasureCards.size());
      
      Boolean boolean0 = gameState0.turn();
      assertFalse(boolean0);
      
      int[] intArray0 = gameState0.getWinner();
      assertArrayEquals(new int[] {0, 6, 1}, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GameState gameState0 = null;
      try {
        gameState0 = new GameState(7, (-812));
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GameState gameState0 = null;
      try {
        gameState0 = new GameState(0, 8);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GameState gameState0 = new GameState(3, 2);
      gameState0.printWinner();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GameState gameState0 = new GameState(3, 2);
      Boolean boolean0 = gameState0.turn();
      assertFalse(boolean0);
      
      int[] intArray0 = gameState0.getWinner();
      assertArrayEquals(new int[] {1, 3, 0}, intArray0);
  }
}
