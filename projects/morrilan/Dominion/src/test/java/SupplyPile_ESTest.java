/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:45:30 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SupplyPile_ESTest extends SupplyPile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Card[] cardArray0 = new Card[32];
      KingdomCard kingdomCard0 = new KingdomCard("&CarSi3{ :Nk", 2, "&CarSi3{ :Nk", "&CarSi3{ :Nk");
      cardArray0[0] = (Card) kingdomCard0;
      cardArray0[1] = (Card) kingdomCard0;
      SupplyPile supplyPile0 = null;
      try {
        supplyPile0 = new SupplyPile(cardArray0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("SupplyPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Card[] cardArray0 = new Card[27];
      Random.setNextRandom(829);
      SupplyPile supplyPile0 = null;
      try {
        supplyPile0 = new SupplyPile(cardArray0, 829);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("SupplyPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BufferedImage bufferedImage0 = (BufferedImage)SupplyPile.getScaledImage((Image) null, 1, 1);
      assertEquals(2, bufferedImage0.getType());
      assertEquals(1, bufferedImage0.getHeight());
      assertEquals(1, bufferedImage0.getWidth());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupplyPile.getScaledImage((Image) null, 932290458, 932290458);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupplyPile.getScaledImage((Image) null, 1, (-2480));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Width (1) and height (-2480) cannot be <= 0
         //
         assertThrownBy("java.awt.image.DirectColorModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Card[] cardArray0 = new Card[0];
      SupplyPile supplyPile0 = null;
      try {
        supplyPile0 = new SupplyPile(cardArray0, 2);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("SupplyPile", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        SupplyPile.getScaledImage((Image) null, 2017199899, 2017199899);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.image.DataBufferInt", e);
      }
  }
}
