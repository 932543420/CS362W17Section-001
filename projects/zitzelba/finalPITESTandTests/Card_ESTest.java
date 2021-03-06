/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 21:05:18 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
//import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Card_ESTest  {

  @Test
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-2021), 19, (-2021));
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) treeSet0);
      linkedList0.add(card0);
      assertEquals(-2021, card0.getTreasureValue());
      assertEquals(-2021, card0.getCost());
      
      Card.CardName card_CardName1 = Card.CardName.Adventurer;
      List<Card> list0 = Card.filterName(linkedList0, card_CardName1);
      assertTrue(list0.isEmpty());
  }

  @Test
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 27, 2568, 2568);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, (String) null);
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(list0, card_CardName0);
  }

  @Test
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.score((Player) null);
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test
  public void test04()  throws Throwable  {
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(treeSet0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = new Card(card_CardName0, card_Type0, (-1846), (-1492), (-1492));
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Feast");
      int int0 = card0.score(player0);
      assertEquals(-1492, card0.getTreasureValue());
      assertEquals(-1846, card0.getCost());
      assertEquals((-1492), int0);
  }

  @Test
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, int0);
      assertEquals(0, card0.getCost());
  }

  @Test
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 10, 3233, 10);
      int int0 = card0.getTreasureValue();
      assertEquals(10, int0);
      assertEquals(10, card0.getCost());
  }

  @Test
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1039, (-2536), 1999);
      int int0 = card0.getCost();
      assertEquals(1999, card0.getTreasureValue());
      assertEquals(1039, int0);
  }

  @Test
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-3168), (-3168), 1);
      int int0 = card0.getCost();
      assertEquals((-3168), int0);
      assertEquals(1, card0.getTreasureValue());
  }

  @Test
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      card0.getCardName();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test
  public void test11()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) treeSet0);
      Card card0 = Card.getCard(linkedList0, card_CardName0);
      assertNull(card0);
  }

  @Test
  public void test12()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4374, 58, (-2276));
      vector0.add(card0);
      Card.getCard(vector0, card_CardName0);
      assertEquals("[ \tSilver-TREASURE \t\t Cost: 4374 \t\t Score: 58 \tTreasure Value: -2276]", vector0.toString());
  }

  @Test
  public void test13()  throws Throwable  {
//      List<Card> list0 = Card.createCards();
//      Card.CardName card_CardName0 = Card.CardName.Cooper;
//      Card card0 = Card.getCard(list0, card_CardName0);
//      assertNull(card0);
  }

  @Test
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1321), 0, 0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add(card0);
      Card card1 = Card.getCard(linkedList0, card_CardName0);
      assertNotNull(card1);
      assertEquals(0, card1.getTreasureValue());
      assertEquals(-1321, card1.getCost());
  }

  @Test
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 2811, (-317), 2811);
      boolean boolean0 = card0.equals(card0);
      assertEquals(2811, card0.getCost());
      assertEquals(2811, card0.getTreasureValue());
      assertTrue(boolean0);
  }

  @Test
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      Card.CardName card_CardName1 = Card.CardName.Province;
      Card card1 = new Card(card_CardName1, card_Type0, 8, 8, 8);
      int int0 = card0.compareTo(card1);
      assertEquals(9, int0);
      assertEquals(12, card0.getCost());
      assertEquals(12, card0.getTreasureValue());
  }

  @Test
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 27, 2568, 2568);
      Card.CardName card_CardName1 = Card.CardName.Ambassador;
      Card card1 = new Card(card_CardName1, card_Type0, 2568, 15, 2378);
      int int0 = card0.compareTo(card1);
      assertEquals((-8), int0);
      assertEquals(2378, card1.getTreasureValue());
      assertEquals(2568, card1.getCost());
  }

  @Test
  public void test18()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      // Undeclared exception!
      try { 
        Card.filterObtainable(list0, gameState0, 122);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Market;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
 //        assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) treeSet0);
      linkedList0.add((Card) null);
      // Undeclared exception!
      try { 
        Card.filterName(linkedList0, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
 //        assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test21()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
 //        assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card card0 = new Card(card_CardName0, card_Type0, 172, 13, 172);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
 //        assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 14, 14, 14);
      card0.getType();
      assertEquals(14, card0.getCost());
      assertEquals(14, card0.getTreasureValue());
  }

  @Test
  public void test24()  throws Throwable  {
      TreeSet<Card> treeSet0 = new TreeSet<Card>();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list0 = Card.filter(treeSet0, card_Type0);
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = new Card(card_CardName0, card_Type0, 1507, 1507, 1507);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Feast");
      int int0 = card0.score(player0);
      assertEquals(1507, card0.getCost());
      assertEquals(1507, int0);
      assertEquals(1507, card0.getTreasureValue());
  }

  @Test
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 57, 57, 57);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Smithy");
      card0.play(player0, gameState0);
      assertEquals(57, card0.getTreasureValue());
      assertEquals(57, card0.getCost());
  }

  @Test
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 57, 57, 57);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "!^LaB*oO>");
      card0.play(player0, gameState0);
      assertEquals(57, card0.getCost());
      assertEquals(57, card0.getTreasureValue());
  }

  @Test
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
  }

  @Test
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-697), 15, 6);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, ":]P");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
//         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test29()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "HK[05%=$SHX^g(SIv$");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
//         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "HK[05%=$SHX^g(SIv$");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
//         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Ova#_5x1?Ctf%)yj");
      gameState0.addPlayer(player0);
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test32()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Ova#_5x1?Ctf%)yj");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test33()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-215), (-2586), (-2586));
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Year");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(-2586, card0.getTreasureValue());
      assertEquals(-215, card0.getCost());
  }

  @Test
  public void test34()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card card0 = new Card(card_CardName0, card_Type0, 14, 1792, 1792);
      Player player0 = new Player(gameState0, "Embargo");
      player0.hand = list0;
      card0.play(player0, gameState0);
      assertEquals(19, list0.size());
      assertEquals(1792, card0.getTreasureValue());
  }

  @Test
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 14, 14, 14);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "\"B]zxcC;g|");
      card0.play(player0, gameState0);
      assertEquals(14, card0.getCost());
      assertEquals(14, card0.getTreasureValue());
  }

  @Test
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "P2layer(");
      player0.discard = list0;
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.getCard(list0, card_CardName0);
  }

  @Test
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "P2layer(");
      player0.discard = list0;
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.getCard(list0, card_CardName0);
  }

  @Test
  public void test38()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "HK[05%=$SHX^g(SIv$");
      card0.play(player0, gameState0);
      assertEquals(12, card0.getCost());
      assertEquals(12, card0.getTreasureValue());
  }

  @Test
  public void test39()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card card0 = new Card(card_CardName0, card_Type0, (-911), 2887, (-911));
      int int0 = card0.getTreasureValue();
      assertEquals(-911, card0.getCost());
      assertEquals((-911), int0);
  }

  @Test
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      // Undeclared exception!
      try { 
        Card.filterObtainable(list0, gameState0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
 //        assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test41()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      List<Card> list0 = Card.filterObtainable(vector0, gameState0, 2568);
      assertEquals(0, list0.size());
  }

  @Test
  public void test42()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      linkedList0.add(card0);
      assertEquals(12, card0.getTreasureValue());
      assertEquals(12, card0.getCost());
      
      List<Card> list0 = Card.filterName(linkedList0, card_CardName0);
      assertFalse(list0.isEmpty());
  }

  @Test
  public void test43()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 12, 12, 12);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      boolean boolean0 = card0.equals(linkedList0);
      assertEquals(12, card0.getCost());
      assertEquals(12, card0.getTreasureValue());
      assertFalse(boolean0);
  }

  @Test
  public void test44()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list1 = Card.filter(list0, card_Type0);
      //  // Unstable assertion: assertEquals(0, list1.size());
  }

  @Test
  public void test45()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 27, 2568, 2568);
      card0.compareTo(card0);
      assertEquals(27, card0.getCost());
      assertEquals(2568, card0.getTreasureValue());
  }

  @Test
  public void test46()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 27, 2568, 2568);
      try { 
        card0.clone();
        fail("Expecting exception: CloneNotSupportedException");
      
      } catch(CloneNotSupportedException e) {
         //
         // org.cs362.dominion.Card
         //
 //        assertThrownBy("java.lang.Object", e);
      }
  }

  @Test
  public void test47()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = new Card(card_CardName0, (Card.Type) null, 14, 14, 14);
      Player player0 = new Player((GameState) null, "CN");
      // Undeclared exception!
      try { 
        card0.play(player0, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }
}
