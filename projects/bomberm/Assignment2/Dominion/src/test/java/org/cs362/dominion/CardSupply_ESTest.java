/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 05:43:23 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.CardSupply;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CardSupply_ESTest extends CardSupply_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CardSupply cardSupply0 = null;
      try {
        cardSupply0 = new CardSupply((CardSupply) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.CardSupply", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CardSupply cardSupply0 = new CardSupply();
  }
}
