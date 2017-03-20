/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:37:10 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.board;
import org.cs362.dominion.copper;
import org.cs362.dominion.cutpurse;
import org.cs362.dominion.hand;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class cutpurse_ESTest extends cutpurse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      hand hand0 = player0.player_hand;
      playerArray0[0] = player0;
      copper copper0 = new copper();
      hand0.add_card(copper0);
      board board0 = new board();
      board0.num_players = 1;
      cutpurse0.card = (-30);
      cutpurse0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player player0 = new player();
      hand hand0 = player0.player_hand;
      copper copper0 = new copper();
      hand0.add_card(copper0);
      board board0 = new board();
      board0.num_players = 1;
      player[] playerArray0 = new player[3];
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      cutpurse0.perform_attack(playerArray0, 1, board0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      hand hand0 = player0.player_hand;
      playerArray0[0] = player0;
      copper copper0 = new copper();
      hand0.add_card(copper0);
      cutpurse0.action = 1308;
      board board0 = new board();
      board0.num_players = 1;
      cutpurse0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player player0 = new player();
      hand hand0 = player0.player_hand;
      board board0 = new board();
      hand0.add_card(cutpurse0);
      board0.num_players = 5;
      player[] playerArray0 = new player[3];
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      // Undeclared exception!
      try { 
        cutpurse0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[2];
      player player0 = new player();
      hand hand0 = player0.player_hand;
      playerArray0[0] = player0;
      copper copper0 = new copper();
      cutpurse0.victory_points = 10;
      hand0.add_card(copper0);
      board board0 = new board();
      board0.num_players = 1;
      cutpurse0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player player0 = new player();
      hand hand0 = player0.player_hand;
      copper copper0 = new copper();
      hand0.add_card(copper0);
      board board0 = new board();
      cutpurse0.buy = 5;
      board0.num_players = 5;
      player[] playerArray0 = new player[3];
      playerArray0[0] = player0;
      // Undeclared exception!
      try { 
        cutpurse0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      board board0 = new board();
      board0.num_players = 1;
      cutpurse0.card = (-30);
      cutpurse0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      board board0 = new board();
      board0.num_players = (-921);
      cutpurse0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      player[] playerArray0 = new player[1];
      board board0 = new board();
      // Undeclared exception!
      try { 
        cutpurse0.perform_attack(playerArray0, 1, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("org.cs362.dominion.cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      cutpurse cutpurse0 = new cutpurse();
      cutpurse0.description();
  }
}