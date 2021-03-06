/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:25:06 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameState_ESTest extends GameState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
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
  public void test1()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
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
  public void test2()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.players = null;
      // Undeclared exception!
      try { 
        gameState0.addPlayer((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      String string0 = gameState0.toString();
      assertEquals("The board game is embty you need to intialize the game!!!!", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
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
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      HashMap<Player, Integer> hashMap0 = gameState0.getWinners();
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.addPlayer((Player) null);
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        gameState0.initializeGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GameState", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.initializeGame();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      gameState0.addPlayer((Player) null);
      gameState0.addPlayer((Player) null);
      gameState0.addPlayer((Player) null);
      gameState0.initializeGame();
  }
}
