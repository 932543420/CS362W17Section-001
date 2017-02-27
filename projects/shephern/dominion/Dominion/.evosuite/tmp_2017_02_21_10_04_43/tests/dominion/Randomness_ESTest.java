/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 21 18:07:48 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Randomness;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Randomness_ESTest extends Randomness_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Randomness.totalCallsToRandom = 19;
      String[] stringArray0 = new String[3];
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
  public void test01()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      String string0 = Randomness.randomMember((List<String>) linkedList0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockRandom mockRandom0 = new MockRandom((-769L));
      byte[] byteArray0 = new byte[9];
      mockRandom0.nextBytes(byteArray0);
      int int0 = Randomness.nextRandomInt(455);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Randomness.random = null;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("=zaZ1!_tjF`");
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<String>) linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Randomness.random = null;
      // Undeclared exception!
      try { 
        Randomness.nextRandomInt((-1104));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
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
  public void test06()  throws Throwable  {
      int int0 = Randomness.nextRandomInt((-1104));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Object>) linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        Randomness.randomMember((List<Integer>) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Expected non-empty list
         //
         assertThrownBy("dominion.Randomness", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Randomness.reset((-894L));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) linkedList0);
      LinkedList linkedList1 = (LinkedList)Randomness.randomMember((List<Object>) linkedList0);
      assertEquals(1, linkedList1.size());
  }
}
