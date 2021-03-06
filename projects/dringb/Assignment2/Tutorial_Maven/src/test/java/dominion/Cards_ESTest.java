/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:39:52 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import dominion.Cards;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cards_ESTest extends Cards_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards((String) null, (-560), (-560), (String) null, boolean0);
      String string0 = cards0.getType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cards cards0 = new Cards("", 1, 1, " ", (Boolean) null);
      String string0 = cards0.getType();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards((String) null, (-560), (-560), (String) null, boolean0);
      Boolean boolean1 = cards0.getToken();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Cards cards0 = new Cards((String) null, (-540), (-540), (String) null, boolean0);
      Boolean boolean1 = cards0.getToken();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Boolean boolean0 = new Boolean(" ");
      Cards cards0 = new Cards(" ", (-11), (-11), " ", boolean0);
      String string0 = cards0.getName();
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Cards cards0 = new Cards("", 444, 650, "", boolean0);
      String string0 = cards0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Boolean boolean0 = new Boolean((String) null);
      Cards cards0 = new Cards("", 2478, 2478, (String) null, boolean0);
      int int0 = cards0.getCost();
      assertEquals(2478, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards((String) null, (-560), (-560), (String) null, boolean0);
      int int0 = cards0.getCost();
      assertEquals((-560), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Cards cards0 = new Cards((String) null, 1, 1, (String) null, boolean0);
      cards0.addEmbargo();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cards cards0 = new Cards((String) null, 0, 0, (String) null, (Boolean) null);
      String string0 = cards0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      Cards cards0 = new Cards("ywx", 0, 0, "", boolean0);
      int int0 = cards0.getCost();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Boolean boolean0 = new Boolean("");
      Cards cards0 = new Cards("", (-1168), (-1168), "", boolean0);
      String string0 = cards0.getType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Cards cards0 = new Cards((String) null, 0, 0, (String) null, (Boolean) null);
      Boolean boolean0 = cards0.getToken();
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Cards cards0 = new Cards((String) null, 0, 0, (String) null, (Boolean) null);
      String string0 = cards0.toString();
      assertEquals("null 0 0 null null", string0);
  }
}
