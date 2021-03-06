/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 06:15:35 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Gardens_ESTest extends Gardens_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      gardens0.updateVP((-3154));
      assertEquals(0.0F, gardens0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      DomGame domGame0 = new DomGame(618);
      Player player0 = domGame0.getWinner();
      player0.draw = player0.discard;
      float float0 = gardens0.dynamicValue(domGame0, player0);
      assertEquals(0.0F, float0, 0.01F);
      assertEquals(0.0F, gardens0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      DomGame domGame0 = new DomGame(618);
      Player player0 = domGame0.getWinner();
      Deck deck0 = new Deck((Card) gardens0, (-9));
      assertEquals((-9), deck0.points);
      
      player0.draw = deck0;
      float float0 = gardens0.dynamicValue(domGame0, player0);
      assertEquals(0.0F, gardens0.dynamicValue(), 0.01F);
      assertEquals((-1.0F), float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      // Undeclared exception!
      try { 
        gardens0.dynamicValue((DomGame) null, (Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("Gardens", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      DomGame domGame0 = new DomGame(618);
      Player player0 = domGame0.getWinner();
      float float0 = gardens0.dynamicValue(domGame0, player0);
      assertEquals(1.0F, float0, 0.01F);
      assertEquals(0.0F, gardens0.dynamicValue(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Gardens gardens0 = new Gardens();
      gardens0.play();
      assertEquals(0.0F, gardens0.dynamicValue(), 0.01F);
  }
}
