/*
 * This file was automatically generated by EvoSuite
 * Tue Feb 28 04:54:30 GMT 2017
 */

package cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cs362.dominion.Card;
import cs362.dominion.Game;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Game_ESTest extends Game_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Object object0 = new Object();
      game0.getNumPlayers();
      Card card0 = Card.Adventurer;
      game0.supplyCount(card0);
      game0.handCard(4);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer.toUnsignedLong(4);
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.scoreFor(1);
      Integer.getInteger("9L", 3);
      game0.getCurrentPlayer();
      Card card0 = game0.handCard(4);
      game0.fullDeckCount(1, card0);
      game0.getActions();
      Card card1 = Card.Embargo;
      game0.handCount(2, card1);
      game0.handCard(408);
      Card card2 = Card.Gold;
      // Undeclared exception!
      try { 
        game0.buyCard(card2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not enough coins
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.scoreFor(1);
      Card card0 = game0.handCard(4);
      game0.getActions();
      game0.handCount(2, card0);
      game0.handCard(408);
      // Undeclared exception!
      try { 
        game0.buyCard((Card) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // there are no more of that card left
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) game0;
      game0.playTreasure(4);
      objectArray0[1] = (Object) integer0;
      objectArray0[2] = (Object) arrayList0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      objectArray0[4] = (Object) arrayList0;
      objectArray0[5] = (Object) game0;
      objectArray0[0] = (Object) game0;
      // Undeclared exception!
      try { 
        game0.playAction(4, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.isGameOver();
      Integer.toUnsignedLong(4);
      game0.handCard(2603);
      // Undeclared exception!
      try { 
        game0.takeForTesting(1, (Card) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) game0;
      game0.playTreasure(4);
      objectArray0[1] = (Object) integer0;
      objectArray0[2] = (Object) arrayList0;
      Object object0 = new Object();
      objectArray0[4] = (Object) arrayList0;
      objectArray0[2] = (Object) game0;
      objectArray0[0] = (Object) game0;
      game0.numHandCards();
      Card card0 = Card.Feast;
      // Undeclared exception!
      try { 
        game0.handCount(4, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      game0.endTurn();
      game0.playTreasure(2);
      // Undeclared exception!
      try { 
        game0.playTreasure(24);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.reshuffleForTesting((-3));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Integer integer0 = new Integer(4);
      Integer.compare(16, 3010);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Card card0 = Card.Curse;
      game0.supplyCount(card0);
      game0.endTurn();
      game0.handCard((-449));
      game0.supplyCount((Card) null);
      game0.getPhase();
      Random.setNextRandom(4);
      game0.printDeck(0);
      Card card1 = Card.Embargo;
      game0.supplyCount(card1);
      game0.getSupplyCards();
      game0.getNumPlayers();
      // Undeclared exception!
      try { 
        game0.shuffle(30);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 30, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Card card0 = Card.Curse;
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.fullDeckCount(3, card0);
      game0.scoreFor(3);
      // Undeclared exception!
      try { 
        game0.fullDeckCount(4, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Object object0 = new Object();
      game0.getNumPlayers();
      game0.getPhase();
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(3);
      Integer.toUnsignedLong(2204);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.handCard(3);
      // Undeclared exception!
      try { 
        game0.printDeck(2204);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 2204, Size: 3
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Integer integer0 = new Integer(4);
      Game.standardCards();
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Object[] objectArray0 = new Object[0];
      Random.setNextRandom(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer1 = new Integer(8);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer1);
      // Undeclared exception!
      try { 
        game0.scoreFor(6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 6, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Card[] cardArray0 = new Card[4];
      Card card0 = Card.Feast;
      cardArray0[0] = card0;
      Card card1 = Card.Market;
      cardArray0[1] = card1;
      Card card2 = Card.Baron;
      cardArray0[2] = card2;
      Card card3 = Card.Estate;
      cardArray0[3] = card3;
      ArrayList<Card> arrayList0 = Card.list(cardArray0);
      // Undeclared exception!
      try { 
        Game.swap((List<Card>) arrayList0, 0, (-1992));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.getBuys();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) game0;
      game0.playTreasure(4);
      objectArray0[1] = (Object) integer0;
      objectArray0[2] = (Object) arrayList0;
      Object object0 = new Object();
      Integer.sum(4, 1105);
      objectArray0[3] = object0;
      objectArray0[4] = (Object) arrayList0;
      objectArray0[5] = (Object) game0;
      objectArray0[0] = (Object) game0;
      game0.getCoins();
      game0.isGameOver();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.numHandCards();
      // Undeclared exception!
      try { 
        game0.printHand(5);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 5, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Game.swap((List<Object>) null, 1389, (-4));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        Game.swap((List<Object>) linkedList0, 11, (-587));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 11, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      Card card0 = Card.Feast;
      // Undeclared exception!
      try { 
        game0.fullDeckCount((-299), card0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      game0.supplyCount((Card) null);
      game0.handCard(0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) integer0;
      objectArray0[1] = (Object) game0;
      objectArray0[2] = (Object) game0;
      objectArray0[3] = (Object) game0;
      try { 
        Integer.parseUnsignedInt("");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) game0;
      game0.playTreasure(4);
      // Undeclared exception!
      try { 
        game0.playTreasure(0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not a treasure card
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer.toUnsignedLong(4);
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.scoreFor(1);
      game0.getCurrentPlayer();
      game0.shuffle(3);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Game.swap((List<String>) linkedList0, 949, 949);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Object[] objectArray0 = new Object[7];
      objectArray0[2] = (Object) arrayList0;
      Object object0 = new Object();
      objectArray0[3] = object0;
      Integer integer0 = new Integer(2);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.shuffle((-2284));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.GreatHall;
      // Undeclared exception!
      try { 
        game0.takeForTesting((-1082), card0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      // Undeclared exception!
      try { 
        game0.scoreFor((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Card card0 = Card.Curse;
      game0.supplyCount(card0);
      game0.endTurn();
      game0.handCard((-449));
      game0.getCurrentPlayer();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      // Undeclared exception!
      try { 
        game0.printHand((-3684));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      game0.endTurn();
      game0.handCard((-449));
      // Undeclared exception!
      try { 
        game0.printDeck((-449));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Integer integer0 = new Integer((-22));
      Card card0 = Card.Curse;
      Random.setNextRandom((-22));
      Integer integer1 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer1, (List<Card>) arrayList0, integer0);
      game0.buyCard(card0);
      Card card1 = Card.Gardens;
      // Undeclared exception!
      try { 
        game0.buyCard(card1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // you have no buys left
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Integer integer0 = new Integer(3);
      ArrayList<Card> arrayList0 = Game.standardCards();
      int int0 = 993;
      Integer integer1 = new Integer(993);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer1);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) integer1;
      objectArray0[1] = (Object) arrayList0;
      Object object0 = new Object();
      objectArray0[2] = object0;
      // Undeclared exception!
      try { 
        game0.playAction(3, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not an action
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.isGameOver();
      Integer.toUnsignedLong((-12));
      Card card0 = Card.Mine;
      card0.isAction = false;
      game0.takeForTesting(1, card0);
      Card card1 = Card.Province;
      // Undeclared exception!
      try { 
        game0.handCount((-1576), card1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Integer integer0 = new Integer(10);
      Card[] cardArray0 = new Card[8];
      Card card0 = Card.Baron;
      cardArray0[0] = card0;
      Card card1 = Card.Gardens;
      cardArray0[2] = card1;
      Card card2 = Card.Province;
      cardArray0[3] = card2;
      Card card3 = Card.Copper;
      cardArray0[4] = card3;
      Card card4 = Card.Feast;
      cardArray0[5] = card4;
      Card card5 = Card.Feast;
      cardArray0[6] = card5;
      ArrayList<Card> arrayList0 = Card.list(cardArray0);
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // must supply 10 kingdom cards
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      int int0 = 2;
      Integer integer0 = new Integer(2);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.endTurn();
      game0.endTurn();
      game0.endTurn();
      // Undeclared exception!
      try { 
        game0.reshuffleForTesting(1437);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1437, Size: 2
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Integer integer0 = new Integer(1768);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer1 = new Integer((-3858));
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) arrayList0, integer1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // numPlayers must be between 2 and 4
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Integer integer0 = new Integer((-1176));
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = null;
      try {
        game0 = new Game(integer0, (List<Card>) arrayList0, (Integer) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // numPlayers must be between 2 and 4
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Object object0 = new Object();
      game0.endTurn();
      Card card0 = Card.Estate;
      game0.getNumPlayers();
      // Undeclared exception!
      try { 
        game0.takeForTesting(4, card0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 4, Size: 4
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.supplyCount((Card) null);
      Object object0 = new Object();
      Integer.sum((-684), (-684));
      Object object1 = new Object();
      Object object2 = new Object();
      game0.handCard((-895));
      game0.numHandCards();
      game0.getActions();
      game0.getCoins();
      game0.reshuffleForTesting(0);
      Random.setNextRandom(0);
      game0.isGameOver();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = object2;
      // Undeclared exception!
      try { 
        game0.playAction(922, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      Card card0 = Card.GreatHall;
      game0.supplyCount(card0);
      Object object0 = new Object();
      Integer.sum((-684), (-684));
      Object object1 = new Object();
      Object object2 = new Object();
      game0.numHandCards();
      game0.getActions();
      game0.printHand(1);
      game0.getCoins();
      game0.reshuffleForTesting(0);
      Random.setNextRandom(10);
      game0.isGameOver();
      Card card1 = Card.GreatHall;
      // Undeclared exception!
      try { 
        game0.buyCard(card1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not enough coins
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Card card0 = Card.Estate;
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.fullDeckCount(3, card0);
      game0.scoreFor(3);
      Integer integer1 = new Integer((-2139));
      game0.endTurn();
      Integer integer2 = new Integer(3);
      game0.supplyCount(card0);
      Integer.getInteger("H|Of/<rZd&y'8");
      Integer.divideUnsigned(0, 3);
      // Undeclared exception!
      try { 
        game0.playTreasure((-1));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer integer0 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.scoreFor(1);
      game0.getCurrentPlayer();
      game0.handCard(4);
      game0.getActions();
      Card card0 = Card.Embargo;
      game0.handCount(2, card0);
      game0.isGameOver();
      game0.handCard(408);
      // Undeclared exception!
      try { 
        game0.buyCard((Card) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // there are no more of that card left
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Integer integer0 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer0);
      game0.playTreasure(4);
      Card card0 = Card.Estate;
      game0.supplyCount(card0);
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) game0;
      objectArray0[2] = (Object) integer0;
      objectArray0[3] = objectArray0[2];
      // Undeclared exception!
      try { 
        game0.playTreasure(4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Card card0 = Card.Curse;
      Card card1 = Card.Ambassador;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Random.setNextRandom(0);
      Integer integer1 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Game game0 = new Game(integer1, (List<Card>) arrayList0, integer0);
      game0.fullDeckCount(0, card1);
      Integer.getInteger("Fv");
      game0.buyCard(card0);
      game0.getBuys();
      game0.getSupplyCards();
      game0.playTreasure(4);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) integer1;
      objectArray0[1] = (Object) card1;
      // Undeclared exception!
      try { 
        game0.playAction((-817), objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // invalid handPos
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Card card0 = Card.Curse;
      Card card1 = Card.Ambassador;
      int int0 = 4;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Random.setNextRandom(4);
      Integer integer1 = new Integer(4);
      ArrayList<Card> arrayList0 = Game.standardCards();
      Integer.toUnsignedString(4);
      Game game0 = new Game(integer1, (List<Card>) arrayList0, integer0);
      game0.fullDeckCount(0, card1);
      Integer.getInteger("Fv");
      game0.buyCard(card0);
      Integer integer2 = new Integer(4);
      // Undeclared exception!
      try { 
        game0.playTreasure(4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not a treasure card
         //
         verifyException("cs362.dominion.Game", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ArrayList<Card> arrayList0 = Game.standardCards();
      Card card0 = Card.Curse;
      Integer integer0 = new Integer(4);
      Integer integer1 = new Integer(4);
      Game game0 = new Game(integer0, (List<Card>) arrayList0, integer1);
      game0.getPhase();
      Object[] objectArray0 = new Object[6];
      game0.printDeck(0);
      objectArray0[3] = (Object) game0;
      objectArray0[4] = (Object) arrayList0;
      objectArray0[5] = (Object) card0;
      // Undeclared exception!
      try { 
        game0.playAction(0, objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // not an action
         //
         verifyException("cs362.dominion.Game", e);
      }
  }
}
