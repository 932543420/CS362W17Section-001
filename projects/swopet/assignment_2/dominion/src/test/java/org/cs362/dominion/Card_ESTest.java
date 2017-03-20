/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 16:41:55 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.cs362.dominion.Card;
import org.cs362.dominion.Copper;
import org.cs362.dominion.Estate;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Player player0 = new Player(boolean0);
      List<Card> list0 = player0.discard;
      Estate estate0 = (Estate)player0.gainFrom(list0);
      estate0.victory = null;
      Boolean boolean1 = estate0.isVictory();
      assertNull(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom(2308L);
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      Boolean boolean1 = estate0.isVictory();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card();
      card0.treasure = null;
      Boolean boolean0 = card0.isTreasure();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = Boolean.TRUE;
      card0.treasure = boolean0;
      Boolean boolean1 = card0.isTreasure();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card();
      card0.token = null;
      Boolean boolean0 = card0.isToken();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom(2308L);
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      estate0.token = boolean0;
      Boolean boolean1 = estate0.isToken();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card card0 = new Card();
      card0.curse = null;
      Boolean boolean0 = card0.isCurse();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = Boolean.valueOf(true);
      card0.curse = boolean0;
      Boolean boolean1 = card0.isCurse();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = new Card();
      card0.attack = null;
      Boolean boolean0 = card0.isAttack();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = Boolean.valueOf(true);
      card0.attack = boolean0;
      Boolean boolean1 = card0.isAttack();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = new Card();
      card0.action = null;
      Boolean boolean0 = card0.isAction();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = Boolean.TRUE;
      card0.curse = boolean0;
      card0.action = card0.curse;
      Boolean boolean1 = card0.isAction();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card();
      card0.name = "Hwo3EH~)=AZ88d!t";
      String string0 = card0.getName();
      assertEquals("Hwo3EH~)=AZ88d!t", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card();
      card0.name = "";
      String string0 = card0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Random.setNextRandom(1674);
      Card card0 = new Card();
      Boolean boolean0 = card0.isAttack();
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom();
      List<Card> list0 = player0.drawCards(1674, mockRandom0);
      Copper copper0 = (Copper)player0.gainFrom(list0);
      // Undeclared exception!
      try { 
        copper0.play((GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Copper", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Player player0 = new Player(boolean0);
      MockRandom mockRandom0 = new MockRandom(2308L);
      Estate estate0 = (Estate)player0.drawCard(mockRandom0);
      Boolean boolean1 = estate0.isCurse();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isToken();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isAction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isVictory();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.play((GameState) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card card0 = new Card();
      Boolean boolean0 = card0.isTreasure();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card card0 = new Card();
      String string0 = card0.getName();
      assertNull(string0);
  }
}
