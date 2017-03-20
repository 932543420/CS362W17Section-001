/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 23:26:58 GMT 2017
 */

package com.mycompany.marksprousedominion;

import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.marksprousedominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card card0 = new Card();
      card0.setVictory(4423);
      int int0 = card0.getVictory();
      assertEquals(4423, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = new Card();
      card0.setType(4423);
      int int0 = card0.getType();
      assertEquals(4423, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card();
      card0.setTreasure(4423);
      int int0 = card0.getTreasure();
      assertEquals(4423, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card();
      card0.setTreasure((-2219));
      int int0 = card0.getTreasure();
      assertEquals((-2219), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card();
      card0.setName("SXj+^J");
      String string0 = card0.getName();
      assertEquals("SXj+^J", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card card0 = new Card();
      card0.setName("");
      String string0 = card0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card card0 = new Card();
      card0.setCost(1504);
      int int0 = card0.getCost();
      assertEquals(1504, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = new Card();
      card0.setCost((-2212));
      int int0 = card0.getCost();
      assertEquals((-2212), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getVictory();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getType();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = new Card();
      card0.printInfo();
      assertEquals(0, card0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card();
      card0.setVictory((-1));
      int int0 = card0.getVictory();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getTreasure();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getCost();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = new Card();
      card0.setType((-557));
      int int0 = card0.getType();
      assertEquals((-557), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card card0 = new Card();
      String string0 = card0.getName();
      assertNull(string0);
  }
}