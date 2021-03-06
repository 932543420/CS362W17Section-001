/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 23:39:10 GMT 2017
 */

package maven.dominion_v2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import maven.dominion_v2.Randomness;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Randomness.nextRandomInt(1);
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        Randomness.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      Integer integer0 = Randomness.randomMember((List<Integer>) linkedList0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Random.setNextRandom((-2678));
      int int0 = Randomness.nextRandomInt((-216));
      assertEquals(86, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Randomness.random = null;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(6);
      linkedList0.add((Object) integer0);
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt(0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Randomness.reset((-137L));
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(6);
      linkedList0.add((Object) integer0);
      Integer integer1 = (Integer)Randomness.randomMember((List<Object>) linkedList0);
      assertEquals(6, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("maven.dominion_v2.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<String>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("maven.dominion_v2.Randomness", e);
      }
  }
}
