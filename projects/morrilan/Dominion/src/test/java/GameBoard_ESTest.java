/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 22:44:40 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameBoard_ESTest extends GameBoard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GameBoard gameBoard0 = null;
      try {
        gameBoard0 = new GameBoard();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("sun.awt.HeadlessToolkit", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GameBoard.sop("");
  }
}
