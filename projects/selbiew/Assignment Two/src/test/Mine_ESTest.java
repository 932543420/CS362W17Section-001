/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:06:51 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Mine_ESTest extends Mine_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame((-43));
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) mine0, 1);
      assertEquals(0, deck0.points);
      
      player0.draw = deck0;
      float float0 = mine0.dynamicValue(domGame0, player0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
      assertEquals(1.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame((-843));
      Player player0 = domGame0.getWinner();
      mine0.points = (-458);
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(2, domGame0.playerCount);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      mine0.cardDraw = 748;
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 3);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Mine mine0 = new Mine();
      mine0.value = 11;
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(0, domGame0.turnCount);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      mine0.actions = (-849);
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      mine0.buys = (-1819);
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) mine0, (-463));
      assertEquals(0, deck0.points);
      
      player0.hand = deck0;
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame((-843));
      mine0.points = (-458);
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mine mine0 = new Mine();
      // Undeclared exception!
      try { 
        mine0.play((DomGame) null, 3, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Mine", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      LinkedList<Deck> linkedList0 = new LinkedList<Deck>();
      domGame0.basicCards = (List<Deck>) linkedList0;
      player0.fillHand(domGame0.rand);
      // Undeclared exception!
      try { 
        mine0.play(domGame0, 1, 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame((-1835));
      // Undeclared exception!
      try { 
        mine0.play(domGame0, (-1835), 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1835
         //
         assertThrownBy("Mine", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Mine mine0 = new Mine();
      // Undeclared exception!
      try { 
        mine0.dynamicValue((DomGame) null, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Mine", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(5);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) mine0, 1);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      deck0.cards = (List<Card>) linkedList0;
      player0.draw = deck0;
      // Undeclared exception!
      try { 
        mine0.dynamicValue(domGame0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame((-3153));
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck();
      player0.draw = deck0;
      // Undeclared exception!
      try { 
        mine0.dynamicValue(domGame0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("Mine", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Mine mine0 = new Mine();
      mine0.name = "Silver";
      DomGame domGame0 = new DomGame((-849));
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      mine0.play(domGame0, 1, 0);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Mine mine0 = new Mine();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      float float0 = mine0.dynamicValue(domGame0, player0);
      assertEquals(4.0F, float0, 0.01F);
      assertEquals(0.0F, mine0.dynamicValue(), 0.01F);
  }
}
