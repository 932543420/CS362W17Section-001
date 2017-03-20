/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 00:27:41 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.cs362.dominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card card0 = new Card("ZzR:/.%8f'");
      card0.setVictoryPoints(840);
      int int0 = card0.getVictoryPoints();
      assertEquals(840, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = new Card();
      card0.setVictoryPoints((-1));
      int int0 = card0.getVictoryPoints();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card();
      card0.setValue(2);
      int int0 = card0.getValue();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card card0 = new Card("");
      card0.setValue((-890));
      int int0 = card0.getValue();
      assertEquals((-890), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card("ambassador");
      card0.getType();
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card card0 = new Card("");
      card0.getName();
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card card0 = new Card("");
      assertEquals("null", card0.getDescription());

      card0.setDescription("");
      card0.getDescription();
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getCost();
      assertEquals("null", card0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, card0.getActions());
      assertEquals("null", card0.getName());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card card0 = new Card();
      card0.setCost((-881));
      int int0 = card0.getCost();
      assertEquals((-881), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card card0 = new Card();
      card0.setCoins(16);
      int int0 = card0.getCoins();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card card0 = new Card();
      card0.setCoins((-412));
      int int0 = card0.getCoins();
      assertEquals((-412), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card card0 = new Card();
      card0.setCards(400);
      int int0 = card0.getCards();
      assertEquals(400, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card card0 = new Card();
      card0.setCards((-1));
      int int0 = card0.getCards();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card();
      card0.setBuys(840);
      int int0 = card0.getBuys();
      assertEquals(840, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card card0 = new Card();
      card0.setBuys((-1023));
      int int0 = card0.getBuys();
      assertEquals((-1023), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card card0 = new Card("ygywNb");
      card0.setActions(48);
      int int0 = card0.getActions();
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card("InvIalidFractional");
      card0.setActions((-41));
      int int0 = card0.getActions();
      assertEquals((-41), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card card0 = null;
      try {
        card0 = new Card((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card card0 = new Card("ygywNb");
      boolean boolean0 = card0.isType("");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertFalse(boolean0);
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCoins());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getActions());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card card0 = new Card("salvager");
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card card0 = new Card("mine");
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card card0 = new Card("great hall");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCoins());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card card0 = new Card("gardens");
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card card0 = new Card("feast");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card card0 = new Card("embargo");
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card card0 = new Card("cutpurse");
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card card0 = new Card("council room");
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card card0 = new Card("baron");
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card card0 = new Card("ambassador");
      boolean boolean0 = card0.isType("'DLx");
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertFalse(boolean0);
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card card0 = new Card("curse");
      boolean boolean0 = card0.isType("curse");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
      assertTrue(boolean0);
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card card0 = new Card("market");
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Card card0 = new Card("witch");
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Card card0 = new Card("adventurer");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Card card0 = new Card("smithy");
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card card0 = new Card("village");
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Card card0 = new Card("estate");
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Card card0 = new Card("dutchy");
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Card card0 = new Card("province");
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Card card0 = new Card("copper");
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCards());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Card card0 = new Card("silver");
      assertEquals(2, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals("silver", card0.getName());
      assertEquals("The silver card is a treasure card worth 2 coins", card0.getDescription());
      assertEquals(0, card0.getCards());
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Card card0 = new Card("gold");
      assertEquals(0, card0.getBuys());
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.getCoins());
      assertEquals("gold", card0.getName());
      assertEquals(3, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals("The gold card is a treasure card worth 3 coins", card0.getDescription());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Card card0 = new Card();
      card0.printCard();
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals("null", card0.getName());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Card card0 = new Card();
      assertEquals("null", card0.getName());

      card0.setName("");
      card0.getName();
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getCoins();
      assertEquals("null", card0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCost());
      assertEquals("null", card0.getName());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Card card0 = new Card("InvIalidFractional");
      int int0 = card0.getActions();
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Card card0 = new Card("cellar");
      int int0 = card0.getCost();
      assertEquals(2, int0);
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getBuys());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Card card0 = new Card();
      String string0 = card0.getName();
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals("null", string0);
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Card card0 = new Card("");
      int int0 = card0.getCards();
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, int0);
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Card card0 = new Card();
      int int0 = card0.getVictoryPoints();
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getActions());
      assertEquals("null", card0.getName());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Card card0 = new Card();
      card0.getType();
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals("null", card0.getDescription());
      assertEquals("null", card0.getName());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCoins());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Card card0 = new Card("");
      int int0 = card0.getBuys();
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCoins());
      assertEquals("null", card0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Card card0 = new Card("");
      int int0 = card0.getValue();
      assertEquals(0, card0.getCards());
      assertEquals("null", card0.getDescription());
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCoins());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Card card0 = new Card();
      assertEquals("null", card0.getDescription());

      card0.setDescription((String) null);
      card0.getDescription();
      assertEquals(0, card0.getActions());
      assertEquals(0, card0.getCards());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getBuys());
      assertEquals("null", card0.getName());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCoins());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Card card0 = new Card();
      String string0 = card0.getDescription();
      assertEquals("null", string0);
      assertEquals(0, card0.getBuys());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getValue());
      assertEquals(0, card0.getActions());
      assertEquals("null", card0.getName());
      assertEquals(0, card0.getCoins());
      assertEquals(0, card0.getVictoryPoints());
      assertEquals(0, card0.getCards());
  }
}