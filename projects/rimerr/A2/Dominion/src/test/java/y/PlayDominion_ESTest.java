/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 00:55:28 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.PlayDominion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PlayDominion_ESTest extends PlayDominion_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 13 covered goals:
   * Goal 1. main([Ljava/lang/String;)V_org.evosuite.runtime.TooManyResourcesException_IMPLICIT
   * Goal 2. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 17
   * Goal 3. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 21
   * Goal 4. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 22
   * Goal 5. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 25
   * Goal 6. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 28
   * Goal 7. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 29
   * Goal 8. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 30
   * Goal 9. dominion.PlayDominion.main([Ljava/lang/String;)V: Line 32
   * Goal 10. [METHOD] dominion.PlayDominion.main([Ljava/lang/String;)V
   * Goal 11. Weak Mutation 0: dominion.PlayDominion.main([Ljava/lang/String;)V:17 - ReplaceComparisonOperator == -> !=
   * Goal 12. Weak Mutation 1: dominion.PlayDominion.main([Ljava/lang/String;)V:25 - ReplaceConstant - player-1 -> 
   * Goal 13. Weak Mutation 2: dominion.PlayDominion.main([Ljava/lang/String;)V:29 - ReplaceConstant - player-2 -> 
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[30];
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

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. dominion.PlayDominion.<init>()V: root-Branch
   * Goal 2. Branch dominion.PlayDominion.<init>()V: root-Branch in context: dominion.PlayDominion:<init>()V
   * Goal 3. [METHOD] dominion.PlayDominion.<init>()V
   * Goal 4. [METHODNOEX] dominion.PlayDominion.<init>()V
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PlayDominion playDominion0 = new PlayDominion();
  }
}
