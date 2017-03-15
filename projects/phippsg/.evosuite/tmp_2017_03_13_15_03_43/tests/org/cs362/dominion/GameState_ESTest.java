/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 13 22:06:58 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GameState gameState0 = new GameState(520);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card card0 = new Card("");
      Integer integer0 = new Integer(0);
      hashMap0.put(card0, integer0);
      gameState0.supply = hashMap0;
      Card card1 = gameState0.getRandCard();
      HashMap<Card, Integer> hashMap1 = gameState0.supply;
      gameState0.getSupplyVal(card1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GameState gameState0 = new GameState((-327));
      HashMap<Card, Integer> hashMap0 = gameState0.supply;
      gameState0.embargoList = hashMap0;
      Card card0 = new Card("%'0C[{7&sq9O[deng)");
      gameState0.supply = hashMap0;
      Integer integer0 = new Integer((-327));
      Integer.min((-327), (-327));
      hashMap0.put(card0, integer0);
      HashMap<Card, Integer> hashMap1 = gameState0.supply;
      gameState0.supply = hashMap1;
      gameState0.getSupplyVal(card0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GameState gameState0 = new GameState(58);
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.getSupplyVal((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GameState gameState0 = new GameState(9976);
      // Undeclared exception!
      try { 
        gameState0.getWinner();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GameState gameState0 = null;
      try {
        gameState0 = new GameState(2241679);
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
      GameState gameState0 = new GameState(0);
      // Undeclared exception!
      try { 
        gameState0.getWinner();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0 >= 0
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GameState gameState0 = new GameState(0);
      HashMap<Card, Integer> hashMap0 = gameState0.embargoList;
      gameState0.embargoList = hashMap0;
      gameState0.supply = null;
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.getRandCard();
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
      GameState gameState0 = new GameState(0);
      // Undeclared exception!
      try { 
        gameState0.embargo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GameState gameState0 = new GameState(3402);
      gameState0.getWinner();
      gameState0.initializeGame();
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card card0 = new Card("b");
      Integer integer0 = Integer.getInteger("", 3408);
      hashMap0.put(card0, integer0);
      gameState0.supply = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.play();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int int0 = 162;
      GameState gameState0 = new GameState(162);
      Card card0 = null;
      Player player0 = gameState0.getWinner();
      // Undeclared exception!
      try { 
        gameState0.gain((Card) null, player0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GameState gameState0 = new GameState(520);
      HashMap<Card, Integer> hashMap0 = new HashMap<Card, Integer>();
      Card card0 = new Card("");
      Integer integer0 = new Integer(0);
      hashMap0.put(card0, integer0);
      gameState0.supply = hashMap0;
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GameState gameState0 = new GameState(0);
      Random.setNextRandom(0);
      gameState0.initializeGame();
      // Undeclared exception!
      try { 
        gameState0.getRandCard();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GameState gameState0 = new GameState((-327));
      HashMap<Card, Integer> hashMap0 = gameState0.supply;
      gameState0.embargoList = hashMap0;
      Card card0 = new Card("%'0C[{7&sq9O[deng)");
      gameState0.supply = hashMap0;
      Integer integer0 = new Integer((-327));
      Integer.min(0, 0);
      hashMap0.put(card0, integer0);
      HashMap<Card, Integer> hashMap1 = gameState0.supply;
      gameState0.supply = hashMap1;
      // Undeclared exception!
      try { 
        gameState0.isGameOver();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = 2;
      GameState gameState0 = new GameState(2);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }
}
