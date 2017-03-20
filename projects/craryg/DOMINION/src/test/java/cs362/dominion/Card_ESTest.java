/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:34:00 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.GameState;
import cs362.dominion.Player;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "\tTreasure Value: ");
      int int0 = card0.score(player0);
      assertEquals(0, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, (-3149), 0);
      PriorityQueue<Card> priorityQueue0 = new PriorityQueue<Card>((Comparator<? super Card>) null);
      List<Card> list0 = Card.filter(priorityQueue0, card_Type0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      int int0 = card0.score(player0);
      assertEquals(0, card0.getCost());
      assertEquals((-3149), int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 44, 57, 44);
      int int0 = card0.getTreasureValue();
      assertEquals(44, card0.getCost());
      assertEquals(44, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-1250), 20, (-1094));
      int int0 = card0.getTreasureValue();
      assertEquals((-1094), int0);
      assertEquals(-1250, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      int int0 = card0.getCost();
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2953), (-2953), 1364);
      int int0 = card0.getCost();
      assertEquals(1364, card0.getTreasureValue());
      assertEquals((-2953), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 4464, 4464, 4464);
      card0.getCardName();
      assertEquals(4464, card0.getTreasureValue());
      assertEquals(4464, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cooper;
      Card card0 = Card.getCard(list0, card_CardName0);
      //  // Unstable assertion: assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Estate;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-678), (-269), (-678));
      Vector<Card> vector0 = new Vector<Card>();
      vector0.add(card0);
      Card.getCard(vector0, card_CardName0);
      assertEquals("[ \tEstate-VICTORY \t\t Cost: -678 \t\t Score: -269 \tTreasure Value: -678]", vector0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, 30, (-1052), 0);
      Card.CardName card_CardName1 = Card.CardName.Ambassador;
      Card card1 = new Card(card_CardName1, card_Type0, (-1052), 0, 4068);
      int int0 = card1.compareTo(card0);
      assertEquals(-1052, card1.getCost());
      assertEquals(4068, card1.getTreasureValue());
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName1, card_Type0, 1, 5, 5);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      vector0.add(0, (Card) null);
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      // Undeclared exception!
      try { 
        Card.getCard(vector0, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter((Iterable<Card>) null, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      assertEquals(20, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      // Undeclared exception!
      try { 
        Card.countCardName((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.getCard(list0, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1990), (-1990), (-1990));
      assertEquals(-1990, card0.getCost());
      assertEquals(-1990, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      boolean boolean0 = card0.equals(card0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2075), (-2075), 163);
      boolean boolean0 = card0.equals(card_CardName0);
      assertEquals(-2075, card0.getCost());
      assertEquals(163, card0.getTreasureValue());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      Card card0 = Card.getCard(linkedList0, card_CardName0);
      assertNull(card0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = new Card(card_CardName0, card_Type0, 3195, 3195, 3195);
      card0.getCardName();
      assertEquals(3195, card0.getCost());
      assertEquals(3195, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.ACTION;
      List<Card> list1 = Card.filter(list0, card_Type0);
      //  // Unstable assertion: assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "4wY1aS.a:");
      player0.hand = list0;
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "4wY1aS.a:");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 4464, 4464, 4464);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[+Ht}vL");
      gameState0.addPlayer(player0);
      player0.discard = list0;
      card0.play(player0, gameState0);
      assertEquals(4464, card0.getTreasureValue());
      assertEquals(4464, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 4464, 4464, 4464);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[+Ht}vL");
      gameState0.addPlayer(player0);
      Player player1 = new Player(gameState0, "[+Ht}vL");
      player1.discard = list0;
      card0.play(player1, gameState0);
      assertEquals(4464, card0.getCost());
      assertEquals(4464, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 4464, 4464, 4464);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[+Ht}vL");
      player0.discard = list0;
      card0.play(player0, gameState0);
      assertEquals(4464, card0.getCost());
      assertEquals(4464, card0.getTreasureValue());
      
      int int0 = Card.countCardName(list0, card_CardName0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-2240), (-2240), (-2240));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      player0.gain(card0, false);
      player0.drawCard();
      card0.play(player0, gameState0);
      assertEquals(-2240, card0.getCost());
      assertEquals(-2240, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2245), (-2245), 3);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      player0.gain(card0, false);
      player0.drawCard();
      card0.play(player0, gameState0);
      assertEquals(-2245, card0.getCost());
      assertEquals(3, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-2240), (-2240), (-2240));
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
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
         assertThrownBy("cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Feast;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 46, 0, (-1));
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "\tTreasure Value: ");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, (String) null);
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2245), (-2245), 3);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(3, card0.getTreasureValue());
      assertEquals(-2245, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Garden;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 12, (-1849), (-1849));
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, " \tGarden-VICTORY \t\t Cost: 12 \t\t Score: -1849 \tTreasure Value: -1849");
      card0.play(player0, gameState0);
      assertEquals(-1849, card0.getTreasureValue());
      assertEquals(12, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1637), 12, 0);
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "*5S.r~`uzW-{3W");
      // Undeclared exception!
      try { 
        card0.play(player0, (GameState) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-1637), 0, 0);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, " \tVillage-VICTORY \t\t Cost: -1637 \t\t Score: 0 \tTreasure Value: 0");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(-1637, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 0);
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "m4a.(d[a8_M\")");
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Duchy;
      int int0 = Card.countCardName(list0, card_CardName0);
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, 4464, 4464, 0);
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "[+Ht}vL");
      player0.discard = list0;
      card0.play(player0, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(4464, card0.getCost());
  }
}