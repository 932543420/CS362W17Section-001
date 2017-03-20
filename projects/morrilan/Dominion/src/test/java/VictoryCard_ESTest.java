/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:48:56 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VictoryCard_ESTest extends VictoryCard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VictoryCard victoryCard0 = new VictoryCard((String) null, 0, (String) null, 894);
      int int0 = victoryCard0.getValue();
      assertEquals(894, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VictoryCard victoryCard0 = new VictoryCard("", (-1795), "", (-1795));
      int int0 = victoryCard0.getValue();
      assertEquals((-1795), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VictoryCard victoryCard0 = new VictoryCard("`(o", 51, "`(o", 51);
      victoryCard0.getAction();
      assertEquals(51, victoryCard0.victoryValue);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VictoryCard victoryCard0 = new VictoryCard("", 0, "", 0);
      int int0 = victoryCard0.getValue();
      assertEquals(0, int0);
  }
}
