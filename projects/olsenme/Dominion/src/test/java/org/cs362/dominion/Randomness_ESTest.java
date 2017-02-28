/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 07:54:05 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.cs362.dominion.Randomness;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Randomness_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Randomness.nextRandomInt((-452));
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      /*
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }*/
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
     // Random.setNextRandom(46);
      int int0 = Randomness.nextRandomInt(4);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
  /*    try { 
        Randomness.nextRandomInt((-417));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }*/
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      /*try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }*/
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      /*try { 
        Randomness.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }*/
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
    /*  try { 
        Randomness.randomMember((List<Object>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("org.cs362.dominion.Randomness", e);
      }*/
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Randomness.reset(20L);
  }
}
