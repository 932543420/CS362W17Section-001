/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:39:50 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.GameState;
import org.cs362.dominion.GreatHall;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GreatHall_ESTest extends GreatHall_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GreatHall greatHall0 = new GreatHall();
      GameState gameState0 = new GameState(3, 498);
      gameState0.phase = (-1355);
      Boolean boolean0 = greatHall0.play(gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GreatHall greatHall0 = new GreatHall();
      // Undeclared exception!
      try { 
        greatHall0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.GreatHall", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      GreatHall greatHall0 = new GreatHall();
      gameState0.turn();
      Boolean boolean0 = greatHall0.play(gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GameState gameState0 = new GameState(3, 3);
      GreatHall greatHall0 = new GreatHall();
      Boolean boolean0 = greatHall0.play(gameState0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GreatHall greatHall0 = new GreatHall();
      GameState gameState0 = new GameState(4, 4);
      gameState0.whoseTurn = 4;
      // Undeclared exception!
      try { 
        greatHall0.play(gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         assertThrownBy("org.cs362.dominion.GreatHall", e);
      }
  }
}
