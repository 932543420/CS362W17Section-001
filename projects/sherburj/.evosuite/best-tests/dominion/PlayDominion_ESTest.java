/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 09 17:20:26 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.PlayDominion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlayDominion_ESTest extends PlayDominion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom((-14));
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        PlayDominion.main(stringArray0);
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayDominion playDominion0 = new PlayDominion();
  }
}
