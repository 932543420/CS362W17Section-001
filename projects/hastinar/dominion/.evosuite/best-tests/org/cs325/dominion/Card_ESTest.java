/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 14 08:47:44 GMT 2017
 */

package org.cs325.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;
import org.cs325.dominion.Card;
import org.cs325.dominion.GameState;
import org.cs325.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.valueOf("Estate");
      assertEquals(Card.CardName.Estate, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.Type[] card_TypeArray0 = Card.Type.values();
      assertNotNull(card_TypeArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Card.Type.valueOf(" \tAdventurer-ACTION \t\t Cost: 0 \t\t Score: 0 \tTreasure Value: 0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs325.dominion.Card.Type. \tAdventurer-ACTION \t\t Cost: 0 \t\t Score: 0 \tTreasure Value: 0
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName[] card_CardNameArray0 = Card.CardName.values();
      assertNotNull(card_CardNameArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Trash a Treasure Card. Gain Next Level of Treasure Card ");
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getScore());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = new Card(card_CardName0, card_Type0, 15, 8, 1879);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.drawCard();
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 338, (-778));
      Player player0 = new Player((GameState) null, "+1 Card, +1 Action, +1 Victory Point");
      int int0 = card0.score(player0);
      assertEquals(0, card0.getCost());
      assertEquals(-778, card0.getTreasureValue());
      assertEquals(338, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-3208), (-3208), (-3208));
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "YK<|BO2@Xcjwm/ hB");
      int int0 = card0.score(player0);
      assertEquals((-3208), int0);
      assertEquals(-3208, card0.getCost());
      assertEquals(-3208, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card card0 = new Card(card_CardName0, (Card.Type) null, (-233), (-233), (-233));
      card0.getType();
      assertEquals(-233, card0.getScore());
      assertEquals(-233, card0.getCost());
      assertEquals(-233, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardends;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getScore());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-680), (-10), (-10));
      int int0 = card0.getTreasureValue();
      assertEquals(-680, card0.getCost());
      assertEquals(-10, card0.getScore());
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      List<Card> list0 = Card.createCards();
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getScore();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4, card0.getCost());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-208), (-208), (-307));
      int int0 = card0.getScore();
      assertEquals(-208, card0.getCost());
      assertEquals((-208), int0);
      assertEquals(-307, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 1, 1, 1);
      int int0 = card0.getCost();
      assertEquals(1, card0.getScore());
      assertEquals(1, int0);
      assertEquals(1, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertEquals(1, card0.getScore());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(5, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-680), (-10), (-10));
      Vector<Card> vector0 = new Vector<Card>();
      vector0.add(card0);
      Card.getCard(vector0, card_CardName0);
      assertEquals("[ \tBaron-TREASURE \t\t Cost: -680 \t\t Score: -10 \tTreasure Value: -10]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-446), 0, (-446));
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card card1 = new Card(card_CardName1, card_Type0, 0, (-446), 511);
      int int0 = card0.compareTo(card1);
      assertEquals(511, card1.getTreasureValue());
      assertEquals(-446, card0.getCost());
      assertEquals(2, int0);
      assertEquals(0, card1.getCost());
      assertEquals(-446, card1.getScore());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-446), 0, (-446));
      Card.CardName card_CardName1 = Card.CardName.Silver;
      Card card1 = new Card(card_CardName1, card_Type0, 0, (-446), 511);
      int int0 = card1.compareTo(card0);
      assertEquals(511, card1.getTreasureValue());
      assertEquals(-446, card0.getCost());
      assertEquals(-446, card1.getScore());
      assertEquals(0, card1.getCost());
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = new Card(card_CardName0, card_Type0, 6, 8, 1879);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      player0.hand = (List<Card>) vector0;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 0
         //
         verifyException("java.util.Vector", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 10, 10, 10);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      List<Card> list0 = linkedList0.subList(0, 0);
      linkedList0.add(card0);
      // Undeclared exception!
      try { 
        Card.filter(list0, card_Type0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.VICTORY;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 19, 2811, 2811);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      boolean boolean0 = card0.equals(card0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getScore());
      assertEquals(4, card0.getCost());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1155), 6, 184);
      List<Card> list0 = Card.createCards();
      boolean boolean0 = card0.equals(list0);
      assertFalse(boolean0);
      assertEquals(6, card0.getScore());
      assertEquals(-1155, card0.getCost());
      assertEquals(184, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      List<Card> list0 = Card.createCards();
      List<Card> list1 = Card.filter(list0, card_Type0);
      assertEquals(3, list1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      TreeSet<Card> treeSet0 = new TreeSet<Card>((Comparator<? super Card>) null);
      List<Card> list0 = Card.filter(treeSet0, card_Type0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-680), (-10), (-10));
      Card.CardName card_CardName1 = card0.getCardName();
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      Card.getCard(arrayList0, card_CardName1);
      assertEquals(-10, card0.getScore());
      assertEquals(-680, card0.getCost());
      assertEquals(-10, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      String string0 = card0.toString();
      assertEquals(" \tAdventurer-ACTION \t\t Cost: 0 \t\t Score: 0 \tTreasure Value: 0", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 4, 4, 4);
      int int0 = card0.getTreasureValue();
      assertEquals(4, card0.getScore());
      assertEquals(4, card0.getCost());
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card card0 = new Card(card_CardName0, (Card.Type) null, (-233), (-233), (-233));
      card0.compareTo(card0);
      assertEquals(-233, card0.getTreasureValue());
      assertEquals(-233, card0.getCost());
      assertEquals(-233, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getType();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      Random.setNextRandom(2545);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "+2 Coins, Trash this Card, Place Embargo token on a supply pile");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(2, card0.getCost());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1792, 1792, 1792);
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>();
      ArrayList<Card> arrayList0 = new ArrayList<Card>((Collection<? extends Card>) priorityQueue0);
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      arrayList0.add(card0);
      Player player0 = new Player(gameState0, "R?k\"Py~l&Z_`0QPeB ");
      card0.play(player0, gameState0);
      assertEquals(1792, card0.getScore());
      assertEquals(1792, card0.getCost());
      assertEquals(1792, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1807, 1807, 1807);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "R?k\"Py~l&Z_`0aQPeI ");
      card0.play(player1, gameState0);
      assertEquals(1807, card0.getScore());
      assertEquals(1807, card0.getCost());
      assertEquals(1807, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1807, 1807, 1807);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(1807, card0.getTreasureValue());
      assertEquals(1807, card0.getScore());
      assertEquals(1807, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1622), (-1622), (-1622));
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "'Q Ehs!fkB");
      player0.discard = list0;
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
      assertEquals(-1622, card0.getCost());
      assertEquals(-1622, card0.getScore());
      assertEquals(-1622, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1622), (-1622), (-1622));
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "'Q Ehs!fkB");
      player0.discard = list0;
      gameState0.addPlayer((Player) null);
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs325.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1622), (-233), (-233));
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "'Q Ehs!fkB");
      player0.discard = list0;
      card0.play(player0, gameState0);
      assertEquals(-233, card0.getTreasureValue());
      assertEquals(-1622, card0.getCost());
      assertEquals(-233, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Trash a Treasure Card. Gain Next Level of Treasure Card ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getScore());
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Trash a Treasure Card. Gain Next Level of Treasure Card ");
      card0.play(player0, gameState0);
      assertEquals(-1, card0.getScore());
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, "9cp;rC)-I}ENg7vT`H");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getScore());
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 1133, 1133, 1133);
      card0.play(player0, gameState0);
      assertEquals(1133, card0.getTreasureValue());
      assertEquals(1133, card0.getScore());
      assertEquals(1133, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.GreatHall;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 6, 6, 6);
      Player player0 = new Player((GameState) null, "--");
      card0.play(player0, (GameState) null);
      assertEquals(6, card0.getTreasureValue());
      assertEquals(6, card0.getCost());
      assertEquals(6, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gardends;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "9cp;rC)-I}ENg7vT`H");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getScore());
      assertEquals(4, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = new Card(card_CardName0, card_Type0, 6, 8, 1879);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Trash a Treasure Card. Gain Next Level of Treasure Card ");
      LinkedList<Card> linkedList0 = new LinkedList<Card>((Collection<? extends Card>) gameState0.cards);
      player0.deck = linkedList0;
      card0.play(player0, gameState0);
      card0.play(player0, gameState0);
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(6, card0.getCost());
      assertEquals(0, card0.getScore());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1173), 15, 184);
      int int0 = card0.getCost();
      assertEquals((-1173), int0);
      assertEquals(15, card0.getScore());
      assertEquals(184, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Copper;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "=RS>N");
      int int0 = card0.score(player0);
      assertEquals(1, card0.getTreasureValue());
      assertEquals(0, int0);
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1155), 6, 184);
      int int0 = card0.getScore();
      assertEquals(184, card0.getTreasureValue());
      assertEquals(6, int0);
      assertEquals(-1155, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Laboratory;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 17, 17, 374);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "org.apache.oro.io.GlobFilenameFilter");
      player0.discard = list0;
      card0.play(player0, gameState0);
      assertEquals(17, card0.getCost());
      assertEquals(17, card0.getScore());
      assertEquals(374, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 10, 10, 10);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "Province");
      card0.play(player0, gameState0);
      assertEquals(10, card0.getTreasureValue());
      assertEquals(10, card0.getCost());
      assertEquals(10, card0.getScore());
  }
}
