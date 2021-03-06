/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 18:42:36 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import dominion.Card;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1254, 1254, 7);
      assertEquals(1254, card0.getScore());
      assertEquals(1254, card0.getCost());
      assertEquals(7, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 3610, 3610, 3610);
      card0.getType();
      assertEquals(3610, card0.getTreasureValue());
      assertEquals(3610, card0.getCost());
      assertEquals(3610, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1500), (-1500), (-1500));
      card0.getType();
      assertEquals(-1500, card0.getScore());
      assertEquals(-1500, card0.getCost());
      assertEquals(-1500, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Draw;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1675), 0, 0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, int0);
      assertEquals(-1675, card0.getCost());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2088), (-2088), (-2088));
      int int0 = card0.getTreasureValue();
      assertEquals(-2088, card0.getCost());
      assertEquals(-2088, card0.getScore());
      assertEquals((-2088), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getScore();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2088), (-2088), (-2088));
      int int0 = card0.getScore();
      assertEquals(-2088, card0.getTreasureValue());
      assertEquals((-2088), int0);
      assertEquals(-2088, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.getScore());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2088), (-2088), (-2088));
      int int0 = card0.getCost();
      assertEquals((-2088), int0);
      assertEquals(-2088, card0.getTreasureValue());
      assertEquals(-2088, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      card0.getCardName();
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getScore());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 3610, 3610, 3610);
      card0.getCardName();
      assertEquals(3610, card0.getTreasureValue());
      assertEquals(3610, card0.getCost());
      assertEquals(3610, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, 3592, 3592, 3592);
      card0.getType();
      assertEquals(3592, card0.getScore());
      assertEquals(3592, card0.getTreasureValue());
      assertEquals(3592, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, 3592, 3592, 3592);
      int int0 = card0.getCost();
      assertEquals(3592, card0.getScore());
      assertEquals(3592, int0);
      assertEquals(3592, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, 3592, 3592, 3592);
      card0.getCardName();
      assertEquals(3592, card0.getCost());
      assertEquals(3592, card0.getScore());
      assertEquals(3592, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, 3592, 3592, 3592);
      int int0 = card0.getScore();
      assertEquals(3592, card0.getCost());
      assertEquals(3592, int0);
      assertEquals(3592, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card((Card.CardName) null, card_Type0, 3592, 3592, 3592);
      int int0 = card0.getTreasureValue();
      assertEquals(3592, int0);
      assertEquals(3592, card0.getCost());
      assertEquals(3592, card0.getScore());
  }
}
