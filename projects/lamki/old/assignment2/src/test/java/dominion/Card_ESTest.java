/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 19 18:45:08 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import dominion.Card;
import dominion.Game;
import dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card card0 = new Card(0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = new Card(3);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card(16);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card(15);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card(14);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card card0 = new Card(13);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card card0 = new Card(12);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = new Card(11);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = new Card(10);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = new Card(9);
      card0.print();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = new Card(7);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card(6);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card(5);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card(4);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = new Card(2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card card0 = new Card(1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card();
      card0.index = 2194;
      card0.print();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = new Card(1130);
      card0.print();
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = new Card(8);
      MockRandom mockRandom0 = new MockRandom(1L);
      Player player0 = new Player("");
      Game game0 = new Game();
      card0.play(8, mockRandom0, (-4066), player0, game0);
  }
}
