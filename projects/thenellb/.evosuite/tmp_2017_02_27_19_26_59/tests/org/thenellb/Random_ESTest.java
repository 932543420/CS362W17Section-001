/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:58:02 GMT 2017
 */

package org.thenellb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.thenellb.Random;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Random_ESTest extends Random_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Random.getRandomInt(859, 0);
      assertEquals(859, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Random.getRandomInt((-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Random random0 = new Random();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Random.getRandomInt(0, 0);
      assertEquals(0, int0);
  }
}
