/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:58:16 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.PlayDominion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlayDominion_ESTest extends PlayDominion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      PlayDominion.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayDominion playDominion0 = new PlayDominion();
  }
}
