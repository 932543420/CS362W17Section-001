/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:24:08 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Random;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.cs362.dominion.Randomness;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      List<Card> list2 = Card.filterObtainable(list1, (GameState) null, 0);
      Card.CardName card_CardName1 = Card.CardName.Curse;
      List<Card> list3 = Card.filterName(list2, card_CardName1);
      card0.getCost();
      Card.createCards();
      Card.CardName card_CardName2 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName2);
      Card.Type.values();
      Card.CardName card_CardName3 = Card.CardName.Copper;
      Card.getCard(list3, card_CardName3);
      Card.CardName card_CardName4 = Card.CardName.Smithy;
      Card card1 = new Card(card_CardName4, card_Type0, 0, 0, (-1238));
      Card.createCards();
      Card.Type card_Type1 = Card.Type.ACTION;
      Card.filter(list3, card_Type1);
      card0.equals((Object) null);
      Card.Type card_Type2 = Card.Type.VICTORY;
      Card.filter(list3, card_Type2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-153), (-153), (-153));
      card0.score((Player) null);
      Randomness.reset(0L);
      card0.getType();
      card0.getType();
      Card.Type card_Type1 = Card.Type.ACTION;
      Card.filter(list0, card_Type1);
      // Undeclared exception!
      try { 
        Card.Type.valueOf((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Name is null
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      List<Card> list1 = Card.filterName(list0, card_CardName0);
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list2 = Card.filter(list1, card_Type0);
      List<Card> list3 = Card.filterObtainable(list2, (GameState) null, (-2468));
      Card.CardName card_CardName1 = Card.CardName.Gold;
      Card.filterName(list3, card_CardName1);
      List<Card> list4 = Card.createCards();
      Card.getCard(list4, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, (-1));
      card0.getTreasureValue();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      Card.Type card_Type1 = Card.Type.TREASURE;
      Card.filter(list1, card_Type1);
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = new Card(card_CardName0, card_Type1, 1, 443, 0);
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 3, 3, 3507);
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 3463, 3463, (-2939));
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(list0, card_CardName0);
      List<Card> list1 = Card.filterName(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Copper;
      Card.filterName(list1, card_CardName1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1116, 1116, 1116);
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName1 = Card.CardName.Feast;
      List<Card> list1 = Card.filterName(list0, card_CardName1);
      Card.filter(list1, card_Type0);
      List<Card> list2 = Card.createCards();
      Card.CardName card_CardName2 = Card.CardName.GreatHall;
      Card.getCard(list2, card_CardName2);
      card0.getTreasureValue();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockRandom mockRandom0 = (MockRandom)Randomness.random;
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 3, 14, 3);
      card0.toString();
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 2488, 2488, 2488);
      card0.toString();
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2985), 1, 9);
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName1 = Card.CardName.Gardens;
      Card.filterName(list0, card_CardName1);
      card0.toString();
      card0.getCost();
      card0.score((Player) null);
      // Undeclared exception!
      try { 
        Card.Type.valueOf(" \tEstate-VICTORY \t\t Cost: -2985 \t\t Score: 1 \tTreasure Value: 9");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type. \tEstate-VICTORY \t\t Cost: -2985 \t\t Score: 1 \tTreasure Value: 9
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 20, 20, 0);
      card0.getCardName();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.Type.values();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 19, 19, (-1938));
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      // Undeclared exception!
      try { 
        Card.filterName((Iterable<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName.values();
      Card.CardName card_CardName0 = Card.CardName.Silver;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
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
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-3390), (-2009), 1616);
      Card.CardName card_CardName1 = Card.CardName.Smithy;
      Card card1 = new Card(card_CardName1, card_Type0, 0, 0, (-7372));
      card0.compareTo(card1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Duchy;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName1, card_Type0, 1334, 1334, 1334);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName.values();
      // Undeclared exception!
      try { 
        Card.filterObtainable(list0, (GameState) null, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-175), 0, 0);
      card0.getCost();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 1540, (-2182), 1540);
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.ACTION;
      int int0 = (-106);
      int int1 = 11;
      Card card0 = new Card(card_CardName0, card_Type0, (-106), (-106), 11);
      GameState gameState0 = null;
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1383), (-1383), (-1383));
      card0.equals(card0);
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.Type.values();
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(list1, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.createCards();
      List<Card> list0 = Card.createCards();
      GameState gameState0 = null;
      int int0 = 575;
      // Undeclared exception!
      try { 
        Card.filterObtainable(list0, (GameState) null, 575);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.ACTION;
      int int0 = (-2962);
      Card card0 = new Card(card_CardName0, card_Type0, (-2962), (-2447), (-4320));
      // Undeclared exception!
      try { 
        card0.play((Player) null, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      assertEquals(0, list1.size());
      
      List<Card> list2 = Card.filterObtainable(list1, (GameState) null, 0);
      Card.CardName card_CardName1 = Card.CardName.Curse;
      List<Card> list3 = Card.filterName(list2, card_CardName1);
      card0.getCost();
      List<Card> list4 = Card.createCards();
      Card.CardName card_CardName2 = Card.CardName.Adventurer;
      Card card1 = Card.getCard(list0, card_CardName2);
      assertNull(card1);
      
      Card.Type.values();
      Card.CardName card_CardName3 = Card.CardName.Copper;
      Card.getCard(list3, card_CardName3);
      Card.CardName card_CardName4 = Card.CardName.Smithy;
      Card card2 = new Card(card_CardName4, card_Type0, 0, 0, (-1238));
      assertEquals(-1238, card2.getTreasureValue());
      assertEquals(0, card2.getCost());
      
      List<Card> list5 = Card.createCards();
      Card.Type card_Type1 = Card.Type.ACTION;
      Card.filter(list3, card_Type1);
      card0.equals((Object) null);
      Card.Type card_Type2 = Card.Type.VICTORY;
      Card.filter(list3, card_Type2);
      assertFalse(list0.equals((Object)list4));
      assertFalse(list0.equals((Object)list5));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Cutpurse;
      Card.filterName(list0, card_CardName1);
      Card.CardName card_CardName2 = Card.CardName.Gardens;
      Card.getCard(list0, card_CardName2);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.VICTORY;
      int int0 = (-11);
      Card card0 = new Card(card_CardName0, card_Type0, (-3862), (-11), 0);
      Card.createCards();
      List<Card> list0 = Card.createCards();
      Card.Type card_Type1 = Card.Type.TREASURE;
      Card card1 = new Card(card_CardName0, card_Type1, 1512, 0, (-3440));
      card0.compareTo(card1);
      Card.filter(list0, card_Type0);
      List<Card> list1 = Card.createCards();
      Card.filterName(list1, card_CardName0);
      card0.toString();
      card0.getTreasureValue();
      card0.equals(list1);
      // Undeclared exception!
      try { 
        Card.Type.valueOf("2k;,\"-Vka.SZ&");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.2k;,\"-Vka.SZ&
         //
         assertThrownBy("java.lang.Enum", e);
      }
  }
}
