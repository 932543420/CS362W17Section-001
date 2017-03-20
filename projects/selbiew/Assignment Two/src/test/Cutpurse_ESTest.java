/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:03:37 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Cutpurse_ESTest extends Cutpurse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      player0.hand.addCard(cutpurse0);
      player0.draw = player0.hand;
      float float0 = cutpurse0.dynamicValue(domGame0, player0);
      assertEquals((-1.0F), float0, 0.01F);
      assertEquals(0.0F, cutpurse0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      // Undeclared exception!
      try { 
        cutpurse0.play((DomGame) null, (-19), (-19));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DomGame domGame0 = new DomGame(1);
      Player player0 = domGame0.getWinner();
      Deck deck0 = player0.draw;
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      deck0.cards = (List<Card>) linkedList0;
      Cutpurse cutpurse0 = new Cutpurse();
      player0.hand = deck0;
      // Undeclared exception!
      try { 
        cutpurse0.play(domGame0, 0, 314);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      DomGame domGame0 = new DomGame(10);
      // Undeclared exception!
      try { 
        cutpurse0.play(domGame0, 9, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         assertThrownBy("Cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      // Undeclared exception!
      try { 
        cutpurse0.dynamicValue((DomGame) null, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      DomGame domGame0 = new DomGame(10);
      Player player0 = domGame0.getWinner();
      Deck deck0 = player0.draw;
      deck0.size = 1538;
      // Undeclared exception!
      try { 
        cutpurse0.dynamicValue(domGame0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 10, Size: 10
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      DomGame domGame0 = new DomGame((-951));
      Player player0 = domGame0.getWinner();
      player0.draw = player0.discard;
      // Undeclared exception!
      try { 
        cutpurse0.dynamicValue(domGame0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("Cutpurse", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DomGame domGame0 = new DomGame(1);
      Player player0 = domGame0.getWinner();
      Cutpurse cutpurse0 = new Cutpurse();
      player0.hand = player0.draw;
      cutpurse0.play(domGame0, 1, 10);
      assertEquals(0.0F, cutpurse0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DomGame domGame0 = new DomGame(1);
      Player player0 = domGame0.getWinner();
      Cutpurse cutpurse0 = new Cutpurse();
      player0.hand.addCard(cutpurse0);
      cutpurse0.play(domGame0, 1, 0);
      assertEquals(0.0F, cutpurse0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Random.setNextRandom(3);
      DomGame domGame0 = new DomGame(3);
      // Undeclared exception!
      try { 
        domGame0.play();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DomGame domGame0 = new DomGame(1);
      Player player0 = domGame0.getWinner();
      Cutpurse cutpurse0 = new Cutpurse();
      player0.hand = player0.draw;
      cutpurse0.play(domGame0, 0, 314);
      assertEquals(0.0F, cutpurse0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Cutpurse cutpurse0 = new Cutpurse();
      DomGame domGame0 = new DomGame(10);
      Player player0 = domGame0.getWinner();
      float float0 = cutpurse0.dynamicValue(domGame0, player0);
      assertEquals(0.0F, cutpurse0.dynamicValue(), 0.01F);
      assertEquals(2.0F, float0, 0.01F);
  }
}
