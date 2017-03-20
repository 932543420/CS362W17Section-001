/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:12:48 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Board;
import org.cs362.dominion.Player;
import org.cs362.dominion.Smithy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Smithy_ESTest extends Smithy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Smithy smithy0 = new Smithy();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("?,oD}}5(}Ky,eZQ5", false);
      player0.giveCard(smithy0);
      Board board0 = new Board();
      player0.giveCard(smithy0);
      // Undeclared exception!
      try { 
        smithy0.Action(arrayList0, player0, board0);
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
      Smithy smithy0 = new Smithy();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        smithy0.Action(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Smithy", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Smithy smithy0 = new Smithy();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("EZPaPseR", true);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        smithy0.Action(arrayList0, player0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Smithy smithy0 = new Smithy();
      Player player0 = new Player("~'YI+NcZR9y", false);
      player0.discard.addTop(smithy0);
      player0.deck = player0.discard;
      player0.giveCard(smithy0);
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      player0.giveCard(smithy0);
      smithy0.Action(arrayList0, player0, board0);
      assertEquals(0, arrayList0.size());
  }
}