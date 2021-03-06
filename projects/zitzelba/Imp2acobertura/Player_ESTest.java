/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 26 00:25:07 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import org.cs362.dominion.Card;
import org.cs362.dominion.GameState;
import org.cs362.dominion.Player;
//import org.evosuite.runtime.EvoRunner;
//import org.evosuite.runtime.EvoRunnerParameters;
//import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Player_ESTest {

  @Test
  public void test00()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, (String) null);
      player0.discard((Card) null);
  }

  @Test
  public void test01()  throws Throwable  {
      Player player0 = new Player((GameState) null, "Millisecond");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      Card.CardName card_CardName0 = Card.CardName.Market;
      Card.Type card_Type0 = Card.Type.VICTORY;
      Card card0 = new Card(card_CardName0, card_Type0, (-2927), (-2927), (-2927));
      linkedList0.add(card0);
      int int0 = player0.scoreFor();
      assertEquals((-2927), int0);
  }

  @Test
  public void test02()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      player0.initializePlayerTurn();
      Card card0 = player0.drawCard();
      assertTrue(list0.isEmpty());
      assertEquals(0, card0.getTreasureValue());
  }

  @Test
  public void test03()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      Card card0 = player0.drawCard();
      assertEquals(0, list0.size());
      assertEquals(Card.CardName.Gold, card0.getCardName());
  }

  @Test
  public void test04()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      player0.deck = linkedList0;
      Card.CardName card_CardName0 = Card.CardName.Gardens;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, (-2832), (-1360), (-2445));
      linkedList0.add(card0);
      Card card1 = player0.drawCard();
      assertEquals(-2445, card1.getTreasureValue());
  }

  @Test
  public void test05()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      player0.initializePlayerTurn();
      String string0 = player0.toString();
      assertEquals(0, list0.size());
      assertEquals(" --- reshuffle the deck of the player  ---  --- --------------------------- --- Hand: [ \tGold-TREASURE \t\t Cost: 6 \t\t Score: 0 \tTreasure Value: 3,  \tSilver-TREASURE \t\t Cost: 3 \t\t Score: 0 \tTreasure Value: 2,  \tCooper-TREASURE \t\t Cost: 0 \t\t Score: 0 \tTreasure Value: 1,  \tProvince-VICTORY \t\t Cost: 8 \t\t Score: 6 \tTreasure Value: 0,  \tDuchy-VICTORY \t\t Cost: 5 \t\t Score: 3 \tTreasure Value: 0]Discard: []Deck: [ \tEstate-VICTORY \t\t Cost: 2 \t\t Score: 1 \tTreasure Value: 0,  \tCurse-VICTORY \t\t Cost: 0 \t\t Score: -1 \tTreasure Value: 0,  \tBaron-ACTION \t\t Cost: 4 \t\t Score: 0 \tTreasure Value: 0,  \tCutpurse-ACTION \t\t Cost: 4 \t\t Score: 0 \tTreasure Value: 0,  \tGreatHall-ACTION \t\t Cost: 3 \t\t Score: 1 \tTreasure Value: 0,  \tCouncilRoom-ACTION \t\t Cost: 5 \t\t Score: 0 \tTreasure Value: 0,  \tFeast-ACTION \t\t Cost: 4 \t\t Score: 0 \tTreasure Value: 0,  \tAmbassador-ACTION \t\t Cost: 3 \t\t Score: 0 \tTreasure Value: 0,  \tGardens-VICTORY \t\t Cost: 4 \t\t Score: 0 \tTreasure Value: 0,  \tEmbargo-ACTION \t\t Cost: 2 \t\t Score: 0 \tTreasure Value: 0,  \tMarket-ACTION \t\t Cost: 5 \t\t Score: 0 \tTreasure Value: 0,  \tAdventurer-ACTION \t\t Cost: 6 \t\t Score: 0 \tTreasure Value: 0,  \tSmithy-ACTION \t\t Cost: 4 \t\t Score: 0 \tTreasure Value: 0,  \tVillage-ACTION \t\t Cost: 3 \t\t Score: 0 \tTreasure Value: 0,  \tMine-ACTION \t\t Cost: 5 \t\t Score: 0 \tTreasure Value: 0]Played Cards: []numActions: 1coinss: 0numBuys: 1\n", string0);
  }

  @Test
  public void test06()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "\n");
      player0.numActions = 5;
      String string0 = player0.toString();
      assertEquals(" --- \n ---  --- --------------------------- --- Hand: []Discard: []Deck: []Played Cards: []numActions: 5coinss: 0numBuys: 0\n", string0);
  }

  @Test
  public void test07()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      player0.numBuys = (-922);
      player0.buyCard();
  }

  @Test
  public void test08()  throws Throwable  {
      Player player0 = new Player((GameState) null, "MTC>$~+4[H");
      player0.numActions = (-3143);
      player0.playKingdomCard();
  }

  @Test
  public void test09()  throws Throwable  {
      Vector<Card> vector0 = new Vector<Card>();
      GameState gameState0 = new GameState((List<Card>) vector0);
      Player player0 = new Player(gameState0, "");
      Card.CardName card_CardName0 = Card.CardName.CouncilRoom;
      Card.Type card_Type0 = Card.Type.ACTION;
      Card card0 = new Card(card_CardName0, card_Type0, (-1), 6, (-1));
      vector0.add(card0);
      vector0.add(card0);
  //    Random.setNextRandom(1);
      player0.playedCards = (List<Card>) vector0;
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         //assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test10()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, (String) null);
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.scoreFor();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         //assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test11()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "vJy,Mf(");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Player player0 = new Player((GameState) null, "");
      // Undeclared exception!
      try { 
        player0.printStateGame();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         //assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test13()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "\n");
      player0.drawCard();
      player0.numActions = 5;
      // Undeclared exception!
      try { 
        player0.playKingdomCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
//         //assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test
  public void test14()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test15()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "\n");
      // Undeclared exception!
      try { 
        player0.initializePlayerTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test16()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "\n");
      // Undeclared exception!
      try { 
        player0.gainFromBoard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Stack<Card> stack0 = new Stack<Card>();
      GameState gameState0 = new GameState((List<Card>) stack0);
      Player player0 = new Player(gameState0, "\"!Qi|wF#!Eqr?P>>$C");
      boolean boolean0 = player0.gain((Card) null);
      assertTrue(boolean0);
  }

  @Test
  public void test18()  throws Throwable  {
      Player player0 = new Player((GameState) null, "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field)");
      // Undeclared exception!
      try { 
        player0.endTurn();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test19()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "'`@A>a^");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.drawCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("java.util.ComparableTimSort", e);
      }
  }

  @Test
  public void test20()  throws Throwable  {
      Player player0 = new Player((GameState) null, "MTC>$~+4[H");
      Card card0 = player0.drawCard();
      assertNull(card0);
  }

  @Test
  public void test21()  throws Throwable  {
      Player player0 = new Player((GameState) null, (String) null);
      player0.numBuys = 51;
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test22()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      int int0 = player0.scoreFor();
      assertEquals(10, int0);
  }

  @Test
  public void test23()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      player0.initializePlayerTurn();
      int int0 = player0.scoreFor();
      assertEquals(0, list0.size());
      assertEquals(10, int0);
  }

  @Test
  public void test24()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      int int0 = player0.scoreFor();
      assertEquals(0, int0);
  }

  @Test
  public void test25()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "\n");
      player0.printStateGame();
  }

  @Test
  public void test26()  throws Throwable  {
      Player player0 = new Player((GameState) null, "yI]WE'JMP`:&i");
      player0.playTtreasureCard();
  }

  @Test
  public void test27()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Gold");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.endTurn();
      player0.playKingdomCard();
      assertEquals(6, list0.size());
  }

  @Test
  public void test28()  throws Throwable  {
      LinkedList<Card> linkedList0 = new LinkedList<Card>();
      GameState gameState0 = new GameState((List<Card>) linkedList0);
      Player player0 = new Player(gameState0, "\n");
      player0.numActions = 5;
      player0.playKingdomCard();
  }

  @Test
  public void test29()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      gameState0.gameBoard = gameState0.embargoes;
      Player player0 = new Player(gameState0, "Played Cards: ");
      Integer integer0 = new Integer(2235);
      gameState0.embargoes.put((Card) null, integer0);
      boolean boolean0 = player0.gainFromBoard((Card) null);
      assertTrue(boolean0);
  }

  @Test
  public void test30()  throws Throwable  {
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      GameState gameState0 = new GameState((List<Card>) arrayList0);
      Player player0 = new Player(gameState0, "Played Cards: ");
      // Undeclared exception!
      try { 
        player0.gainFromBoard((Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("org.cs362.dominion.Player", e);
      }
  }

  @Test
  public void test31()  throws Throwable  {
      Player player0 = new Player((GameState) null, "\t\t Cost: ");
      Card.CardName card_CardName0 = Card.CardName.Cutpurse;
      Card.Type card_Type0 = Card.Type.TREASURE;
      Card card0 = new Card(card_CardName0, card_Type0, 0, 0, 7);
      player0.gain(card0);
      Card card1 = player0.drawCard();
      assertEquals(7, card1.getTreasureValue());
  }

  @Test
  public void test32()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "Gold");
      player0.discard = list0;
      player0.initializePlayerTurn();
      player0.playTtreasureCard();
      player0.endTurn();
      assertEquals(5, list0.size());
  }

  @Test
  public void test33()  throws Throwable  {
      List<Card> list0 = Card.createCards();
      GameState gameState0 = new GameState(list0);
      Player player0 = new Player(gameState0, "reshuffle the deck of the player ");
      player0.discard = list0;
      player0.initializePlayerTurn();
      // Undeclared exception!
      try { 
        player0.buyCard();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test34()  throws Throwable  {
      Player player0 = new Player((GameState) null, "yI]WE'JMP`:&i");
      player0.buyCard();
  }

  @Test
  public void test35()  throws Throwable  {
      GameState gameState0 = new GameState((List<Card>) null);
      Player player0 = new Player(gameState0, "Player: ");
      player0.drawCard();
      // Undeclared exception!
      try { 
        player0.playTtreasureCard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         //assertThrownBy("org.cs362.dominion.Card", e);
      }
  }
}
