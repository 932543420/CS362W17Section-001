/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 03:59:23 GMT 2017
 */

package org.thenellb;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.thenellb.CouncilRoom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CouncilRoom_ESTest extends CouncilRoom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CouncilRoom councilRoom0 = new CouncilRoom();
      int int0 = councilRoom0.activate();
      assertEquals(5, councilRoom0.get_cost());
      assertEquals(0, councilRoom0.get_plusTreasuryValue());
      assertEquals(4, councilRoom0.get_plusCardValue());
      assertEquals(0, councilRoom0.get_victoryValue());
      assertEquals("CouncilRoom", councilRoom0.get_cardName());
      assertEquals(6, int0);
      assertEquals("ACTION", councilRoom0.get_cardType());
      assertEquals(1, councilRoom0.get_plusBuyValue());
      assertEquals(0, councilRoom0.get_plusActionValue());
  }
}
