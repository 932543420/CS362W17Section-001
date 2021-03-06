/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:08:26 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Ambassador;
import org.cs362.dominion.Board;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ambassador_ESTest extends Ambassador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("[SS$xL^+O", false);
      arrayList0.add(player0);
      Player player1 = new Player("", false);
      arrayList0.add(player1);
      Board board0 = new Board();
      player0.addToHand(ambassador0);
      board0.createDeck(ambassador0, (-4363));
      ambassador0.AIAttack(arrayList0, player0, board0);
      assertEquals(0, ambassador0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player((String) null, true);
      Board board0 = new Board();
      player0.addToHand(ambassador0);
      board0.createDeck(ambassador0, (-1584));
      ambassador0.Action(arrayList0, player0, board0);
      assertEquals("Ambassador", ambassador0.getName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("v~n'T)", false);
      Board board0 = new Board();
      ambassador0.Action(arrayList0, player0, board0);
      assertEquals(0, ambassador0.getTreasure());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.Attack(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("Ambassador", true);
      player0.addToHand(ambassador0);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.Attack(arrayList0, player0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player((String) null, true);
      Board board0 = new Board();
      player0.addToHand(ambassador0);
      // Undeclared exception!
      try { 
        ambassador0.Action(arrayList0, player0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.AIAttack(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Ambassador", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("[SS$xL^+O", false);
      Board board0 = new Board();
      player0.addToHand(ambassador0);
      // Undeclared exception!
      try { 
        ambassador0.AIAttack(arrayList0, player0, board0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("", false);
      // Undeclared exception!
      try { 
        ambassador0.AIAttack(arrayList0, player0, (Board) null);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("", true);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.Attack(arrayList0, player0, board0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("", true);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.Action(arrayList0, player0, board0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("v~n'T)", false);
      Board board0 = new Board();
      ambassador0.Attack(arrayList0, player0, board0);
      assertEquals(0, ambassador0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ambassador ambassador0 = new Ambassador();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        ambassador0.Action(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Ambassador", e);
      }
  }
}
