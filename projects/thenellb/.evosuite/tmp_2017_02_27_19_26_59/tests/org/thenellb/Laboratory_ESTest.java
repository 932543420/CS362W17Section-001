/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:56:18 GMT 2017
 */

package org.thenellb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.thenellb.Laboratory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Laboratory_ESTest extends Laboratory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Laboratory laboratory0 = new Laboratory();
      int int0 = laboratory0.activate();
      assertEquals(2, laboratory0.get_plusCardValue());
      assertEquals("ACTION", laboratory0.get_cardType());
      assertEquals(0, laboratory0.get_victoryValue());
      assertEquals("Laboratory", laboratory0.get_cardName());
      assertEquals(8, int0);
      assertEquals(1, laboratory0.get_plusActionValue());
      assertEquals(5, laboratory0.get_cost());
      assertEquals(0, laboratory0.get_plusBuyValue());
      assertEquals(0, laboratory0.get_plusTreasuryValue());
  }
}