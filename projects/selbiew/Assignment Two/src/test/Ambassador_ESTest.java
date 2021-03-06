/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 05:51:36 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Ambassador_ESTest extends Ambassador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Player[] playerArray0 = new Player[1];
      Deck deck0 = new Deck((Card) ambassador0, (-35));
      player0.hand = deck0;
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      player0.fillHand(domGame0.rand);
      ambassador0.play(domGame0, 0, 2);
      assertEquals(0.0F, ambassador0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame((-6));
      Player player0 = new Player((-6), domGame0.rand);
      Player[] playerArray0 = new Player[1];
      Deck deck0 = new Deck((Card) ambassador0, 63);
      player0.hand = deck0;
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      // Undeclared exception!
      try { 
        ambassador0.play(domGame0, 0, 2);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame((-30));
      Player player0 = new Player((-998), domGame0.rand);
      Player[] playerArray0 = new Player[13];
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      player0.fillHand(domGame0.rand);
      domGame0.kingdomCards = domGame0.basicCards;
      // Undeclared exception!
      try { 
        ambassador0.play(domGame0, 0, 2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 7, Size: 7
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      // Undeclared exception!
      try { 
        ambassador0.play(domGame0, 0, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      player0.fillHand(domGame0.rand);
      ambassador0.play(domGame0, 1, 2);
      assertEquals(0.0F, ambassador0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) ambassador0, 9);
      player0.hand = deck0;
      domGame0.players = domGame0.players;
      Player[] playerArray0 = new Player[6];
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      domGame0.players = playerArray0;
      Random.setNextRandom(8);
      ambassador0.play(domGame0, 0, 0);
      assertEquals(0.0F, ambassador0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) ambassador0, 9);
      player0.hand = deck0;
      domGame0.players = domGame0.players;
      Player[] playerArray0 = new Player[6];
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      Random.setNextRandom(8);
      // Undeclared exception!
      try { 
        ambassador0.play(domGame0, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      domGame0.players = domGame0.players;
      Player[] playerArray0 = new Player[6];
      playerArray0[0] = player0;
      playerArray0[1] = player0;
      domGame0.players = playerArray0;
      player0.fillHand(domGame0.rand);
      Random.setNextRandom(8);
      ambassador0.play(domGame0, 0, 0);
      assertEquals(0, domGame0.turnCount);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Player[] playerArray0 = new Player[1];
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      player0.fillHand(domGame0.rand);
      Random.setNextRandom(8);
      // Undeclared exception!
      try { 
        ambassador0.play(domGame0, 0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("Ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      DomGame domGame0 = new DomGame(0);
      Player player0 = domGame0.getWinner();
      Player[] playerArray0 = new Player[1];
      player0.hand = player0.draw;
      playerArray0[0] = player0;
      domGame0.players = playerArray0;
      ambassador0.play(domGame0, 0, 2);
      assertEquals(0.0F, ambassador0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      Player[] playerArray0 = new Player[4];
      float float0 = ambassador0.dynamicValue((DomGame) null, playerArray0[3]);
      assertEquals(0.0F, ambassador0.dynamicValue(), 0.01F);
      assertEquals(0.5F, float0, 0.01F);
  }
}
