/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 06:52:17 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Card_ESTest extends Card_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "v|");
      player0.hand = list0;
      player0.discard(card0);
      card0.play(player0, gameState0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card.Type.valueOf("VICTORY");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card.CardName.valueOf("Village");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Card.Type.values();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card.CardName.values();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "')p;w}2=@P");
      Player player1 = player0.clone();
      player1.discard = gameState0.cards;
      card0.play(player1, gameState0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.score();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Gold;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getTreasureValue();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getCost();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Province;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.score();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.compareTo(card0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Gold;
      Card card1 = Card.getCard(list0, card_CardName1);
      card0.compareTo(card1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      Card.CardName card_CardName1 = Card.CardName.Smithy;
      Card card1 = Card.getCard(list0, card_CardName1);
      card0.compareTo(card1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "zGOA&V=");
      Vector<Player> vector0 = new Vector<Player>();
      gameState0.players = (List<Player>) vector0;
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
  public void test14()  throws Throwable  {
      Card.CardName card_CardName0 = Card.CardName.Silver;
      // Undeclared exception!
      try { 
        Card.getCard((List<Card>) null, card_CardName0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.equals(card0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      Object object0 = new Object();
      card0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card.filter(list0, card_Type0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashSet<Card> hashSet0 = new HashSet<Card>(0);
      hashSet0.add((Card) null);
      Card.Type card_Type0 = Card.Type.ACTION;
      // Undeclared exception!
      try { 
        Card.filter(hashSet0, card_Type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<Card, Player> hashMap0 = new HashMap<Card, Player>();
      Set<Card> set0 = hashMap0.keySet();
      Card.Type card_Type0 = Card.Type.ACTION;
      Card.filter(set0, card_Type0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getType();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      String string0 = card0.toString();
      // Undeclared exception!
      try { 
        Card.Type.valueOf(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.cs362.dominion.Card.Type.Curse
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      card0.getCardName();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "v|");
      Card.getCard(player0.hand, card_CardName0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodel;
      GameState gameState0 = new GameState(list0);
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, " --- ");
      player0.hand = list0;
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
  public void test25()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Feast;
      GameState gameState0 = new GameState(list0);
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, " Gained 2 extra actions.");
      player0.hand = gameState0.cards;
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
  public void test26()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "J");
      gameState0.addPlayer(player0);
      player0.hand = list0;
      // Undeclared exception!
      card0.play(player0, gameState0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "zGOA&V=");
      gameState0.addPlayer(player0);
      card0.play(player0, gameState0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Council_Room;
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player((GameState) null, "");
      player0.discard = list0;
      GameState gameState0 = new GameState(list0);
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
  public void test29()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Adventurer;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      player0.hand = list0;
      player0.playTtreasureCard();
      // Undeclared exception!
      card0.play(player0, gameState0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      card0.play((Player) null, gameState0);
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.getCost());
      assertEquals(-1, card0.score());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Village;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Fr");
      card0.play(player0, gameState0);
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.score());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "/4s,Sn");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Smithy;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "V");
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ComparableTimSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Remodel;
      GameState gameState0 = new GameState(list0);
      Card card0 = Card.getCard(list0, card_CardName0);
      Player player0 = new Player(gameState0, " --- ");
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
  public void test35()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Great_Hall;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "FZ");
      card0.play(player0, gameState0);
      assertEquals(3, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, card0.score());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Embargo;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "");
      card0.play(player0, gameState0);
      assertEquals(0, card0.score());
      assertEquals(2, card0.getCost());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Baron;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "J");
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
  public void test38()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.score();
      assertEquals(3, card0.getCost());
      assertEquals(0, int0);
      assertEquals(0, card0.getTreasureValue());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "OUaw5/(");
      player0.hand = list0;
      // Undeclared exception!
      try { 
        card0.play(player0, gameState0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getTreasureValue();
      assertEquals(0, card0.score());
      assertEquals(0, int0);
      assertEquals(3, card0.getCost());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Mine;
      Card card0 = Card.getCard(list0, card_CardName0);
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "=%:fr");
      Integer integer0 = new Integer(3);
      gameState0.gameBoard.put(card0, integer0);
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
  public void test42()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Steward;
      Card card0 = Card.getCard(list0, card_CardName0);
      // Undeclared exception!
      try { 
        card0.compareTo((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Curse;
      Card card0 = Card.getCard(list0, card_CardName0);
      int int0 = card0.getCost();
      assertEquals(0, card0.getTreasureValue());
      assertEquals(0, int0);
      assertEquals(-1, card0.score());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      Card.CardName card_CardName0 = Card.CardName.Ambassador;
      Card card0 = Card.getCard(list0, card_CardName0);
      assertNotNull(card0);
      
      Card card1 = (Card)card0.clone();
      assertEquals(3, card1.getCost());
      assertEquals(0, card1.score());
      assertEquals(0, card1.getTreasureValue());
  }
}
