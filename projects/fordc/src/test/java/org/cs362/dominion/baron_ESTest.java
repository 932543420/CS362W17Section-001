/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:31:01 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.baron;
import org.cs362.dominion.board;
import org.cs362.dominion.deck;
import org.cs362.dominion.discard;
import org.cs362.dominion.estate;
import org.cs362.dominion.hand;
import org.cs362.dominion.pile;
import org.cs362.dominion.player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class baron_ESTest extends baron_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      baron baron0 = new baron();
      baron0.card = 1515;
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = player0.player_deck;
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      hand0.add_card(baron0);
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = new deck();
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      baron0.victory_points = (-5402);
      hand0.add_card(baron0);
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = new deck();
      baron0.gold = (-1411);
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      hand0.add_card(baron0);
      board board0 = new board();
      board0.print_board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = player0.player_deck;
      hand0.add_card(baron0);
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      hand0.add_card(baron0);
      board board0 = new board();
      board0.print_board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      baron0.action = 15;
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = player0.player_deck;
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[1];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = player0.player_deck;
      hand0.add_card(baron0);
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      hand hand0 = player0.player_hand;
      deck deck0 = new deck();
      estate estate0 = (estate)deck0.draw_card();
      hand0.add_card(estate0);
      baron0.victory_points = (-5402);
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      hand hand0 = new hand();
      hand0.num_cards = (-1723);
      player0.player_hand = hand0;
      playerArray0[0] = player0;
      board board0 = new board();
      baron0.perform_attack(playerArray0, 0, board0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[2] = player0;
      board board0 = new board();
      baron0.perform_attack(playerArray0, 2, board0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      baron baron0 = new baron();
      board board0 = new board();
      // Undeclared exception!
      try { 
        baron0.perform_attack((player[]) null, (-2729), board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[4];
      player player0 = new player();
      playerArray0[0] = player0;
      discard discard0 = player0.player_discard;
      discard0.num_cards = (-1465);
      board board0 = new board();
      // Undeclared exception!
      try { 
        baron0.perform_attack(playerArray0, 0, board0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.discard", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[1];
      board board0 = new board();
      // Undeclared exception!
      try { 
        baron0.perform_attack(playerArray0, (-21), board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -21
         //
         assertThrownBy("org.cs362.dominion.baron", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      baron baron0 = new baron();
      baron0.description();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      baron baron0 = new baron();
      player[] playerArray0 = new player[3];
      player player0 = new player();
      playerArray0[0] = player0;
      board board0 = new board();
      pile pile0 = board0.mine;
      pile0.num_cards = 0;
      board0.estate = pile0;
      baron0.perform_attack(playerArray0, 0, board0);
  }
}
