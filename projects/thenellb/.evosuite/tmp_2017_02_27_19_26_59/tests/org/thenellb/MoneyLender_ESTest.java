/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:05:22 GMT 2017
 */

package org.thenellb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.thenellb.MoneyLender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MoneyLender_ESTest extends MoneyLender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MoneyLender moneyLender0 = new MoneyLender();
      int int0 = moneyLender0.activate();
      assertEquals(10, int0);
      assertEquals(0, moneyLender0.get_plusTreasuryValue());
      assertEquals(0, moneyLender0.get_plusActionValue());
      assertEquals(0, moneyLender0.get_plusBuyValue());
      assertEquals("ACTION", moneyLender0.get_cardType());
      assertEquals(0, moneyLender0.get_plusCardValue());
      assertEquals(0, moneyLender0.get_victoryValue());
      assertEquals("MoneyLender", moneyLender0.get_cardName());
      assertEquals(4, moneyLender0.get_cost());
  }
}
