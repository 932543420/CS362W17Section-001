/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:13:03 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Curse_ESTest extends Curse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Curse curse0 = new Curse();
      assertEquals(0.0F, curse0.dynamicValue(), 0.01F);
  }
}
