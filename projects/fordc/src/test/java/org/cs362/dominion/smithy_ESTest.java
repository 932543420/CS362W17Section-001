/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:37:59 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.board;
import org.cs362.dominion.hand;
import org.cs362.dominion.player;
import org.cs362.dominion.smithy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class smithy_ESTest extends smithy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      smithy smithy0 = new smithy();
      player[] playerArray0 = new player[20];
      player player0 = new player();
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      board board0 = new board();
      smithy0.perform_attack(playerArray0, 1, board0);
      board0.buy_curse(player0, board0);
      smithy0.perform_attack(playerArray0, 0, board0);
      smithy0.perform_attack(playerArray0, 0, board0);
      // Undeclared exception!
      try { 
        smithy0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("org.cs362.dominion.deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      smithy smithy0 = new smithy();
      board board0 = new board();
      // Undeclared exception!
      try { 
        smithy0.perform_attack((player[]) null, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.smithy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      smithy smithy0 = new smithy();
      player[] playerArray0 = new player[5];
      player player0 = new player();
      hand hand0 = player0.player_hand;
      hand0.num_cards = (-2681);
      playerArray0[1] = player0;
      board board0 = new board();
      // Undeclared exception!
      try { 
        smithy0.perform_attack(playerArray0, 1, board0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.hand", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      smithy smithy0 = new smithy();
      player[] playerArray0 = new player[5];
      player player0 = new player();
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      board board0 = new board();
      smithy0.perform_attack(playerArray0, 1, board0);
      smithy0.perform_attack(playerArray0, 1, board0);
      board0.buy_curse(player0, board0);
      smithy0.perform_attack(playerArray0, 0, board0);
      // Undeclared exception!
      try { 
        smithy0.perform_attack(playerArray0, 1, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("org.cs362.dominion.deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      smithy smithy0 = new smithy();
      smithy0.description();
  }
}
