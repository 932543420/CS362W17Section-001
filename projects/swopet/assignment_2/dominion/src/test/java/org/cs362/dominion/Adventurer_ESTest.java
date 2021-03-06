/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:29:53 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Adventurer;
import org.cs362.dominion.GameState;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Adventurer_ESTest extends Adventurer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Adventurer adventurer0 = new Adventurer();
      // Undeclared exception!
      try { 
        adventurer0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Adventurer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Adventurer adventurer0 = new Adventurer();
      GameState gameState0 = new GameState(2, 2);
      gameState0.whoseTurn = 2;
      // Undeclared exception!
      try { 
        adventurer0.play(gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         assertThrownBy("org.cs362.dominion.Adventurer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Adventurer adventurer0 = new Adventurer();
      GameState gameState0 = new GameState(2, 0);
      gameState0.phase = (-872);
      Boolean boolean0 = adventurer0.play(gameState0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Adventurer adventurer0 = new Adventurer();
      GameState gameState0 = new GameState(2, 0);
      adventurer0.play(gameState0);
      adventurer0.play(gameState0);
      Boolean boolean0 = adventurer0.play(gameState0);
      assertTrue(boolean0);
  }
}
